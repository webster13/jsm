package com.webster.jsm.core.util;

import com.webster.jsm.module.sys.entity.Menu;
import com.webster.jsm.module.sys.service.MenuService;
import com.webster.jsm.module.sys.service.UserService;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用于Mybatis配置xml
 * Created by Vince on 2016/3/16.
 */
public class MenuTypeHandler extends BaseTypeHandler<Menu> {


    @Autowired
    MenuService service;

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Menu parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, parameter);
    }

    @Override
    public Menu getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int id = rs.getInt(columnName);
        return service.selectByPrimaryKey(id);
    }

    @Override
    public Menu getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int id = rs.getInt(columnIndex);
        return service.selectByPrimaryKey(id);
    }

    @Override
    public Menu getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int id = cs.getInt(columnIndex);
        return service.selectByPrimaryKey(id);
    }
}
