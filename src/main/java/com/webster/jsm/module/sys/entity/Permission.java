package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.enumeration.PermissionType;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
@Table(name = "sys_permission")
public class Permission {


    @Column(name = "permission_type")
    private PermissionType permissionType;

    public PermissionType getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType;
    }
}