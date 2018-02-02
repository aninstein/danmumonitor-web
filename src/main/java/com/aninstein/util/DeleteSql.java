package com.aninstein.util;


import com.aninstein.po.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/20.
 */
public class DeleteSql {

    private String tableName;
    private DBTool dbTool = new DBTool();
    private Connection connection = dbTool.getConnection();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    //通过sql语句执行delete
    public int execDelete(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        return count;
    }

    //通过sql语句执行batchdelete
    public int[] execBatchDelete(List<String> sqlList) throws SQLException {
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

    // 把Map的key和value转化为"key"="value"的字符串数组
    public String[] returnKVString(Map<String, Object> map) {
        String[] kvS = new String[map.size()];
        int i = 0;
        // 遍历map
        for (Map.Entry<String, Object> myMap : map.entrySet()) {
            // 所有表格中id是主键不能修改
            if (!myMap.getKey().equals("id")) {
                kvS[i] = myMap.getKey() + "='" + myMap.getValue() + "'";
                i++;
            } else {
                // 如果有id作为map，那么就把数组截去一格
                kvS = Arrays.copyOfRange(kvS, 0, kvS.length - 1);
            }
        }
        return kvS;
    }


    /*alarmtbPODelete*/
    public String deleteAlarmtblePOSql(AlarmtbPO alarmtbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getAlarmtbPOMap(alarmtbPO);
        return "DELETE FROM " + DatabaseTableNames._alarmtb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*anchormapperPODelete*/
    public String deleteAnchormapperlePOSql(AnchormapperPO anchormapperPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getAnchormapperPOMap(anchormapperPO);
        return "DELETE FROM " + DatabaseTableNames._anchormapper + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*bantbPODelete*/
    public String deleteBantblePOSql(BantbPO bantbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getBantbPOMap(bantbPO);
        return "DELETE FROM " + DatabaseTableNames._bantb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*danmutbPODelete*/
    public String deleteDanmutblePOSql(DanmutbPO danmutbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getDanmutbPOMap(danmutbPO);
        return "DELETE FROM " + DatabaseTableNames._danmutb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*infomanagetbPODelete*/
    public String deleteInfomanagetblePOSql(InfomanagetbPO infomanagetbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getInfomanagetbPOMap(infomanagetbPO);
        return "DELETE FROM " + DatabaseTableNames._infomanagetb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*monitortbPODelete*/
    public String deleteMonitortblePOSql(MonitortbPO monitortbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getMonitortbPOMap(monitortbPO);
        return "DELETE FROM " + DatabaseTableNames._monitortb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*notestPODelete*/
    public String deleteNotestlePOSql(NotestPO notestPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getNotestPOMap(notestPO);
        return "DELETE FROM " + DatabaseTableNames._notest + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*reporttbPODelete*/
    public String deleteReporttblePOSql(ReporttbPO reporttbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getReporttbPOMap(reporttbPO);
        return "DELETE FROM " + DatabaseTableNames._reporttb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*statistictbPODelete*/
    public String deleteStatistictblePOSql(StatistictbPO statistictbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getStatistictbPOMap(statistictbPO);
        return "DELETE FROM " + DatabaseTableNames._statistictb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*usertbPODelete*/
    public String deleteUsertblePOSql(UsertbPO usertbPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getUsertbPOMap(usertbPO);
        return "DELETE FROM " + DatabaseTableNames._usertb + "  WHERE " + String.join(",", returnKVString(map));
    }

    /*youtiaoPODelete*/
    public String deleteYoutiaolePOSql(YoutiaoPO youtiaoPO) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getYoutiaoPOMap(youtiaoPO);
        return "DELETE FROM " + DatabaseTableNames._youtiao + "  WHERE " + String.join(",", returnKVString(map));
    }

}
