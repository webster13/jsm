package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Repository
@Table(name = "sys_module")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 唯一，最多100个字节＝33个汉字
     */
    private String name;

    /**
     * 最多255个字节
     */
    private String description;

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
     * 获取唯一，最多100个字节＝33个汉字
     *
     * @return name - 唯一，最多100个字节＝33个汉字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置唯一，最多100个字节＝33个汉字
     *
     * @param name 唯一，最多100个字节＝33个汉字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取最多255个字节
     *
     * @return description - 最多255个字节
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置最多255个字节
     *
     * @param description 最多255个字节
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}