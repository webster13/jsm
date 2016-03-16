package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
@Table(name = "sys_operate")
public class Operate {

    /**
     * 有这个标识的表示有此权限做此操作
     */
    @Column(name = "permission_sign")
    private String permissionSign;

    public String getPermissionSign() {
        return permissionSign;
    }

    public void setPermissionSign(String permissionSign) {
        this.permissionSign = permissionSign;
    }
}