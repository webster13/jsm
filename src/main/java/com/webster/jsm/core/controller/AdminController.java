package com.webster.jsm.core.controller;

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
@RequestMapping(value = "admin")
public class AdminController  {


    private final static Logger logger = LoggerFactory.getLogger(AdminController.class);


    /**
     * 首页，直接进入admin管理首页
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        logger.debug("进入admin首页");
        return "admin/admin";
    }






}
