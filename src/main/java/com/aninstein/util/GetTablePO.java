package com.aninstein.util;

import com.aninstein.po.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class GetTablePO {

    private String tableName;

    private DBTool dbTool = new DBTool();
    private Connection connection = dbTool.getConnection();

    public GetTablePO() {
    }

    public GetTablePO(String tableName) {
        this.tableName = tableName;
    }

    public Object getNewPO() {
        if (this.tableName.equals(DatabaseTableNames._alarmtb)) {
            return new AlarmtbPO();
        } else if (this.tableName.equals(DatabaseTableNames._anchormapper)) {
            return new AnchormapperPO();
        } else if (this.tableName.equals(DatabaseTableNames._bantb)) {
            return new BantbPO();
        } else if (this.tableName.equals(DatabaseTableNames._danmutb)) {
            return new DanmutbPO();
        } else if (this.tableName.equals(DatabaseTableNames._infomanagetb)) {
            return new InfomanagetbPO();
        } else if (this.tableName.equals(DatabaseTableNames._monitortb)) {
            return new MonitortbPO();
        } else if (this.tableName.equals(DatabaseTableNames._notest)) {
            return new NotestPO();
        } else if (this.tableName.equals(DatabaseTableNames._reporttb)) {
            return new ReporttbPO();
        } else if (this.tableName.equals(DatabaseTableNames._statistictb)) {
            return new StatistictbPO();
        } else if (this.tableName.equals(DatabaseTableNames._usertb)) {
            return new UsertbPO();
        } else if (this.tableName.equals(DatabaseTableNames._youtiao)) {
            return new YoutiaoPO();
        }
        return null;
    }

    public Object getNewPOByTablename(String table) {
        if (table.equals(DatabaseTableNames._alarmtb)) {
            return new AlarmtbPO();
        } else if (table.equals(DatabaseTableNames._anchormapper)) {
            return new AnchormapperPO();
        } else if (table.equals(DatabaseTableNames._bantb)) {
            return new BantbPO();
        } else if (table.equals(DatabaseTableNames._danmutb)) {
            return new DanmutbPO();
        } else if (table.equals(DatabaseTableNames._infomanagetb)) {
            return new InfomanagetbPO();
        } else if (table.equals(DatabaseTableNames._monitortb)) {
            return new MonitortbPO();
        } else if (table.equals(DatabaseTableNames._notest)) {
            return new NotestPO();
        } else if (table.equals(DatabaseTableNames._reporttb)) {
            return new ReporttbPO();
        } else if (table.equals(DatabaseTableNames._statistictb)) {
            return new StatistictbPO();
        } else if (table.equals(DatabaseTableNames._usertb)) {
            return new UsertbPO();
        } else if (table.equals(DatabaseTableNames._youtiao)) {
            return new YoutiaoPO();
        }
        return null;
    }

    public Object getThePOByTableName(String json) {//确定只有一个返回值的用这个
        List<Object> listObject = getThePOListByTableName(json);
        if (listObject.size() == 1) {
            return listObject.get(0);
        }
        return new Exception("查询结果不唯一！");
    }

    public List<Object> getThePOListByTableName(String json) {//返回一个列表的
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (this.tableName.equals(DatabaseTableNames._alarmtb)) {
                return objectMapper.readValue(json, new TypeReference<List<AlarmtbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._anchormapper)) {
                return objectMapper.readValue(json, new TypeReference<List<AnchormapperPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._bantb)) {
                return objectMapper.readValue(json, new TypeReference<List<BantbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._danmutb)) {
                return objectMapper.readValue(json, new TypeReference<List<DanmutbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._infomanagetb)) {
                return objectMapper.readValue(json, new TypeReference<List<InfomanagetbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._monitortb)) {
                return objectMapper.readValue(json, new TypeReference<List<MonitortbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._notest)) {
                return objectMapper.readValue(json, new TypeReference<List<NotestPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._reporttb)) {
                return objectMapper.readValue(json, new TypeReference<List<ReporttbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._statistictb)) {
                return objectMapper.readValue(json, new TypeReference<List<StatistictbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._usertb)) {
                return objectMapper.readValue(json, new TypeReference<List<UsertbPO>>() {
                });
            } else if (this.tableName.equals(DatabaseTableNames._youtiao)) {
                return objectMapper.readValue(json, new TypeReference<List<YoutiaoPO>>() {
                });
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public Object getTablePOBySql(String tableName, String sql) throws SQLException, JsonProcessingException {
        setTableName(tableName);//把表名赋值给成员变量
        //初始化所需工具

        //进行查表操作
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String objectPoJson = JsonTool.resultSetToJson(resultSet);

        return getThePOByTableName(objectPoJson);
    }

    public List<Object> getTablePOListBySql(String tableName, String sql) throws SQLException, JsonProcessingException {
        setTableName(tableName);//把表名赋值给成员变量

        //初始化所需工具

        //进行查表操作
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String objectPoJson = JsonTool.resultSetToJson(resultSet);

        return getThePOListByTableName(objectPoJson);
    }

    //把ListPO变成ListObjectS
    public static List<Object> POtoObjectList(List list) {
        List<Object> objectList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            objectList.add((Object) list.get(i));
        }
        return objectList;
    }

    /* Object to alarmtbPO */
    public static List<AlarmtbPO> objectToAlarmtbPO(List<Object> objectList) {
        List<AlarmtbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((AlarmtbPO) object);
        }
        return list;
    }

    /* Object to anchormapperPO */
    public static List<AnchormapperPO> objectToAnchormapperPO(List<Object> objectList) {
        List<AnchormapperPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((AnchormapperPO) object);
        }
        return list;
    }

    /* Object to bantbPO */
    public static List<BantbPO> objectToBantbPO(List<Object> objectList) {
        List<BantbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((BantbPO) object);
        }
        return list;
    }

    /* Object to danmutbPO */
    public static List<DanmutbPO> objectToDanmutbPO(List<Object> objectList) {
        List<DanmutbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((DanmutbPO) object);
        }
        return list;
    }

    /* Object to infomanagetbPO */
    public static List<InfomanagetbPO> objectToInfomanagetbPO(List<Object> objectList) {
        List<InfomanagetbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((InfomanagetbPO) object);
        }
        return list;
    }

    /* Object to monitortbPO */
    public static List<MonitortbPO> objectToMonitortbPO(List<Object> objectList) {
        List<MonitortbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((MonitortbPO) object);
        }
        return list;
    }

    /* Object to notestPO */
    public static List<NotestPO> objectToNotestPO(List<Object> objectList) {
        List<NotestPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((NotestPO) object);
        }
        return list;
    }

    /* Object to reporttbPO */
    public static List<ReporttbPO> objectToReporttbPO(List<Object> objectList) {
        List<ReporttbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((ReporttbPO) object);
        }
        return list;
    }

    /* Object to statistictbPO */
    public static List<StatistictbPO> objectToStatistictbPO(List<Object> objectList) {
        List<StatistictbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((StatistictbPO) object);
        }
        return list;
    }

    /* Object to usertbPO */
    public static List<UsertbPO> objectToUsertbPO(List<Object> objectList) {
        List<UsertbPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((UsertbPO) object);
        }
        return list;
    }

    /* Object to youtiaoPO */
    public static List<YoutiaoPO> objectToYoutiaoPO(List<Object> objectList) {
        List<YoutiaoPO> list = new ArrayList<>();
        for (Object object : objectList) {
            list.add((YoutiaoPO) object);
        }
        return list;
    }


    /**
     * 以下是getting和setting
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    public GetTablePO setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
}
