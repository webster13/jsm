package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.TreeEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 用户群组
 * Created by Webster on 2016/3/18.
 */
public class Group extends TreeEntity<Group> {

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("name", getName())
                .append("description", getDescription())
                .append("parent", getParent())
                .append("parentIds", getParentIds())
                .append("sequence", getSequence())
                .append("createBy", getCreateBy())
                .append("createAt", getCreateAt())
                .append("updateBy", getUpdateBy())
                .append("updateAt", getUpdateAt())
                .append("IsDeleted", getIsDeleted())
                .toString();
    }
}
