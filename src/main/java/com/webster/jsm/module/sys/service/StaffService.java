package com.webster.jsm.module.sys.service;


import com.webster.jsm.core.service.BaseService;
import com.webster.jsm.module.sys.entity.Staff;
import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.mapper.StaffMapper;
import com.webster.jsm.module.sys.mapper.UserMapper;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
public interface StaffService extends BaseService<StaffMapper,Staff> {

    Staff findById(Integer id);




}
