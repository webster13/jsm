package com.webster.jsm.module.sys.service.impl;

import com.webster.jsm.core.service.impl.BaseServiceImpl;
import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.mapper.UserMapper;
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

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        user.setUsername(username);
        user = selectOne(user);
        return user;
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
    public User findById(Integer id) {
        user =userMapper.findById(id);
        return user;
    }
}
