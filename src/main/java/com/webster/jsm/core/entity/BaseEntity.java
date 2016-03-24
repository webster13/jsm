package com.webster.jsm.core.entity;


import com.webster.jsm.module.sys.entity.User;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类的基类,含有" id , createBy , createAt , updateBy , updateAt , isDeleted "字段
 * Created by Webster on 16/3/13.
 */
public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = -7978287334714536921L;

    private Long id;

    private User createBy;


    private Date createAt;

    private User updateBy;


    private Date updateAt;


    private Boolean isDeleted;


    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public BaseEntity(Long id, User createBy, Date createAt, User updateBy, Date updateAt, Boolean isDeleted) {
        this.id = id;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.isDeleted = isDeleted;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public User getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(User updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }



    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("createBy", createBy)
                .append("createAt", createAt)
                .append("updateBy", updateBy)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .toString();
    }
}
