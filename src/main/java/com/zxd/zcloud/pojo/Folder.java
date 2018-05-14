package com.zxd.zcloud.pojo;

import java.sql.Timestamp;

/**
 * 
 * @ClassName: Folder
 * @Description: TODO
 * @author zhuxindong
 * @date 2018年5月14日
 */
public class Folder {
    private Integer id;

    private String folderName;

    private User folderCreator;

    private Folder folderParent;

    private Timestamp folderCreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    public User getFolderCreator() {
        return folderCreator;
    }

    public void setFolderCreator(User folderCreator) {
        this.folderCreator = folderCreator;
    }

    public Folder getFolderParent() {
        return folderParent;
    }

    public void setFolderParent(Folder folderParent) {
        this.folderParent = folderParent;
    }

    public Timestamp getFolderCreatetime() {
        return folderCreatetime;
    }

    public void setFolderCreatetime(Timestamp folderCreatetime) {
        this.folderCreatetime = folderCreatetime;
    }
}