package com.zxd.zcloud.dao;

import com.zxd.zcloud.pojo.User;

public interface UserMapper {
	
	/**
	 * 有选择的 插入
	 * @Title: insertSelective  
	 * @Description: TODO
	 * @return int  
	 * @param user
	 * @return
	 */
	int insertSelective(User user);
    
}