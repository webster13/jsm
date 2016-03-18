package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.module.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceTest extends BaseTest{

    @Autowired
    User user;

    @Autowired
    UserService userService;

    @Test
    public void testSelectByUsername() throws Exception {
        user = userService.selectByUsername("linda");
        logger.debug("=========={}============", user);
    }

    @Test
    public void testSelectById() throws Exception {
        user = userService.selectById(2l);
        logger.debug("=========={}============", user);
    }

    @Test
    public void testSelectAll() throws Exception {
        List<User> users = userService.selectAll();
        logger.debug("=========={}============", users);
    }
    @Test
    public void testDeleteById() throws Exception {
        Integer result = userService.deleteById(2l);
        logger.debug("=========={}===========", result);
    }
}