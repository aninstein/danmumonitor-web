package com.aninstein.po;

public class AnchormapperPO {
    private Integer id;

    private String anchorname;

    private String anchorroom;

    private String anchortable;

    /*anchormapper的字段名*/
    public static String _id="id";
    public static String _anchorname="anchorname";
    public static String _anchorroom="anchorroom";
    public static String _anchortable="anchortable";

    public Integer getId() {
        return id;
    }

    public AnchormapperPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAnchorname() {
        return anchorname;
    }

    public AnchormapperPO setAnchorname(String anchorname) {
        this.anchorname = anchorname;
        return this;
    }

    public String getAnchorroom() {
        return anchorroom;
    }

    public AnchormapperPO setAnchorroom(String anchorroom) {
        this.anchorroom = anchorroom;
        return this;
    }

    public String getAnchortable() {
        return anchortable;
    }

    public AnchormapperPO setAnchortable(String anchortable) {
        this.anchortable = anchortable;
        return this;
    }
}