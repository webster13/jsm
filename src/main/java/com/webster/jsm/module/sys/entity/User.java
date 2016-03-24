package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.BaseEntity;
import com.webster.jsm.core.enumeration.UserType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public class User extends BaseEntity<User>{


    private static final long serialVersionUID = -1180866092948706285L;
    private String username;

    private String password;

    private String salt;

    public User() {
    }

    public User(Long id) {
        super(id);
    }

    public User(Long id, User createBy, Date createAt, User updateBy, Date updateAt, Boolean isDeleted, String username, String password, String salt, UserType userType) {
        super(id, createBy, createAt, updateBy, updateAt, isDeleted);
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.userType = userType;
    }



    private UserType userType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("username", username)
                .append("password", password)
                .append("salt", salt)
                .append("userType", userType)
                .append("createBy", getCreateBy())
                .append("createAt",getCreateAt())
                .append("updateBy",getUpdateBy())
                .append("updateAt",getUpdateAt())
                .append("IsDeleted",getIsDeleted())
                .toString();
    }
}