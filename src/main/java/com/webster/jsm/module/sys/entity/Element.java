package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.BaseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;


@Repository
@Table(name = "sys_element")
public class Element extends BaseEntity{


    /**
     * 唯一，最多100个字节＝33个汉字
     */
    private String name;

    /**
     * 最多255个字节
     */
    private String description;

    @Column(name = "is_show")
    private Boolean isShow;

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

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}