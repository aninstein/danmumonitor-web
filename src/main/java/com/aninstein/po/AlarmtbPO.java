package com.aninstein.po;

public class AlarmtbPO {
    private Integer id;

    private String alarmname;

    private String alarmroom;

    private Double alarmcredit;

    private String alarmtype;

    private String alarmtime;

    /*alarmtb的字段名*/
    public static String _id="id";
    public static String _alarmname="alarmname";
    public static String _alarmroom="alarmroom";
    public static String _alarmcredit="alarmcredit";
    public static String _alarmtype="alarmtype";
    public static String _alarmtime="alarmtime";

    public Integer getId() {
        return id;
    }

    public AlarmtbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAlarmname() {
        return alarmname;
    }

    public AlarmtbPO setAlarmname(String alarmname) {
        this.alarmname = alarmname;
        return this;
    }

    public String getAlarmroom() {
        return alarmroom;
    }

    public AlarmtbPO setAlarmroom(String alarmroom) {
        this.alarmroom = alarmroom;
        return this;
    }

    public Double getAlarmcredit() {
        return alarmcredit;
    }

    public AlarmtbPO setAlarmcredit(Double alarmcredit) {
        this.alarmcredit = alarmcredit;
        return this;
    }

    public String getAlarmtype() {
        return alarmtype;
    }

    public AlarmtbPO setAlarmtype(String alarmtype) {
        this.alarmtype = alarmtype;
        return this;
    }

    public String getAlarmtime() {
        return alarmtime;
    }

    public AlarmtbPO setAlarmtime(String alarmtime) {
        this.alarmtime = alarmtime;
        return this;
    }
}