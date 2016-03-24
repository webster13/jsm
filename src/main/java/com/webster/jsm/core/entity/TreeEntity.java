package com.webster.jsm.core.entity;

import com.webster.jsm.module.sys.entity.User;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

/**
 * 树结构的基类
 * 含有name, description, parentId, parentIds, sequence
 *
 * 树形建模的方案：
 * 选用更适宜查询频繁的方案“嵌套集合”（nested-sets）
 * 详见：
 * http://docs.mongoing.com/manual/tutorial/model-tree-structures-with-materialized-paths.html
 * http://blog.csdn.net/monkey_d_meng/article/details/6647488
 * http://www.cnblogs.com/huangfox/archive/2012/04/11/2442408.html
 *
 * Created by Webster on 2016/3/18.
 */
public class TreeEntity<T extends TreeEntity> extends BaseEntity<T> {

    private String name;

    private String description;

    private Long parent;

    private Long lft;

    private Long rgt;

    public TreeEntity() {
    }

    public TreeEntity(Long id) {
        super(id);
    }

    public TreeEntity(Long id, User createBy, Date createAt, User updateBy, Date updateAt, Boolean isDeleted, String name, String description, Long parent, Long lft, Long rgt) {
        super(id, createBy, createAt, updateBy, updateAt, isDeleted);
        this.name = name;
        this.description = description;
        this.parent = parent;
        this.lft = lft;
        this.rgt = rgt;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

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

    public Long getLft() {
        return lft;
    }

    public void setLft(Long lft) {
        this.lft = lft;
    }

    public Long getRgt() {
        return rgt;
    }

    public void setRgt(Long rgt) {
        this.rgt = rgt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("description", description)
                .append("parent", parent)
                .append("lft", lft)
                .append("rgt", rgt)
                .toString();
    }
}
