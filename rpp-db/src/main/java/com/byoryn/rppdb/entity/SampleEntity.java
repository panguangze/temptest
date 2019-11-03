package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.BoolType;
import com.byoryn.rppdb.enums.SampleStatusType;
import com.byoryn.rppdb.enums.SampleType;
import com.byoryn.rppdb.utils.CodeValueConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
public class SampleEntity extends BaseEntity {
    @Column(length = 30)
    private String number;
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private SampleType sampleType;
    private int quantity;
    @Column(columnDefinition = "Date")
    private Date sampleTime;
    @Column(columnDefinition = "Date")
    private Date receiveTime;
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private BoolType active;
    private int creatUserId;
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private SampleStatusType statusType;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "sample_id", referencedColumnName = "id")
    private Set<SequenceEntity> sequenceEntities;

    @ManyToMany
    @JoinTable(
            name = "samples_posts",
            joinColumns = {@JoinColumn(name = "sample_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "post_id", referencedColumnName = "id")}
    )
    private Set<PostEntity> postEntities;
}
