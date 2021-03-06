package com.aninstein.util;


import com.aninstein.po.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InsertSql {

    String tableName;
    DBTool dbTool = new DBTool();
    Connection connection = dbTool.getConnection();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    // 通过sql语句执行insert操作
    public int execInsertBySql(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        return count;
    }

    // 通过sql语句批量执行insert操作
    public int[] execInsertByBatchSql(List<String> sqlList) throws SQLException {
        Statement statement = connection.createStatement();
        for (String sql : sqlList) {
            statement.addBatch(sql);
        }
        int[] count = statement.executeBatch();
        return count;
    }

    // 把list转化为数组
    public String[] returnStringToPO(List<Object> objList) {
        String[] objs = new String[objList.size()];
        for (int i = 0; i < objList.size(); i++) {
            objs[i] = String.valueOf(objList.get(i));
        }
        return objs;

    }

    /*alarmtbPOInsert*/
    public String getInsertAlarmtbPOSql(AlarmtbPO alarmtbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getAlarmtbPOColnameList(alarmtbPO);
        List<Object> valuesList = checkPOnotNullList.getAlarmtbPOValuesList(alarmtbPO);
        return "INSERT INTO " + DatabaseTableNames._alarmtb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*anchormapperPOInsert*/
    public String getInsertAnchormapperPOSql(AnchormapperPO anchormapperPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getAnchormapperPOColnameList(anchormapperPO);
        List<Object> valuesList = checkPOnotNullList.getAnchormapperPOValuesList(anchormapperPO);
        return "INSERT INTO " + DatabaseTableNames._anchormapper + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*bantbPOInsert*/
    public String getInsertBantbPOSql(BantbPO bantbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getBantbPOColnameList(bantbPO);
        List<Object> valuesList = checkPOnotNullList.getBantbPOValuesList(bantbPO);
        return "INSERT INTO " + DatabaseTableNames._bantb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*danmutbPOInsert*/
    public String getInsertDanmutbPOSql(DanmutbPO danmutbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getDanmutbPOColnameList(danmutbPO);
        List<Object> valuesList = checkPOnotNullList.getDanmutbPOValuesList(danmutbPO);
        return "INSERT INTO " + DatabaseTableNames._danmutb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*infomanagetbPOInsert*/
    public String getInsertInfomanagetbPOSql(InfomanagetbPO infomanagetbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getInfomanagetbPOColnameList(infomanagetbPO);
        List<Object> valuesList = checkPOnotNullList.getInfomanagetbPOValuesList(infomanagetbPO);
        return "INSERT INTO " + DatabaseTableNames._infomanagetb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*monitortbPOInsert*/
    public String getInsertMonitortbPOSql(MonitortbPO monitortbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getMonitortbPOColnameList(monitortbPO);
        List<Object> valuesList = checkPOnotNullList.getMonitortbPOValuesList(monitortbPO);
        return "INSERT INTO " + DatabaseTableNames._monitortb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*notestPOInsert*/
    public String getInsertNotestPOSql(NotestPO notestPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getNotestPOColnameList(notestPO);
        List<Object> valuesList = checkPOnotNullList.getNotestPOValuesList(notestPO);
        return "INSERT INTO " + DatabaseTableNames._notest + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*reporttbPOInsert*/
    public String getInsertReporttbPOSql(ReporttbPO reporttbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getReporttbPOColnameList(reporttbPO);
        List<Object> valuesList = checkPOnotNullList.getReporttbPOValuesList(reporttbPO);
        return "INSERT INTO " + DatabaseTableNames._reporttb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*statistictbPOInsert*/
    public String getInsertStatistictbPOSql(StatistictbPO statistictbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getStatistictbPOColnameList(statistictbPO);
        List<Object> valuesList = checkPOnotNullList.getStatistictbPOValuesList(statistictbPO);
        return "INSERT INTO " + DatabaseTableNames._statistictb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*usertbPOInsert*/
    public String getInsertUsertbPOSql(UsertbPO usertbPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getUsertbPOColnameList(usertbPO);
        List<Object> valuesList = checkPOnotNullList.getUsertbPOValuesList(usertbPO);
        return "INSERT INTO " + DatabaseTableNames._usertb + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }

    /*youtiaoPOInsert*/
    public String getInsertYoutiaoPOSql(YoutiaoPO youtiaoPO) {
        CheckPOnotNullList checkPOnotNullList = new CheckPOnotNullList();
        List<Object> colnameList = checkPOnotNullList.getYoutiaoPOColnameList(youtiaoPO);
        List<Object> valuesList = checkPOnotNullList.getYoutiaoPOValuesList(youtiaoPO);
        return "INSERT INTO " + DatabaseTableNames._youtiao + "(" + String.join(",", returnStringToPO(colnameList)) + ") VALUES ('" + String.join("','", returnStringToPO(valuesList)) + "')";
    }


}
