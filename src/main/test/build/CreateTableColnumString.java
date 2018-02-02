package build;


import com.aninstein.util.DatabaseTableNames;
import com.aninstein.util.MysqlTool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CreateTableColnumString {
	
	public static void main(String[] args) throws Exception {
		
		MysqlTool mysqlTool=new MysqlTool();
		WriteTxt writeTxt=new WriteTxt();
		String databaseName= DatabaseTableNames._dataBaseName;
		
		File staticStringFile=new File("F:\\Git\\myGithublibrary\\danmumonitor\\src\\main\\test\\out\\staticstring.txt");
		FileWriter fileWriter=new FileWriter(staticStringFile);
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		//清空现有内容
		bufferedWriter.write("");
		
		//获取所有表格名
		List<String> tableList=mysqlTool.getTableNameByDatabaseName(databaseName);
		for(String tableName:tableList){
			
			//获取每个表格的字段名
			List<String> columnsList=mysqlTool.getTableColumnsByTableName(databaseName, tableName);
			
			//把每个字段的内容写到txt里面
			writeTxt.writeAppend(staticStringFile, "/*"+tableName+"的字段名*/");
			for(String columns:columnsList){
				writeTxt.writePOStaticString(staticStringFile, columns);
			}
			writeTxt.writeAppend(staticStringFile, "\n");
		}
		
	}

}
