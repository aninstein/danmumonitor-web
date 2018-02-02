package build;


import com.aninstein.util.DatabaseTableNames;
import com.aninstein.util.MysqlTool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CreateCheckNullMap {
	

public static void main(String[] args) throws Exception {
		
		MysqlTool mysqlTool=new MysqlTool();
		WriteTxt writeTxt=new WriteTxt();
		String databaseName= DatabaseTableNames._dataBaseName;
		
		//生成CheckPOisNull类的函数
		File checknullFile=new File("F:\\Git\\myGithublibrary\\danmumonitor\\src\\main\\test\\out\\checkponotnullmap.txt");
		
		FileWriter fileWriter=new FileWriter(checknullFile);
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		//清空现有内容
		bufferedWriter.write("");
		
		//获取所有表格名
		List<String> tableList=mysqlTool.getTableNameByDatabaseName(databaseName);
		for(String tableName:tableList){
			
			//获取每个表格的字段名
			List<String> columnsList=mysqlTool.getTableColumnsByTableName(databaseName, tableName);
			
			//书写非空值map函数
			writeTxt.writeAppend(checknullFile, "/*"+tableName+"PO非空值的Map*/");//函数头注释
			writeTxt.writeChecknullMapHeader(checknullFile, tableName);//函数头
			for(String columns:columnsList){//判断的if
				writeTxt.writeChecknullMap(checknullFile, tableName, columns);
			}
			writeTxt.writeReturn(checknullFile, "map");//函数的返回值
			writeTxt.writeAppend(checknullFile, "\n");
		}
		
	}

}
