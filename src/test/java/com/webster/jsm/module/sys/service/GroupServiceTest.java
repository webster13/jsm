package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.module.sys.entity.Group;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * todo
 * Created by Webster on 16/3/18.
 */
public class GroupServiceTest extends BaseTest {

    @Autowired
    Group group;

    @Autowired
    GroupService groupService;


    @Test
    public void testDeleteById() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testSelectById() throws Exception {
        group = groupService.selectById(3l);
        logger.debug("@@@@@========@@@@@"+group.toString());
    }

    @Test
    public void testSelectAll() throws Exception {

    }

    @Test
    public void testCountAll() throws Exception {

    }

    @Test
    public void testUpdateById() throws Exception {

    }

    @Test
    public void testSelectByName() throws Exception {

    }

    @Test
    public void testSelectAllSon() throws Exception {

    }

    @Test
    public void testSelectImmediateSon() throws Exception {

    }

    @Test
    public void testSelectAllParent() throws Exception {

    }

    @Test
    public void testCountSon() throws Exception {

    }

    @Test
    public void testIsHaveSon() throws Exception {

    }
}

