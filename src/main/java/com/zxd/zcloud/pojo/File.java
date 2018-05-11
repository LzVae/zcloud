package com.zxd.zcloud.pojo;

import java.sql.Timestamp;


public class File {
    private Integer id;

    private String fileName;

    private String fileSize;

    private String filePath;

    private User fileCreator;

    private Folder fileParentFolder;

    private Timestamp fileCreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public User getFileCreator() {
        return fileCreator;
    }

    public void setFileCreator(User fileCreator) {
        this.fileCreator = fileCreator;
    }

    public Folder getFileParentFolder() {
        return fileParentFolder;
    }

    public void setFileParentFolder(Folder fileParentFolder) {
        this.fileParentFolder = fileParentFolder;
    }

    public Timestamp getFileCreatetime() {
        return fileCreatetime;
    }

    public void setFileCreatetime(Timestamp fileCreatetime) {
        this.fileCreatetime = fileCreatetime;
    }
}