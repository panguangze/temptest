package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.utils.CodeValueConverter;

import javax.persistence.Column;
import javax.persistence.Convert;

public class SequenceEntity extends BaseEntity {
    @Column(name = "file_path", length = 120)
    private String FilePath;
    @Convert(converter = CodeValueConverter.class)
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
