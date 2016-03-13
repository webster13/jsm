package com.webster.jsm.core.controller;

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
@RequestMapping(value = "admin/user")
public class UserController extends BaseController {


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        /*todo 判断用户已登录,则跳转首页*/
        logger.debug("返回登陆页");
        return "admin/user/login";
    }

    /*登录的实现由FormAuthenticationFilter提供*/
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPost() {
        logger.debug("返回登陆页");
        return "admin/user/login";

    }

    /*登出的实现由Shiro提供*/
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout() {
        logger.debug("返回admin首页");
        return "admin/admin";


    }


}
