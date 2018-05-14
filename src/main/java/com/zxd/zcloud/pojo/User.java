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
    
    private List<File> files;
    
    private List<Folder> folders;

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}
	

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", createtime=" + createtime
				+ ", files=" + files + ", folders=" + folders + "]";
	}

	
    
	
    
}