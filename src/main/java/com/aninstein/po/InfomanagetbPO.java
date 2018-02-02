package com.aninstein.po;

public class InfomanagetbPO {
    private Integer id;

    private String myindex;

    private Integer times;

    private Integer negtimes;

    private String neg;

    /*infomanagetb的字段名*/
    public static String _id="id";
    public static String _myindex="myindex";
    public static String _times="times";
    public static String _negtimes="negtimes";
    public static String _neg="neg";

    public Integer getId() {
        return id;
    }

    public InfomanagetbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMyindex() {
        return myindex;
    }

    public InfomanagetbPO setMyindex(String myindex) {
        this.myindex = myindex;
        return this;
    }

    public Integer getTimes() {
        return times;
    }

    public InfomanagetbPO setTimes(Integer times) {
        this.times = times;
        return this;
    }

    public Integer getNegtimes() {
        return negtimes;
    }

    public InfomanagetbPO setNegtimes(Integer negtimes) {
        this.negtimes = negtimes;
        return this;
    }

    public String getNeg() {
        return neg;
    }

    public InfomanagetbPO setNeg(String neg) {
        this.neg = neg;
        return this;
    }
}