package com.webster.jsm.module.sys.service.impl;

import com.webster.jsm.core.service.impl.TreeServiceImpl;
import com.webster.jsm.module.sys.entity.Group;
import com.webster.jsm.module.sys.mapper.GroupMapper;
import com.webster.jsm.module.sys.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ToDo...
 * Created by Webster on 2016/3/18.
 */
@Service("groupService")
public class GroupServiceImpl extends TreeServiceImpl<GroupMapper,Group> implements GroupService {

    @Autowired
    GroupMapper groupMapper;


}
