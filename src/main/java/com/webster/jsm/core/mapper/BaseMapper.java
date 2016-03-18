package com.webster.jsm.core.mapper;


import java.util.List;

/**
 *
 * Created by Webster on 2016/3/18.
 */
public interface BaseMapper<T> {

    int deleteById(Long id);

    int insert(T record);

    T selectById(Long id);

    List<T> selectAll();

    int updateById(T record);
}
