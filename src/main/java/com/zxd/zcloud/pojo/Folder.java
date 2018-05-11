package com.zxd.zcloud.pojo;

import java.sql.Timestamp;


public class Folder {
    private Integer id;

    private String folderName;

    private Folder folderCreator;

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

    public Folder getFolderCreator() {
        return folderCreator;
    }

    public void setFolderCreator(Folder folderCreator) {
        this.folderCreator = folderCreator;
    }

    public Folder getFolderParent() {
        return folderParent;
    }

    public void setFolderParent(Folder folderParent) {
        this.folderParent = folderParent;
    }

    public Date getFolderCreatetime() {
        return folderCreatetime;
    }

    public void setFolderCreatetime(Timestamp folderCreatetime) {
        this.folderCreatetime = folderCreatetime;
    }
}