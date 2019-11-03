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
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
public class PostEntity extends BaseEntity {

    @Column(length = 30)
    private String company;
    @Column(length = 30)
    private String postNum;
    @Column(columnDefinition = "Date")
    private Date postTime;
    private float postPrice;
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private BoolType received;
    @Column(columnDefinition = "Date")
    private Date receivedTime;
    @Column(length = 30)
    private String receiver;
    @Column(length = 30)
    private String sender;
    private int createUserId;

    @ManyToMany(mappedBy = "postEntities")
    private Set<SampleEntity> sampleEntities;

}
