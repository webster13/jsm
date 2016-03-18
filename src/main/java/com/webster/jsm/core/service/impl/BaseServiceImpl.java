package com.webster.jsm.core.service.impl;

import com.webster.jsm.core.mapper.BaseMapper;
import com.webster.jsm.core.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ToDo...
 * Created by Webster on 2016/3/18.
 */

@Service
public abstract class BaseServiceImpl<SpecificMapper extends BaseMapper<T>, T>
        implements BaseService<SpecificMapper, T> {

    @Autowired
    protected SpecificMapper mapper;


    @Override
    public int deleteById(Long id) {

        return mapper.deleteById(id);
    }

    @Override
    public int insert(T record) {
        return mapper.insert(record);

    }

    @Override
    public T selectById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int updateById(T record) {
        return mapper.updateById(record);
    }
}
