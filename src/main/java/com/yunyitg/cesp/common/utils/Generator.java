package com.yunyitg.cesp.common.utils;

//import org.hsqldb.cmdline.SqlFile;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Generator {

	/*public static void startDB(){
		try {
			Class.forName("org.hsqldb.jdbcDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:hsqldb:mem:generator";
		String user = "sa";
		String password = "";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			InputStream inputStream = getResourceAsStream("CreateDB.sql");

			SqlFile sqlFile = new SqlFile(new InputStreamReader(inputStream), "init", System.out, "UTF-8", false, new File("."));
			sqlFile.setConnection(connection);
			sqlFile.execute();

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	public static InputStream getResourceAsStream(String path){
		return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
	}

	public static void main(String[] args) throws Exception {
//		startDB();
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(getResourceAsStream("generator/imports/generatorConfig_message.xml"));
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
	}
}
