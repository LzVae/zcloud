package com.zxd.zcloud.pojo;

import java.sql.Timestamp;
import java.util.List;

/**
 * 
 * @ClassName: User
 * @Description: TODO
 * @author zhuxindong
 * @date 2018年5月14日
 */
public class User {
    private Integer id;

    private String username;

    private String password;

    private Timestamp createtime;
    
    private Folder rootFolder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Folder getRootFolder() {
		return rootFolder;
	}

	public void setRootFolder(Folder rootFolder) {
		this.rootFolder = rootFolder;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", createtime=" + createtime
				+ ", rootFolder=" + rootFolder + "]";
	}
    
    

	
    
	
    
}