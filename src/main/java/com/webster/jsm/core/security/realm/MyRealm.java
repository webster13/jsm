package com.webster.jsm.core.security.realm;

import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * 自定义Realm，相当于Shiro和数据库之间的dao
 */
public class MyRealm extends AuthorizingRealm {

    @Resource
    UserService userService;
    private final static Logger logger = LoggerFactory.getLogger(MyRealm.class);

    /**
     * 回调函数,用于权限验证
     *
     * @param principals 用户名
     * @return 验证信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        String currentUsername = (String) super.getAvailablePrincipal(principals);
        List<String> roleList = new ArrayList<>();
        List<String> permissionList = new ArrayList<>();
        return null;
    }

    /**
     * 回调函数,用于登录验证，通过LearnerService查找数据库
     *
     * @param token 钥匙
     * @return 验证信息
     * @throws AuthenticationException 无法验证的异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String name = (String) token.getPrincipal();
        logger.debug("登录验证.....");

        User user = userService.selectByUsername(name);

        if (user == null) {
            logger.debug("登录失败: 帐号不存在");
            throw new UnknownAccountException();
        }
        // 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配  
        return new SimpleAuthenticationInfo(
                user.getUsername(), // 用户名
                user.getPassword(), // 密码
                ByteSource.Util.bytes(user.getUsername() + user.getSalt()),// salt=username+salt
                getName() // realm name
        );

    }


}