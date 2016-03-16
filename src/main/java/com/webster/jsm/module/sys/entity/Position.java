package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "sys_position")
public class Position {


    @Column(name = "org_id")
    private Org orgId;

    /**
     * 唯一，最多100个字节＝33个汉字
     */
    private String name;

    /**
     * 最多255个字节
     */
    private String description;

    public Org getOrgId() {
        return orgId;
    }

    public void setOrgId(Org orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}