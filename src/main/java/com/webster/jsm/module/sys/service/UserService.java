package com.webster.jsm.module.sys.service;


import com.webster.jsm.core.service.BaseService;
import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.mapper.UserMapper;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
public interface UserService extends BaseService<UserMapper,User> {

    User selectByUsername(String username);

}
