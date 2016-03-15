package com.webster.jsm.module.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 管理页
 * Created by Webster on 16/3/13.
 */
@Controller
@RequestMapping(value = "admin/user")
public class UserController {


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    /**
     * 首页，直接进入admin管理首页
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        logger.debug("进入user首页");
        return "admin/user/user";
    }






}
