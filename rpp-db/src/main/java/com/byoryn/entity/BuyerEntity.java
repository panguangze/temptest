package com.byoryn.entity;

import com.byoryn.base.BaseEntity;
import com.byoryn.utils.TypeEnumConverter;

import javax.persistence.Column;
import javax.persistence.Convert;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public class BuyerEntity extends BaseEntity {
    public BuyerEntity() {

    }

    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String phoneNum;
    @Column(length = 120)
    private String email;
    private String address;

    @Convert(converter = TypeEnumConverter.class)
    private BuyerRoleType buyerRoleType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BuyerRoleType getBuyerRoleType() {
        return buyerRoleType;
    }

    public void setBuyerRoleType(BuyerRoleType buyerRoleType) {
        this.buyerRoleType = buyerRoleType;
    }
}
