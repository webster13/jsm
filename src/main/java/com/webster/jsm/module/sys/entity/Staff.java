package com.webster.jsm.module.sys.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
@Table(name = "sys_staff")
public class Staff {
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
}