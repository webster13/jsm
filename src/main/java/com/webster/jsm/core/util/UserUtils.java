package com.webster.jsm.core.util;


import com.webster.jsm.core.entity.User;
import com.webster.jsm.core.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;
import java.security.Principal;

/**
 * todo
 * Created by Webster on 16/3/14.
 */
public class UserUtils {
    @Resource
    public static UserService userService;

    /**
     * 获取当前登录者对象
     */
    public static Principal getPrincipal() {

        Subject subject = SecurityUtils.getSubject();
        Principal principal = (Principal) subject.getPrincipal();
        if (principal != null) {
            return principal;
        }
        return null;
    }

    /**
     * 获取当前用户
     * @return 取不到返回 new User()
     */
    public static User getUser(){
        Principal principal = getPrincipal();
        if (principal!=null){
            User user = userService.selectByPrimaryKey(getPrincipal());
            if (user != null){
                return user;
            }
            return new User();
        }
        // 如果没有登录，则返回实例化空的User对象。
        return new User();
    }
}
