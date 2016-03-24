package com.webster.jsm.module.sys.service;

import com.webster.jsm.BaseTest;
import com.webster.jsm.module.sys.entity.Group;
import com.webster.jsm.module.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

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

        groupService.deleteById(9l);
    }

    @Test
    public void testInsert() throws Exception {
        User user = new User(1l);
        Date date = new Date();
        Group group2 = new Group(null,user,date,user,date,false,"新的","描述"
                ,3l,8l,10l);
        groupService.insert(group2);
    }

    @Test
    public void testSelectById() throws Exception {
        group = groupService.selectById(3l);
        logger.debug("@@@@@========@@@@@"+group.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        List<Group> list = groupService.selectAll();
        logger.debug("@@@@@========@@@@@"+list.toString());
    }

    @Test
    public void testCountAll() throws Exception {
        Long count= groupService.countAll();
        logger.debug("@@@@@========@@@@@"+count.toString());
    }

    @Test
    public void testUpdateById() throws Exception {
        User user = new User(1l);
        Date date = new Date();
        Group group2 = new Group(1l,user,date,user,date,false,"新的222","描述333"
                ,3l,8l,10l);
        groupService.updateById(group2);
    }

    @Test
    public void testSelectByName() throws Exception {
        List<Group> list = groupService.selectByName("r");
        logger.debug("@@@@@========@@@@@"+group.toString());
    }

    @Test
    public void testSelectAllSon() throws Exception {
        group = groupService.selectById(2l);
        List<Group> list = groupService.selectAllSon(group);
        logger.debug("@@@@@========@@@@@"+group.toString());
    }

    @Test
    public void testSelectImmediateSon() throws Exception {

        List list = groupService.selectImmediateSon(2L);
        logger.debug("@@@@@========@@@@@"+group.toString());
    }

    @Test
    public void testSelectAllParent() throws Exception {
        List list = groupService.selectAllParent(8L);
        logger.debug("@@@@@========@@@@@"+group.toString());
    }

    @Test
    public void testCountSon() throws Exception {
        group = groupService.selectById(2l);
        int list = groupService.countSon(group);
        logger.debug("@@@@@========@@@@@"+list);
    }

    @Test
    public void testIsHaveSon() throws Exception {
        group = groupService.selectById(2l);
        Boolean list = groupService.isHaveSon(group);
        logger.debug("@@@@@========@@@@@"+list);

    }

    @Test
    public void testCountImmediateSon() throws Exception {
        int list = groupService.countImmediateSon(2l);
        logger.debug("@@@@@========@@@@@"+list);

    }
}

