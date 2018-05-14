package com.zxd.zcloud.mapper.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
* @Title: MBGTest.java  
* @Package com.zxd.zcloud.test  
* @Description: TODO
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2018年5月11日 下午3:38:57
* @version 1.0
*/

public class MBGTest {
	
	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		
	   List<String> warnings = new ArrayList<String>();
	   boolean overwrite = true;
	   File configFile = new File("mbg.xml");
	   ConfigurationParser cp = new ConfigurationParser(warnings);
	   Configuration config = cp.parseConfiguration(configFile);
	   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
	   myBatisGenerator.generate(null);
		
		
	}

}
