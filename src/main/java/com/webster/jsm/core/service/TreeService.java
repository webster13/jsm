package com.webster.jsm.core.service;

import com.webster.jsm.core.mapper.TreeMapper;

/**
 * 基础树形结构接口
 * Created by Webster on 2016/3/18.
 */
public interface TreeService<SpecificMapper extends TreeMapper<T>,T>

        extends BaseService<SpecificMapper,T> {


    int insert(Long parentId,T record);

}
