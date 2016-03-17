package com.webster.jsm.core.util;

import com.webster.jsm.module.sys.entity.User;
import com.webster.jsm.module.sys.service.UserService;
import com.webster.jsm.module.sys.service.impl.UserServiceImpl;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用于Mybatis配置xml
 * Created by Vince on 2016/3/16.
 */
public class UserTypeHandler extends BaseTypeHandler<User> {

    UserService userService = new UserServiceImpl();

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, User parameter, JdbcType jdbcType) throws SQLException {

        ps.setObject(i,parameter.getId());
    }

    @Override
    public User getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Integer id = rs.getInt(columnName);
        return userService.findById(id);
    }

    @Override
    public User getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Integer id = rs.getInt(columnIndex);
        return userService.findById(id);
    }

    @Override
    public User getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Integer id = cs.getInt(columnIndex);
        return userService.findById(id);
    }



}
