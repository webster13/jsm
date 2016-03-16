package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.BaseEntity;
import com.webster.jsm.core.enumeration.UserType;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
@Table(name = "sys_user")
public class User extends BaseEntity{


    private String username;

    private String password;

    private String salt;

    /**
     * staff=员工,
        student=学生,
        parent=文件,
     */
    @Column(name = "user_type")
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

        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", userType=" + userType +
                '}';
    }
}