package com.webster.jsm.core.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 树结构的基类
 * 含有name, description, parentId, parentIds, sequence
 *
 * 树形建模的方案：
 * 查询频繁用“嵌套集合”（nested-sets），增删改频繁用“物化路径”（materialized-paths）
 * 详见：
 * http://docs.mongoing.com/manual/tutorial/model-tree-structures-with-materialized-paths.html
 * http://blog.csdn.net/monkey_d_meng/article/details/6647488
 *
 * Created by Webster on 2016/3/18.
 */
public abstract class TreeEntity<T> extends BaseEntity<T> {

    private String name;

    private String description;

    private T parent;

    private String parentIds;

    private Long sequence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getParent() {
        return parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("description", description)
                .append("parent", parent)
                .append("parentIds", parentIds)
                .append("sequence", sequence)
                .toString();
    }
}
