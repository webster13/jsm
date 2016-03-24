package com.webster.jsm.module.sys.service.impl;

import com.webster.jsm.core.service.impl.BaseServiceImpl;
import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.mapper.UserMapper;
import com.webster.jsm.module.sys.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ToDo...
 * Created by Webster on 2016/3/18.
 */
@Service("userService")
public class UserServiceImpl  extends BaseServiceImpl<UserMapper,User> implements UserService  {


    @Override
    public User selectByUsername(String username) {
        return mapper.selectByUsername(username);
    }


}
