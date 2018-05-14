package com.zxd.zcloud.dao;

import com.zxd.zcloud.pojo.Folder;

/**
 * 
 * @ClassName: FolderMapper
 * @Description: TODO
 * @author zhuxindong
 * @date 2018年5月14日
 */
public interface FolderMapper {
	
	/**
	 * 新建文件夹
	 * @Title: insert  
	 * @Description: TODO
	 * @return int  
	 * @param folder
	 * @return
	 */
	int insert(Folder folder);
	
   
}