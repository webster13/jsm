package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
@Table(name = "sys_permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * menu=菜单,
module=模块,
file=文件,
element=页面元素
     */
    @Column(name = "permission_type")
    private String permissionType;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取menu=菜单,
module=模块,
file=文件,
element=页面元素
     *
     * @return permission_type - menu=菜单,
module=模块,
file=文件,
element=页面元素
     */
    public String getPermissionType() {
        return permissionType;
    }

    /**
     * 设置menu=菜单,
module=模块,
file=文件,
element=页面元素
     *
     * @param permissionType menu=菜单,
module=模块,
file=文件,
element=页面元素
     */
    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType == null ? null : permissionType.trim();
    }
}