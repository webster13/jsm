package com.webster.jsm.module.sys.entity;

import com.webster.jsm.core.entity.TreeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "sys_menu")
public class Menu extends TreeEntity{

    private String url;

    @Column(name = "is_show")
    private Boolean isShow;

    private String icon;

    /**
     * target ＝（mainFrame、 _blank、_self、_parent、_top）
     */
    @Column(name = "show_in")
    private String showIn;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getShowIn() {
        return showIn;
    }

    public void setShowIn(String showIn) {
        this.showIn = showIn;
    }
}