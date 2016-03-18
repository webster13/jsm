package com.webster.jsm.module.sys.mapper;


import com.webster.jsm.core.mapper.BaseMapper;
import com.webster.jsm.module.sys.entity.User;
import org.springframework.stereotype.Component;


@Component
public interface UserMapper extends BaseMapper<User> {
    User selectByUsername(String username);
}