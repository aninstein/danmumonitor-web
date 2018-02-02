package com.aninstein.po;

public class MonitortbPO {
    private Integer id;

    private String maname;

    private String maroom;

    private String mastate;

    private String mapeople;

    private Double mahis;

    private Double manow;

    private Integer madmnum;

    private Short maban;

    /*monitortb的字段名*/
    public static String _id="id";
    public static String _MAname="MAname";
    public static String _MAroom="MAroom";
    public static String _MAstate="MAstate";
    public static String _MApeople="MApeople";
    public static String _MAhis="MAhis";
    public static String _MAnow="MAnow";
    public static String _MAdmnum="MAdmnum";
    public static String _MAban="MAban";


    public Integer getId() {
        return id;
    }

    public MonitortbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMAname() {
        return maname;
    }

    public MonitortbPO setMAname(String maname) {
        this.maname = maname;
        return this;
    }

    public String getMAroom() {
        return maroom;
    }

    public MonitortbPO setMAroom(String maroom) {
        this.maroom = maroom;
        return this;
    }

    public String getMAstate() {
        return mastate;
    }

    public MonitortbPO setMAstate(String mastate) {
        this.mastate = mastate;
        return this;
    }

    public String getMApeople() {
        return mapeople;
    }

    public MonitortbPO setMApeople(String mapeople) {
        this.mapeople = mapeople;
        return this;
    }

    public Double getMAhis() {
        return mahis;
    }

    public MonitortbPO setMAhis(Double mahis) {
        this.mahis = mahis;
        return this;
    }

    public Double getMAnow() {
        return manow;
    }

    public MonitortbPO setMAnow(Double manow) {
        this.manow = manow;
        return this;
    }

    public Integer getMAdmnum() {
        return madmnum;
    }

    public MonitortbPO setMAdmnum(Integer madmnum) {
        this.madmnum = madmnum;
        return this;
    }

    public Short getMAban() {
        return maban;
    }

    public MonitortbPO setMAban(Short maban) {
        this.maban = maban;
        return this;
    }
}