package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.module.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;


public class UserServiceTest extends BaseTest{

    @Autowired
    User user;

    @Autowired
    UserService userService;

    @Test
    public void testSelectByUsername() throws Exception {
        user = userService.findByUsername("linda");
        logger.debug("=========={}============", user);

    }

    @Test
    public void testSpring() throws Exception {

        user.setUsername("linda");
        user.setPassword("511111");
        user.setUpdateAt(new java.sql.Date(LocalGregorianCalendar.Date.FIELD_UNDEFINED));
        logger.debug("=========={}============", user);


    }

    @Test
    public void testUserService() throws Exception {
        user = userService.findById(1);
        logger.debug("=========={}============", user);


    }

}