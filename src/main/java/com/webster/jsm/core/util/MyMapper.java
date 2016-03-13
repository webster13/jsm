package com.webster.jsm.core.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapper的基础接口
 *
 * MysqlMapper是添加了几个mysql数据库专用的mapper
 * Created by Webster on 16/3/13.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
