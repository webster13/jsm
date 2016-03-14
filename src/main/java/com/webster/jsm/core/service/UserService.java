package com.webster.jsm.core.service;

import com.webster.jsm.core.entity.User;
import com.webster.jsm.core.mapper.UserMapper;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
public interface UserService extends BaseService<UserMapper,User> {

    User selectByUsername(String username);


}
