package com.byoryn.entity;

import com.byoryn.base.BaseEntity;

import javax.persistence.Column;

public class ReportEntity extends BaseEntity {
    public ReportEntity() {

    }

    @Column(length = 30)
    private String number;
    @Column(name = "file_path", length = 120)
    private String FilePath;
    @Column(name = "create_user_id")
    private int creatUserId;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public int getCreatUserId() {
        return creatUserId;
    }

    public void setCreatUserId(int creatUserId) {
        this.creatUserId = creatUserId;
    }
}
