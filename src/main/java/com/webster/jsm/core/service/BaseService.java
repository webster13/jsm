package com.webster.jsm.core.service;

import com.webster.jsm.core.mapper.BaseMapper;

import java.util.List;

/**
 * 基础Service接口
 * Created by Webster on 2016/3/18.
 */
public interface BaseService<SpecificMapper extends BaseMapper<T>,T> {

    int deleteById(Long id);

    int insert(T record);

    T selectById(Long id);

    List<T> selectAll();

    int updateById(T record);
}
