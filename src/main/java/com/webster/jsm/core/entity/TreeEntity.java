package com.webster.jsm.core.entity;

import com.webster.jsm.module.sys.entity.Menu;

import javax.persistence.Column;

/**
 * 树形结构的基类
 * Created by Vince on 2016/3/15.
 */


public abstract class TreeEntity extends BaseEntity {
    /**
     * 名称，100个字节
     */
    private String name;

    /**
     * 描述，255字节
     */
    private String description;

    /**
     * 父级id
     */
    @Column(name = "parent_id")
    private Menu parent;

    /**
     * 所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符
     */
    @Column(name = "parent_ids")
    private String parentIds;

    /**
     * 排序
     */
    private Integer sequence;



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


    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }
}
