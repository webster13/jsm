package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "sys_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "pinyin_name")
    private String pinyinName;

    private String phone;

    private String phone2;

    /**
     * 0=女，1=男
     */
    private Boolean gender;

    /**
     * 引用城市ID
     */
    @Column(name = "city_id")
    private Integer cityId;

    private String address;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return pinyin_name
     */
    public String getPinyinName() {
        return pinyinName;
    }

    /**
     * @param pinyinName
     */
    public void setPinyinName(String pinyinName) {
        this.pinyinName = pinyinName == null ? null : pinyinName.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return phone2
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * @param phone2
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    /**
     * 获取0=女，1=男
     *
     * @return gender - 0=女，1=男
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置0=女，1=男
     *
     * @param gender 0=女，1=男
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取引用城市ID
     *
     * @return city_id - 引用城市ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置引用城市ID
     *
     * @param cityId 引用城市ID
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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