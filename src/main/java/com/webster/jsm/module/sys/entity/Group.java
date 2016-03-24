package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.TreeEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * 用户群组
 * Created by Webster on 2016/3/18.
 */
@Repository
public class Group extends TreeEntity<Group> {


    private static final long serialVersionUID = 129016309492345301L;

    public Group() {
    }

    public Group(Long id) {
        super(id);
    }

    public Group(Long id, User createBy, Date createAt, User updateBy, Date updateAt, Boolean isDeleted, String name, String description, Long parent, Long lft, Long rgt) {
        super(id, createBy, createAt, updateBy, updateAt, isDeleted, name, description, parent, lft, rgt);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("name", getName())
                .append("description", getDescription())
                .append("parent", getParent())
                .append("lft", getLft())
                .append("rgt", getRgt())
                .append("createBy", getCreateBy())
                .append("createAt", getCreateAt())
                .append("updateBy", getUpdateBy())
                .append("updateAt", getUpdateAt())
                .append("isDeleted", getIsDeleted())
                .toString();
    }
}
