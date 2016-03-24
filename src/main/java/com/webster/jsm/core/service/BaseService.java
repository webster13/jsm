package com.webster.jsm.core.service;

import com.webster.jsm.core.entity.BaseEntity;
import com.webster.jsm.core.mapper.BaseMapper;

import java.util.List;

/**
 * 基础Service接口
 * Created by Webster on 2016/3/18.
 */
public interface BaseService<SpecificMapper extends BaseMapper<T>,T extends BaseEntity> {

    int insert(T record);

    int deleteById(Long id);

    T selectById(Long id);

    int updateById(T record);

    List<T> selectAll();

    Long countAll();
}
