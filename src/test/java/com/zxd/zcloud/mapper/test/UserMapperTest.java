package com.zxd.zcloud.mapper.test;

import java.sql.Timestamp;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxd.zcloud.dao.FolderMapper;
import com.zxd.zcloud.dao.UserMapper;
import com.zxd.zcloud.pojo.Folder;
import com.zxd.zcloud.pojo.User;

/**
* @Title: UserMapperTest.java  
* @Package com.zxd.zcloud.test  
* @Description: TODO
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2018年5月14日 下午4:18:03
* @version 1.0
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserMapperTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	FolderMapper folderMapper;
	
	/**
	 * 测试增加用户的功能  ---测试成功
	 * @Title: testInsertSelective  
	 * @Description: TODO
	 * @return void
	 */
	@Test
	public void testInsertSelective() {
		
		User user = new User();
		
		user.setUsername("admin1");
		user.setPassword("admin1");
		user.setCreatetime(new Timestamp(System.currentTimeMillis()));
		user.setRootFolder(null);
		
		System.out.println(user);
		
		int rows = userMapper.insertSelective(user);
		
		System.out.println("rows: "+rows);
		System.out.println("主键: "+user.getId());
		
	}
	
	
	/**
	 * 注册功能，相当于提前测试了，理论上应该在UserService里面去测试 ----测试通过
	 * @Title: testRegister  
	 * @Description: TODO
	 * @return void
	 */
	@Test
	public void testRegister() {
		
		User user = new User();
		user.setUsername("root");
		user.setPassword("root");
		user.setCreatetime(new Timestamp(System.currentTimeMillis()));
		
		/**
		 * 新增用户
		 */
		System.out.println(user);
		userMapper.insertSelective(user);	
		System.out.println(user);
		
		/**
		 * 为该用户增加文件夹根节点
		 */
		Folder folder = new Folder();
		folder.setFolderUUID(UUID.randomUUID().toString());
		folder.setFolderCreator(user);
		folder.setFolderName("root");
		folder.setFolderParent(null);
		folder.setFolderCreatetime(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(folder);
		folderMapper.insert(folder);
		System.out.println(folder);
		
		/**
		 * 更新用户文件夹根节点信息
		 */
		user.setRootFolder(folder);
		System.out.println(user);
		userMapper.updateByUserNameSelective(user);
		
	}
	
	
	
	/**
	 * 测试修改用户信息 ----测试通过
	 * @Title: testUpdate  
	 * @Description: TODO
	 * @return void
	 */
	@Test
	public void testUpdateByUserNameSelective() {
		
		User user = new User();
		
		user.setUsername("admin1");
		user.setPassword("admin2");
		user.setCreatetime(new Timestamp(System.currentTimeMillis()));
		user.setRootFolder(null);
		
		System.out.println(user);
		
		int rows = userMapper.updateByUserNameSelective(user);
		
		System.out.println(rows);
		
	}
	

}
