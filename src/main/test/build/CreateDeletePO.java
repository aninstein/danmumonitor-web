package build;


import com.aninstein.util.DatabaseTableNames;
import com.aninstein.util.MysqlTool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20.
 */
public class CreateDeletePO {

    public static void main(String[] args) throws Exception {

        MysqlTool mysqlTool=new MysqlTool();
        WriteTxt writeTxt=new WriteTxt();
        String databaseName= DatabaseTableNames._dataBaseName;

        //生成CheckPOisNull类的函数
        File file=new File("F:\\Git\\myGithublibrary\\danmumonitor\\src\\main\\test\\out\\createdelete.txt");

        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
        //清空现有内容
        bufferedWriter.write("");

        //获取所有表格名
        List<String> tableList=mysqlTool.getTableNameByDatabaseName(databaseName);
        for(String tableName:tableList){
            writeTxt.writeAppend(file, "/*"+tableName+"PODelete*/");//函数头注释
            writeTxt.writeCreateDeletePO(file, tableName);
        }

    }

}
