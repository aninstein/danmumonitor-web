package build;

import java.io.*;


public class WriteTxt {
	
	public void writePOStaticString(File file,String columnsName) throws IOException {
		BufferedWriter bufferedWriter = null;
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file,true));
		try {
			bufferedWriter =new BufferedWriter(outputStreamWriter);
			String str = "\n";
			if(!columnsName.equals("\n")){
				str="public static String _"+columnsName+"=\""+columnsName+"\";";
			}
			System.out.println(str);
			//追加
			bufferedWriter.append(str+"\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//使用缓冲区的时候要注意刷新
			bufferedWriter.flush();
			//关闭缓冲区的对象,实际上是关闭与它关联的流对象最好放在finally执行
			bufferedWriter.close();
		}
		
	}
	
	public void writeAppend(File file,String str) throws IOException {
		BufferedWriter bufferedWriter = null;
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file,true));
		try {
			bufferedWriter =new BufferedWriter(outputStreamWriter);
			//追加
			bufferedWriter.append(str+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//使用缓冲区的时候要注意刷新
			bufferedWriter.flush();
			//关闭缓冲区的对象,实际上是关闭与它关联的流对象最好放在finally执行
			bufferedWriter.close();
		}
	}
	
	public void writeChecknullMap(File file,String tableName,String columnsName) throws IOException {
		BufferedWriter bufferedWriter = null;
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file,true));
		String Bcol=columnsName.substring(0,1).toUpperCase()+columnsName.substring(1);//首字母大写
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			bufferedWriter =new BufferedWriter(outputStreamWriter);
			String str = "";
			if(!columnsName.equals("\n")){
				str="if("+tableName+"PO.get"+Bcol+"()!=null){\n"+
						"	map.put("+Btab+"PO._"+columnsName+", "+tableName+"PO.get"+Bcol+"());"+
						"}";
			}
			System.out.println(str);
			bufferedWriter.append(str+"\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//使用缓冲区的时候要注意刷新
			bufferedWriter.flush();
			//关闭缓冲区的对象,实际上是关闭与它关联的流对象最好放在finally执行
			bufferedWriter.close();
		}
	}
	
	public void writeCheckPOColumnString(File file,String tableName,String columnsName) throws Exception {
		BufferedWriter bufferedWriter = null;
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file,true));
		String Bcol=columnsName.substring(0,1).toUpperCase()+columnsName.substring(1);//首字母大写
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			bufferedWriter =new BufferedWriter(outputStreamWriter);
			String str = "";
			if(!columnsName.equals("\n")){
				str="if("+tableName+"PO.get"+Bcol+"()!=null){\n"+
						"	colnameList.add("+Btab+"PO._"+columnsName+");\n"+
						"}";
			}
			System.out.println(str);
			//追加
			bufferedWriter.append(str+"\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//使用缓冲区的时候要注意刷新
			bufferedWriter.flush();
			//关闭缓冲区的对象,实际上是关闭与它关联的流对象最好放在finally执行
			bufferedWriter.close();
		}
	}
	
	public void writeCheckPOValuesString(File file,String tableName,String columnsName) throws Exception {


		BufferedWriter bufferedWriter = null;
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file,true));
		String Bcol=columnsName.substring(0,1).toUpperCase()+columnsName.substring(1);//首字母大写
		try {
			bufferedWriter =new BufferedWriter(outputStreamWriter);
			String str = "";
			if(!columnsName.equals("\n")){
				str="if("+tableName+"PO.get"+Bcol+"()!=null){\n"+
						"	valuesList.add("+tableName+"PO.get"+Bcol+"());\n"+
						"}";
			}
			System.out.println(str);
			//追加
			bufferedWriter.append(str+"\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//使用缓冲区的时候要注意刷新
			bufferedWriter.flush();
			//关闭缓冲区的对象,实际上是关闭与它关联的流对象最好放在finally执行
			bufferedWriter.close();
		}
	}
	
	public void writeCreateInsertPO(File file,String tableName) {
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			
			String functionStr="public String getInsert"+Btab+"POSql("+Btab+"PO "+tableName+"PO) {\n" 
					+ "\t\tCheckPOnotNullList checkPOnotNullList=new CheckPOnotNullList();\n" 
					+ "\t\tList<Object> colnameList = checkPOnotNullList.get"+Btab+"POColnameList("+tableName+"PO);\n" 
					+ "\t\tList<Object> valuesList = checkPOnotNullList.get"+Btab+"POValuesList("+tableName+"PO);\n" 
					+ "\t\treturn \"INSERT INTO \" + DatabaseTableNames._"+tableName+" + \"(\" + String.join(\",\", returnStringToPO(colnameList))\n" 
					+ "\t\t\t\t+ \") VALUES ('\" + String.join(\"','\", returnStringToPO(valuesList)) + \"')\";\n" + "\t}";
			System.out.println(functionStr);
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeCreateUpdatePO(File file,String tableName) {
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			
			String functionStr="public String getUpdate"+Btab+"POSql("+Btab+"PO "+tableName+"PO,Map<String,Object> conditionMap) {\n" 
					+ "\t\tCheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();\n" 
					+ "\t\tMap<String, Object> map = checkPOnotNullMap.get"+Btab+"POMap("+tableName+"PO);\n" 
					+ "\t\treturn \"UPDATE \" + DatabaseTableNames._"+tableName+" + \n" 
					+ "\t\t\t\t\" SET \"+String.join(\",\", returnSetStringByMap(map))+\n"
					+ "\t\t\t\t\" WHERE \"+String.join(\" AND \", returnConditionStringByMap(conditionMap));\n"
					+ "\t}";
			System.out.println(functionStr);
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeCreateDeletePO(File file,String tableName) {
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {

			String functionStr="public String delete"+Btab+"lePOSql("+Btab+"PO "+tableName+"PO) {\n"
					+ "        CheckPOnotNullMap checkPOnotNullMap = new CheckPOnotNullMap();\n"
					+ "        Map<String, Object> map = checkPOnotNullMap.get"+Btab+"POMap("+tableName+"PO);\n"
					+ "        return \"DELETE FROM \"+DatabaseTableNames._"+tableName+"+\" "
					+ 			" WHERE \"+String.join(\",\",returnKVString(map));\n"
					+ "    }";
			System.out.println(functionStr);
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeCreateObjectToPO(File file,String tableName){
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {

			String functionStr="public static List<"+Btab+"PO> objectTo"+Btab+"PO(List<Object> objectList) {\n"
					+ "        List<"+Btab+"PO> list=new ArrayList<>();\n"
					+ "        for (Object object:objectList){\n"
					+ "            list.add(("+Btab+"PO) object);\n"
					+ "        }\n"
					+ "        return list;\n" + "    }";
			System.out.println(functionStr);
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeChecknullMapHeader(File file,String tableName) {
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			String functionStr="public Map<String,Object> get"+Btab+"POMap("+Btab+"PO "+tableName+"PO) {"+
								"	Map<String,Object> map=new HashMap<String, Object>();";
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeGetColumnListHeader(File file,String tableName) {
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			String functionStr="public List<Object> get"+Btab+"POColnameList("+Btab+"PO "+tableName+"PO) {\n"+
								"	List<Object> colnameList=new ArrayList<Object>();\n";
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeGetValuesListHeader(File file,String tableName) {
		String Btab=tableName.substring(0,1).toUpperCase()+tableName.substring(1);//首字母大写
		try {
			String functionStr="public List<Object> get"+Btab+"POValuesList("+Btab+"PO "+tableName+"PO) {\n"+
								"List<Object> valuesList = new ArrayList<>();\n";
			writeAppend(file,functionStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeReturn(File file,String returnCon) {
		try {
			String endStr="		return "+returnCon+";\n"+
							"}\n";
			writeAppend(file,endStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
