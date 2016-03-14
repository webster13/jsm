package com.webster.jsm.core.security.filter;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * 用于多次输错密码锁定登录的
 *
 * 通过EHCache配置的passwordRetryCache缓存，记录登录次数，见config/ehcache.xml
 * passwordRetryCache缓存配置的记录时间是10分钟，10分钟后缓存消失，可以登录
 */
public class RetryLimitHashedCredentialsMatcher extends
        HashedCredentialsMatcher {

    private final static Logger logger = LoggerFactory.getLogger(RetryLimitHashedCredentialsMatcher.class);

    private Cache<String, AtomicInteger> passwordRetryCache;

    public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token,
                                      AuthenticationInfo info) {
        logger.debug("============={}=============", "错误次数检查");

        String username = (String) token.getPrincipal();
        // retry count + 1
        AtomicInteger retryCount = passwordRetryCache.get(username);

        if (retryCount == null) {
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(username, retryCount);
        }
        if (retryCount.incrementAndGet() > 5) {
            // if retry count > 5 throw
            throw new ExcessiveAttemptsException();
        }

        boolean matches = super.doCredentialsMatch(token, info);
        if (matches) {
            // clear retry count
            passwordRetryCache.remove(username);
        }
        logger.debug("记录错误次数...共输错{}次", retryCount);
        return matches;
    }
}
