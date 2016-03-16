package com.webster.jsm.core.entity;

import com.webster.jsm.module.sys.entity.City;
import com.webster.jsm.module.sys.entity.User;

import javax.persistence.Column;

/**
 *  人的基类
 *  包含 " id , createBy , createAt , updateBy , updateAt , isDeleted "字段
 *  包含 " user , realName , pinyinName , phone , phone2 , gender , cityId , address"字段
 * Created by Vince on 2016/3/16.
 */


public abstract class PersonEntity extends BaseEntity{

    @Column(name = "user_id")
    private User user;

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
    private City city;

    private String address;

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

    public String getPinyinName() {
        return pinyinName;
    }

    public void setPinyinName(String pinyinName) {
        this.pinyinName = pinyinName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "user=" + user +
                ", realName='" + realName + '\'' +
                ", pinyinName='" + pinyinName + '\'' +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", gender=" + gender +
                ", city=" + city +
                ", address='" + address + '\'' +
                '}';
    }
}

