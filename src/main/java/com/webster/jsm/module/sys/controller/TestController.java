package com.webster.jsm.module.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


/**
 * 测试页
 * Created by Webster on 16/3/13.
 */
@Controller
@RequestMapping(value = "test")
public class TestController {


    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "tree",method = RequestMethod.GET)
    public String tree(Map<String, Object> map) {
        return "test/tree";
    }




    @RequestMapping(value = "group",method = RequestMethod.GET)
    public String group(@RequestParam(value = "userId", required = false) Integer userId, Model model) {
        String str = "成功得到綁定數據：" + userId;
        model.addAttribute("msg", str);
        return "test/parameter";
    }



}
