package build;

import com.aninstein.util.DBTool;
import com.aninstein.util.DatabaseTableNames;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/2/1.
 */
public class CreateDatabaseName {

    //获取数据库所有表格名
    public static List<String> getTableNameByDatabaseName(String databaseName) throws Exception {

        DBTool dbTool=new DBTool();
        Connection connection=dbTool.getConnection();

        //查询所有表名的sql
        String selectNameSql="SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = '"+databaseName+"'";

        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(selectNameSql);

        //遍历表名、视图名存入List
        List<String> tableList=new ArrayList<String>();

        //正则表达式用于去除视图名
        Pattern pattern = Pattern.compile(".*view.*");

        while(resultSet.next()){
            //先判断是不是视图
            Matcher matcher = pattern.matcher(resultSet.getString("TABLE_NAME"));

            //如果不是视图
            if(!matcher.matches()){
                tableList.add(resultSet.getString("TABLE_NAME"));
            }
        }
        return tableList;
    }

    public static void main(String[] args) throws Exception {
        List<String> tableList=CreateDatabaseName.getTableNameByDatabaseName(DatabaseTableNames._dataBaseName);

        for (String tablename:tableList){
            System.out.printf("public static String _%s=\"%s\";\n",tablename,tablename);
        }
    }

}
