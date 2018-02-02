package com.aninstein.po;

import java.util.Date;

public class DanmutbPO {
    private Integer id;

    private String anchorname;

    private Integer danmuall;

    private Integer danmusex;

    private Integer danmuabuse;

    private Integer danmureact;

    private Integer danmuvio;

    private Integer danmuother;

    private Date danmutime;

    /*danmutb的字段名*/
    public static String _id="id";
    public static String _anchorname="anchorname";
    public static String _danmuall="danmuall";
    public static String _danmusex="danmusex";
    public static String _danmuabuse="danmuabuse";
    public static String _danmureact="danmureact";
    public static String _danmuvio="danmuvio";
    public static String _danmuother="danmuother";
    public static String _danmutime="danmutime";

    public Integer getId() {
        return id;
    }

    public DanmutbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAnchorname() {
        return anchorname;
    }

    public DanmutbPO setAnchorname(String anchorname) {
        this.anchorname = anchorname;
        return this;
    }

    public Integer getDanmuall() {
        return danmuall;
    }

    public DanmutbPO setDanmuall(Integer danmuall) {
        this.danmuall = danmuall;
        return this;
    }

    public Integer getDanmusex() {
        return danmusex;
    }

    public DanmutbPO setDanmusex(Integer danmusex) {
        this.danmusex = danmusex;
        return this;
    }

    public Integer getDanmuabuse() {
        return danmuabuse;
    }

    public DanmutbPO setDanmuabuse(Integer danmuabuse) {
        this.danmuabuse = danmuabuse;
        return this;
    }

    public Integer getDanmureact() {
        return danmureact;
    }

    public DanmutbPO setDanmureact(Integer danmureact) {
        this.danmureact = danmureact;
        return this;
    }

    public Integer getDanmuvio() {
        return danmuvio;
    }

    public DanmutbPO setDanmuvio(Integer danmuvio) {
        this.danmuvio = danmuvio;
        return this;
    }

    public Integer getDanmuother() {
        return danmuother;
    }

    public DanmutbPO setDanmuother(Integer danmuother) {
        this.danmuother = danmuother;
        return this;
    }

    public Date getDanmutime() {
        return danmutime;
    }

    public DanmutbPO setDanmutime(Date danmutime) {
        this.danmutime = danmutime;
        return this;
    }
}