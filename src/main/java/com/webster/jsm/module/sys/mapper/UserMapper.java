package com.webster.jsm.module.sys.mapper;


import com.webster.jsm.core.mapper.BaseMapper;
import com.webster.jsm.module.sys.entity.User;


public interface UserMapper extends BaseMapper<User> {
    User selectByUsername(String username);
}