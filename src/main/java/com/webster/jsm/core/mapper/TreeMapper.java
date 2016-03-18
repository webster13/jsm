package com.webster.jsm.core.mapper;


import java.util.List;

/**
 *
 * Created by Webster on 2016/3/18.
 */
public interface TreeMapper<T> {

    /**
     * 找到所有子节点
     */
     List<T> findByParentIdsLike(T entity);

    /**
     * 更新所有父节点字段
     */
     int updateParentIds(T entity);
}
