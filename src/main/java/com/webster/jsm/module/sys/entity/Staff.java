package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.BaseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * ToDo...
 * Created by Vince on 2016/3/17.
 */

@Repository
@Table(name = "sys_staff")
public class Staff extends BaseEntity{


    private User user;

    @Column(name = "real_name")
    private String realName;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "realName='" + realName + '\'' +
                '}';
    }
}
