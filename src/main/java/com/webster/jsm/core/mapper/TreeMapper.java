package com.webster.jsm.core.mapper;


/**
 * Created by Webster on 2016/3/18.
 */
public interface TreeMapper<T> extends BaseMapper<T> {


    int insert(Long parentId, T record);



}
