package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.BuyerRoleType;
import com.byoryn.rppdb.utils.CodeValueConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

/**
 * @author panguangze
 * @date 2019/10/31
 */
@Setter
@Getter
@ToString
@Entity
public class BuyerEntity extends BaseEntity {
    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String phoneNum;
    @Column(length = 120)
    private String email;
    private String address;
    private byte buyerRoleType;
}
