package com.zxd.zcloud.mapper.test;

import java.sql.Timestamp;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxd.zcloud.dao.FolderMapper;
import com.zxd.zcloud.pojo.Folder;
import com.zxd.zcloud.pojo.User;

/**
* @Title: FolderMapperTest.java  
* @Package com.zxd.zcloud.test  
* @Description: TODO
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2018年5月14日 下午7:34:10
* @version 1.0
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class FolderMapperTest {
	
	@Autowired
	FolderMapper folderMapper;
	
	
	@Test
	public void testInsert() {
		
		User user = new User();
		user.setId(1);
		
		Folder folder = new Folder();
		folder.setFolderUUID(UUID.randomUUID().toString());
		folder.setFolderName("root");
		folder.setFolderCreator(user);
		folder.setFolderParent(null);
		folder.setFolderCreatetime(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(folder);
		
		int rows = folderMapper.insert(folder);
		
		System.out.println(rows);
		
	}
	

}
