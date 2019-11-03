package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.GenderType;
import com.byoryn.rppdb.enums.IDType;
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
public class IdentifierEntity extends BaseEntity {
    @Column(length = 30)
    private String name;
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private GenderType genderType;
    @Column(columnDefinition = "Date")
    private Date birthday;
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private IDType idType;
    @Column(length = 30)
    private String idNum;
    @Column(length = 120)
    private String idTypeFirstImg;
    @Column(length = 120)
    private String idTypeSecondImg;
    private int creatUserId;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "identifier_id", referencedColumnName = "id")
    private Set<SampleEntity> sampleEntities;

}
