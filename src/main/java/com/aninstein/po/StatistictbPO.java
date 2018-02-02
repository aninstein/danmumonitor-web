package com.aninstein.po;

public class StatistictbPO {
    private Integer id;

    private String anchorroom;

    private String anchortype;

    private Integer anchorsex;

    private Integer anchorabuse;

    private Integer anchorreact;

    private Integer anchorvio;

    private Integer anchorother;

    /*statistictb的字段名*/
    public static String _id="id";
    public static String _anchorroom="anchorroom";
    public static String _anchortype="anchortype";
    public static String _anchorsex="anchorsex";
    public static String _anchorabuse="anchorabuse";
    public static String _anchorreact="anchorreact";
    public static String _anchorvio="anchorvio";
    public static String _anchorother="anchorother";

    public Integer getId() {
        return id;
    }

    public StatistictbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAnchorroom() {
        return anchorroom;
    }

    public StatistictbPO setAnchorroom(String anchorroom) {
        this.anchorroom = anchorroom;
        return this;
    }

    public String getAnchortype() {
        return anchortype;
    }

    public StatistictbPO setAnchortype(String anchortype) {
        this.anchortype = anchortype;
        return this;
    }

    public Integer getAnchorsex() {
        return anchorsex;
    }

    public StatistictbPO setAnchorsex(Integer anchorsex) {
        this.anchorsex = anchorsex;
        return this;
    }

    public Integer getAnchorabuse() {
        return anchorabuse;
    }

    public StatistictbPO setAnchorabuse(Integer anchorabuse) {
        this.anchorabuse = anchorabuse;
        return this;
    }

    public Integer getAnchorreact() {
        return anchorreact;
    }

    public StatistictbPO setAnchorreact(Integer anchorreact) {
        this.anchorreact = anchorreact;
        return this;
    }

    public Integer getAnchorvio() {
        return anchorvio;
    }

    public StatistictbPO setAnchorvio(Integer anchorvio) {
        this.anchorvio = anchorvio;
        return this;
    }

    public Integer getAnchorother() {
        return anchorother;
    }

    public StatistictbPO setAnchorother(Integer anchorother) {
        this.anchorother = anchorother;
        return this;
    }
}