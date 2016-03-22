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
        Long parentId = 1l;
        Date now = new Date();

        Group group = new Group(parentId, user, now, user, now, false,
                "根", "根目录", parentId, parentId+2);

        groupService.insert(group);

        logger.debug("=========={}============", group);
    }


}