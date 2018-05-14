package com.zxd.zcloud.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxd.zcloud.dao.UserMapper;
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
		
		System.out.println(user);
		
		int rows = userMapper.insertSelective(user);
		
		System.out.println(rows);
		
	}
	
	
	

}
