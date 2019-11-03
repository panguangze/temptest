package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Setter
@Getter
@ToString
@Entity
public class ReportEntity extends BaseEntity {
    private String uuid;
    private String customId;
    @Column(length = 30)
    private String number;
    @Column(length = 120)
    private String FilePath;
    private int creatUserId;

}
