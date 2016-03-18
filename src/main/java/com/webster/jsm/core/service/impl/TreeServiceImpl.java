package com.webster.jsm.core.service.impl;

import com.webster.jsm.core.mapper.TreeMapper;
import com.webster.jsm.core.service.TreeService;
import org.springframework.stereotype.Service;

/**
 * ToDo...
 * Created by Webster on 2016/3/18.
 */

@Service
public abstract class TreeServiceImpl<SpecificMapper extends TreeMapper<T>, T>
        extends BaseServiceImpl<SpecificMapper, T>
        implements TreeService<SpecificMapper, T> {


    @Override
    public int insert(Long parentId, T record) {
        return mapper.insert(parentId,record);
    }
}
