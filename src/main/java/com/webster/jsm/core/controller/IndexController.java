package com.webster.jsm.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 首页
 * Created by Webster on 16/3/13.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController extends BaseController {


    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);


    @RequestMapping( method = RequestMethod.GET)
    public String login() {
        return "index";
    }


    @RequestMapping( value = "admin",method = RequestMethod.GET)
    public String adminIndex() {
        logger.debug("返回admin首页");
        return "admin/admin";
    }




}
