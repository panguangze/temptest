package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.BoolType;
import com.byoryn.rppdb.utils.CodeValueConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

@Setter
@Getter
@ToString
@Entity
public class SequenceEntity extends BaseEntity {
    @Column(length = 120)
    private String FilePath;
    private int createUserId;
    private boolean active;
}
