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
@RequestMapping(value = "/")
public class UserController extends BaseController {


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    /**
     * 登录窗口
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        /*todo 判断用户已登录,则跳转首页*/
        logger.debug("进入登陆页");
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
        logger.debug("进入登陆页");
        return "login";


    }

    /**
     * 注册窗口
     */
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        logger.debug("显示注册页");
        return "user/register";
    }


    /**
     * 注册检查
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String registerCheck() {
        logger.debug("进行注册检查");
        return "user/register";

    }
}
