package com.aninstein.po;

public class YoutiaoPO {
    private Integer id;

    private String userlevel;

    private String userid;

    private String dmcontent;

    private String dmdata;

    private String pos;

    private String neg;

    private Integer dmsum;

    private Integer mark;

    private Float ratio;

    private Integer flag;

    /*youtiao的字段名*/
    public static String _id="id";
    public static String _userlevel="userlevel";
    public static String _userid="userid";
    public static String _dmcontent="dmcontent";
    public static String _dmdata="dmdata";
    public static String _pos="pos";
    public static String _neg="neg";
    public static String _dmsum="dmsum";
    public static String _mark="mark";
    public static String _ratio="ratio";
    public static String _flag="flag";

    public Integer getId() {
        return id;
    }

    public YoutiaoPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUserlevel() {
        return userlevel;
    }

    public YoutiaoPO setUserlevel(String userlevel) {
        this.userlevel = userlevel;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public YoutiaoPO setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public String getDmcontent() {
        return dmcontent;
    }

    public YoutiaoPO setDmcontent(String dmcontent) {
        this.dmcontent = dmcontent;
        return this;
    }

    public String getDmdata() {
        return dmdata;
    }

    public YoutiaoPO setDmdata(String dmdata) {
        this.dmdata = dmdata;
        return this;
    }

    public String getPos() {
        return pos;
    }

    public YoutiaoPO setPos(String pos) {
        this.pos = pos;
        return this;
    }

    public String getNeg() {
        return neg;
    }

    public YoutiaoPO setNeg(String neg) {
        this.neg = neg;
        return this;
    }

    public Integer getDmsum() {
        return dmsum;
    }

    public YoutiaoPO setDmsum(Integer dmsum) {
        this.dmsum = dmsum;
        return this;
    }

    public Integer getMark() {
        return mark;
    }

    public YoutiaoPO setMark(Integer mark) {
        this.mark = mark;
        return this;
    }

    public Float getRatio() {
        return ratio;
    }

    public YoutiaoPO setRatio(Float ratio) {
        this.ratio = ratio;
        return this;
    }

    public Integer getFlag() {
        return flag;
    }

    public YoutiaoPO setFlag(Integer flag) {
        this.flag = flag;
        return this;
    }
}