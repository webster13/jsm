package com.webster.jsm.core.service;

import com.webster.jsm.core.entity.TreeEntity;
import com.webster.jsm.core.mapper.TreeMapper;

import java.util.List;

/**
 * 基础树形结构接口
 * Created by Webster on 2016/3/18.
 */
public interface TreeService<SpecificMapper extends TreeMapper<T>,T extends TreeEntity>

        extends BaseService<SpecificMapper,T> {

    List<T> selectByName(String name);
    List<T> selectAllSon(T parent);
    List<T> selectImmediateSon(Long parentId);
    List<T> selectAllParent(Long sonId);
    Integer countSon(T parent);
    Integer countImmediateSon(Long parentId);
    Boolean isHaveSon(T parent);


}
