package build;


import com.aninstein.util.DatabaseTableNames;
import com.aninstein.util.MysqlTool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CreateCheckNullString {

public static void main(String[] args) throws Exception {
		
		MysqlTool mysqlTool=new MysqlTool();
		WriteTxt writeTxt=new WriteTxt();
		String databaseName= DatabaseTableNames._dataBaseName;
		
		//可以生成if语句判断是否为空
//		File checknullFile=new File("D:\\myEclipse2017CIWork Space\\teachcheckoutsys\\src\\Test\\checknull.txt");
		
		//生成CheckPOisNull类的函数
		File checknullFile=new File("F:\\Git\\myGithublibrary\\danmumonitor\\src\\main\\test\\out\\checkpoisnull.txt");
		
		FileWriter fileWriter=new FileWriter(checknullFile);
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		//清空现有内容
		bufferedWriter.write("");
		
		//获取所有表格名
		List<String> tableList=mysqlTool.getTableNameByDatabaseName(databaseName);
		for(String tableName:tableList){
			
			//获取每个表格的字段名
			List<String> columnsList=mysqlTool.getTableColumnsByTableName(databaseName, tableName);
			
			//书写column函数
			writeTxt.writeAppend(checknullFile, "/*"+tableName+"PO字段列表*/");//函数头注释
			writeTxt.writeGetColumnListHeader(checknullFile, tableName);//函数头
			for(String columns:columnsList){//判断的if
				writeTxt.writeCheckPOColumnString(checknullFile, tableName, columns);
			}
			writeTxt.writeReturn(checknullFile, "colnameList");//函数的返回值
			writeTxt.writeAppend(checknullFile, "\n");
			
			//书写value函数
			writeTxt.writeAppend(checknullFile, "/*"+tableName+"PO值的表格*/");//函数头注释
			writeTxt.writeGetValuesListHeader(checknullFile, tableName);//函数头
			for(String columns:columnsList){//判断的if
				writeTxt.writeCheckPOValuesString(checknullFile, tableName, columns);
			}
			writeTxt.writeReturn(checknullFile, "valuesList");//函数的返回值
			writeTxt.writeAppend(checknullFile, "\n");
		}
		
	}
	
}
