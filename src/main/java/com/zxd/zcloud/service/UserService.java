package com.zxd.zcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.zcloud.dao.UserMapper;
import com.zxd.zcloud.pojo.User;

/**
* @Title: UserService.java  
* @Package com.zxd.zcloud.service  
* @Description: TODO
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2018年5月16日 下午2:59:47
* @version 1.0
*/
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> getByUserName(String username){
		
		return userMapper.selectByUserNameWithRootFolder(username);
		
	}
	
}
