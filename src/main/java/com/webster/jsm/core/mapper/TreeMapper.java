package com.webster.jsm.core.mapper;


import com.webster.jsm.core.entity.TreeEntity;

import java.util.List;

/**
 * 树形结构的通用mapper
 * Created by Webster on 2016/3/18.
 */
public interface TreeMapper<T extends TreeEntity> extends BaseMapper<T> {


    int selectByName(String name);
    List<T> selectAllSon(T parent);
    List<T> selectImmediateSon(Long parentId);
    List<T> selectAllParent(Long sonId);




}
