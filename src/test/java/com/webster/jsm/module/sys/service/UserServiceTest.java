package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.module.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class UserServiceTest extends BaseTest{

    @Autowired
    User user;

    @Autowired
    UserService userService;

    @Test
    public void testSelectByUsername() throws Exception {
        user = userService.findByUsername("linda");
        looger.debug("=========={}============",user);

    }
}