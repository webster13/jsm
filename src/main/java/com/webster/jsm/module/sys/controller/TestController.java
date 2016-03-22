package com.webster.jsm.module.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Map;


/**
 * 测试页
 * Created by Webster on 16/3/13.
 */
@Controller
@RequestMapping(value = "test")
public class TestController {


    private final static Logger logger = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(method = RequestMethod.GET)
    public String index(Map<String, Object> map) {
        logger.debug("进入test首页");
        map.put( "names", Arrays.asList("Webster", "Linda", "Mike"));
        map.put( "car", "奥迪");
        return "test/test";
    }


    @RequestMapping(value = "parameter",method = RequestMethod.GET)
    public String learnMVC(@RequestParam(value = "userId", required = false) Integer userIdGot, Model model) {
        String str = "成功得到綁定數據：" + userIdGot;
        model.addAttribute("msg", str);
        return "test/parameter";
    }


    @RequestMapping(value = "metronic",method = RequestMethod.GET)
    public String metronic(Map<String, Object> map) {
        return "test/metronic";
    }



}
