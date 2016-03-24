package com.webster.jsm.core.service.impl;

import com.webster.jsm.core.entity.TreeEntity;
import com.webster.jsm.core.mapper.TreeMapper;
import com.webster.jsm.core.service.TreeService;

import java.util.List;

/**
 * ToDo...
 * Created by Webster on 2016/3/18.
 */

public abstract class TreeServiceImpl<SpecificMapper extends TreeMapper<T>, T extends TreeEntity>
        extends BaseServiceImpl<SpecificMapper, T>
        implements TreeService<SpecificMapper, T> {

    @Override
    public int selectByName(String name) {
        return mapper.selectByName(name);
    }

    @Override
    public List<T> selectAllSon(T parent) {
        return mapper.selectAllSon(parent);
    }

    @Override
    public List<T> selectImmediateSon(Long parentId) {
        return mapper.selectImmediateSon(parentId);
    }

    @Override
    public List<T> selectAllParent(Long sonId) {
        return mapper.selectAllParent(sonId);
    }

    @Override
    public Integer countSon(T parent) {
        return (int)(parent.getRgt()-parent.getLft()-1)/2;
    }

    @Override
    public Boolean isHaveSon(T parent) {
        return countSon(parent)>0;
    }

}
