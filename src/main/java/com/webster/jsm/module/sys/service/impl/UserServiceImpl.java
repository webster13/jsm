package com.webster.jsm.module.sys.service.impl;

import com.webster.jsm.core.entity.User;
import com.webster.jsm.core.mapper.UserMapper;
import com.webster.jsm.module.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    User user;

    @Override
    public User selectByUsername(String username) {
        user.setUsername(username);
        return selectOne(user);
    }
}