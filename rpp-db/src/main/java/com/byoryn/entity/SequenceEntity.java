package com.byoryn.entity;

import com.byoryn.base.BaseEntity;
import com.byoryn.utils.TypeEnumConverter;

import javax.persistence.Column;
import javax.persistence.Convert;

public class SequenceEntity extends BaseEntity {
    @Column(name = "file_path", length = 120)
    private String FilePath;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType active;

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public BoolType getActive() {
        return active;
    }

    public void setActive(BoolType active) {
        this.active = active;
    }
}
