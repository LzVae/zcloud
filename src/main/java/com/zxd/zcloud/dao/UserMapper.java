package com.zxd.zcloud.dao;

import java.util.List;

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
	
	/**
	 * 根据用户名查询用户，顺带查询出该用户的文件夹根节点
	 * @Title: selectByUserNameWithRootFolder  
	 * @Description: TODO
	 * @return List<User>  
	 * @param username
	 * @return
	 */
	List<User> selectByUserNameWithRootFolder(String username);
	
	
    
}