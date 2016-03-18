package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.module.sys.entity.Group;
import com.webster.jsm.module.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * todo
 * Created by Webster on 16/3/18.
 */
public class GroupServiceTest extends BaseTest {

    @Autowired
    User user;

    @Autowired
    GroupService groupService;

    @Test
    public void testInsert() throws Exception {
        user.setId(1l);
        Date now = new Date();

        Group group = new Group(1l, user, now, user, now, false,
                "根", "根目录", 1l, 2l);

        groupService.insert(group);

        logger.debug("=========={}============", group);
    }


}