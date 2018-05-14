package com.zxd.zcloud.dao;

import com.zxd.zcloud.pojo.User;

/**
 * 
 * @ClassName: UserMapper
 * @Description: TODO
 * @author zhuxindong
 * @date 2018年5月14日
 */
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
	
	
	/**
	 * 有选择的修改
	 * @Title: updateByUserNameSelective  
	 * @Description: TODO
	 * @return int  
	 * @param username
	 * @return
	 */
	int updateByUserNameSelective(User user);
    
}