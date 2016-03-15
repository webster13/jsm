package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;


@Repository
@Table(name = "sys_element")
public class Element {
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

    @Column(name = "is_show")
    private Boolean isShow;

    /**
     * 创建者id
     */
    @Column(name = "create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 更新者id
     */
    @Column(name = "update_by")
    private Integer updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 被删除标记
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

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

    /**
     * @return is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * @param isShow
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取创建者id
     *
     * @return create_by - 创建者id
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者id
     *
     * @param createBy 创建者id
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_at - 创建时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置创建时间
     *
     * @param createAt 创建时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取更新者id
     *
     * @return update_by - 更新者id
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者id
     *
     * @param updateBy 更新者id
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_at - 更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置更新时间
     *
     * @param updateAt 更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取被删除标记
     *
     * @return is_deleted - 被删除标记
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置被删除标记
     *
     * @param isDeleted 被删除标记
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}