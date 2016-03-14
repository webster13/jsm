package com.webster.jsm.core.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 登录控制器
 * Created by Webster on 16/3/13.
 */
@Controller
@RequestMapping(value = "/")
public class LoginController  {


    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    /**
     * 首页
     */
    @RequestMapping( method = RequestMethod.GET)
    public String index() {
        return "redirect:/admin" ;
    }


    /**
     * 登录窗口
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        Subject currentUser = SecurityUtils.getSubject();
        //如果是已认证的则跳转admin,如果是remembered,则不会跳转
        if(currentUser.isAuthenticated()){
            logger.debug("已有用户{},跳转admin主页",currentUser.getPrincipal());
            return "redirect:/admin" ;
        }
        return "login";
    }


    /**
     * 登录检查
     * 具体实现由Shiro的实现由FormAuthenticationFilter提供提供
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginCheck() {
        logger.debug("进行登陆检查");
        return "login";

    }

    /**
     * 登出
     * 具体实现由Shiro提供
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout() {
        logger.debug("登出");
        return "login";


    }

}
