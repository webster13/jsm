package com.webster.jsm.module.sys.mapper;

import com.webster.jsm.core.util.MyMapper;
import com.webster.jsm.module.sys.entity.User;
import org.springframework.stereotype.Component;


@Component
public interface UserMapper extends MyMapper<User> {
    User findByUsername(String username);
    User findById(Integer id);
}