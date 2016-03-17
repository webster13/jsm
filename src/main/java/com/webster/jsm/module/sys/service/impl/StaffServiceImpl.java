package com.webster.jsm.module.sys.service.impl;

import com.webster.jsm.core.service.impl.BaseServiceImpl;
import com.webster.jsm.module.sys.entity.Staff;
import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.mapper.StaffMapper;
import com.webster.jsm.module.sys.mapper.UserMapper;
import com.webster.jsm.module.sys.service.StaffService;
import com.webster.jsm.module.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
@Service("staffService")
public class StaffServiceImpl extends BaseServiceImpl<StaffMapper, Staff> implements StaffService {

    @Autowired
    StaffMapper staffMapper;

    @Override
    public Staff findById(Integer id) {
        return staffMapper.findById(id);
    }
}
