package com.aninstein.po;

import java.util.Date;

public class ReporttbPO {
    private Integer id;

    private String reportname;

    private String reportroom;

    private Double reportcredit;

    private String reporttype;

    private Date reporttime;

    private String reporttext;

    /*reporttb的字段名*/
    public static String _id="id";
    public static String _reportname="reportname";
    public static String _reportroom="reportroom";
    public static String _reportcredit="reportcredit";
    public static String _reporttype="reporttype";
    public static String _reporttime="reporttime";
    public static String _reporttext="reporttext";

    public Integer getId() {
        return id;
    }

    public ReporttbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getReportname() {
        return reportname;
    }

    public ReporttbPO setReportname(String reportname) {
        this.reportname = reportname;
        return this;
    }

    public String getReportroom() {
        return reportroom;
    }

    public ReporttbPO setReportroom(String reportroom) {
        this.reportroom = reportroom;
        return this;
    }

    public Double getReportcredit() {
        return reportcredit;
    }

    public ReporttbPO setReportcredit(Double reportcredit) {
        this.reportcredit = reportcredit;
        return this;
    }

    public String getReporttype() {
        return reporttype;
    }

    public ReporttbPO setReporttype(String reporttype) {
        this.reporttype = reporttype;
        return this;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public ReporttbPO setReporttime(Date reporttime) {
        this.reporttime = reporttime;
        return this;
    }

    public String getReporttext() {
        return reporttext;
    }

    public ReporttbPO setReporttext(String reporttext) {
        this.reporttext = reporttext;
        return this;
    }
}