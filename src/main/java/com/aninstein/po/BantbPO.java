package com.aninstein.po;

public class BantbPO {
    private Integer id;

    private String anchorname;

    private String bantype;

    private Double banhis;

    private String bantime;


    /*bantb的字段名*/
    public static String _id="id";
    public static String _anchorname="anchorname";
    public static String _bantype="bantype";
    public static String _banhis="banhis";
    public static String _bantime="bantime";

    public Integer getId() {
        return id;
    }

    public BantbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAnchorname() {
        return anchorname;
    }

    public BantbPO setAnchorname(String anchorname) {
        this.anchorname = anchorname;
        return this;
    }

    public String getBantype() {
        return bantype;
    }

    public BantbPO setBantype(String bantype) {
        this.bantype = bantype;
        return this;
    }

    public Double getBanhis() {
        return banhis;
    }

    public BantbPO setBanhis(Double banhis) {
        this.banhis = banhis;
        return this;
    }

    public String getBantime() {
        return bantime;
    }

    public BantbPO setBantime(String bantime) {
        this.bantime = bantime;
        return this;
    }
}