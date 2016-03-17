package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.core.enumeration.UserType;
import com.webster.jsm.module.sys.entity.Staff;
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
    Staff staff;

    @Autowired
    UserService userService;

    @Autowired
    StaffService staffService;

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


        staff.setRealName("张楠");
        logger.debug("=========={}============", staff);


    }

    @Test
    public void testUserFindbyId() throws Exception {
        user = userService.findById(2);
//        user.setUserType(UserType.PARENT);
//        user.setUsername("张楠");
//        user.setPassword("ccc1");

        logger.debug("=========={}============", user);


    }

    @Test
    public void testStaffFindbyId() throws Exception {
        staff = staffService.findById(1);

        logger.debug("=========={}============", staff);


    }

}