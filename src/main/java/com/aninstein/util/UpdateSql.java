package com.aninstein.util;


import com.aninstein.po.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UpdateSql {

    public String tanleName;
    DBTool dbTool = new DBTool();
    Connection connection = dbTool.getConnection();

    public UpdateSql() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UpdateSql(String tanleName) {
        super();
        this.tanleName = tanleName;
    }

    public String getTanleName() {
        return tanleName;
    }

    public void setTanleName(String tanleName) {
        this.tanleName = tanleName;
    }

    // 执行update语句
    public int execUpdate(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
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
    public String[] returnSetStringByMap(Map<String, Object> map) {
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

    //转化conditionMap的函数
    public String[] returnConditionStringByMap(Map<String, Object> map) {
        String[] kvS = new String[map.size()];
        int i = 0;
        // 遍历map
        for (Map.Entry<String, Object> myMap : map.entrySet()) {
            kvS[i] = myMap.getKey() + "='" + myMap.getValue() + "'";
            i++;
        }
        return kvS;
    }

    /*alarmtbPOUpdate*/
    public String getUpdateAlarmtbPOSql(AlarmtbPO alarmtbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getAlarmtbPOMap(alarmtbPO);
        return "UPDATE " + DatabaseTableNames._alarmtb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*anchormapperPOUpdate*/
    public String getUpdateAnchormapperPOSql(AnchormapperPO anchormapperPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getAnchormapperPOMap(anchormapperPO);
        return "UPDATE " + DatabaseTableNames._anchormapper + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*bantbPOUpdate*/
    public String getUpdateBantbPOSql(BantbPO bantbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getBantbPOMap(bantbPO);
        return "UPDATE " + DatabaseTableNames._bantb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*danmutbPOUpdate*/
    public String getUpdateDanmutbPOSql(DanmutbPO danmutbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getDanmutbPOMap(danmutbPO);
        return "UPDATE " + DatabaseTableNames._danmutb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*infomanagetbPOUpdate*/
    public String getUpdateInfomanagetbPOSql(InfomanagetbPO infomanagetbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getInfomanagetbPOMap(infomanagetbPO);
        return "UPDATE " + DatabaseTableNames._infomanagetb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*monitortbPOUpdate*/
    public String getUpdateMonitortbPOSql(MonitortbPO monitortbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getMonitortbPOMap(monitortbPO);
        return "UPDATE " + DatabaseTableNames._monitortb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*notestPOUpdate*/
    public String getUpdateNotestPOSql(NotestPO notestPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getNotestPOMap(notestPO);
        return "UPDATE " + DatabaseTableNames._notest + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*reporttbPOUpdate*/
    public String getUpdateReporttbPOSql(ReporttbPO reporttbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getReporttbPOMap(reporttbPO);
        return "UPDATE " + DatabaseTableNames._reporttb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*statistictbPOUpdate*/
    public String getUpdateStatistictbPOSql(StatistictbPO statistictbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getStatistictbPOMap(statistictbPO);
        return "UPDATE " + DatabaseTableNames._statistictb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*usertbPOUpdate*/
    public String getUpdateUsertbPOSql(UsertbPO usertbPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getUsertbPOMap(usertbPO);
        return "UPDATE " + DatabaseTableNames._usertb + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }

    /*youtiaoPOUpdate*/
    public String getUpdateYoutiaoPOSql(YoutiaoPO youtiaoPO, Map<String, Object> conditionMap) {
        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();
        Map<String, Object> map = checkPOnotNullMap.getYoutiaoPOMap(youtiaoPO);
        return "UPDATE " + DatabaseTableNames._youtiao + " SET " + String.join(",", returnSetStringByMap(map)) + " WHERE " + String.join(" AND ", returnConditionStringByMap(conditionMap));
    }


}
