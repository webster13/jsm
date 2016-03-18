package com.webster.jsm.core.service;

import com.webster.jsm.core.mapper.BaseMapper;

/**
 * 基础树形结构接口
 * Created by Webster on 2016/3/18.
 */
public interface TreeService<SpecificMapper extends BaseMapper<T>,T>
        extends BaseService<SpecificMapper,T> {
}
