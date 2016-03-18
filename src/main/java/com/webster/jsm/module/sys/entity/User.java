package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.BaseEntity;
import com.webster.jsm.core.enumeration.UserType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Repository;


@Repository
public class User extends BaseEntity<User>{


    private String username;

    private String password;

    private String salt;

    public User() {
    }

    public User(String username, String password, String salt, UserType userType) {
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