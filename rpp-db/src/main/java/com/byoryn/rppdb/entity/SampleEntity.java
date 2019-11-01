package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.utils.CodeValueConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.util.Date;

public class SampleEntity extends BaseEntity {
    public SampleEntity() {

    }

    @Column(length = 30)
    private String number;
    @Convert(converter = CodeValueConverter.class)
    private SampleType sampleType;
    private int quantity;
    @Column(name = "sample_time", columnDefinition = "Date")
    private Date sampleTime;
    @Column(name = "receive_time", columnDefinition = "Date")
    private Date receiveTime;
    @Convert(converter = CodeValueConverter.class)
    private BoolType active;
    @Column(name = "create_user_id")
    private int creatUserId;
    @Convert(converter = CodeValueConverter.class)
    private SampleStatusType statusType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SampleType getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public BoolType getActive() {
        return active;
    }

    public void setActive(BoolType active) {
        this.active = active;
    }

    public int getCreatUserId() {
        return creatUserId;
    }

    public void setCreatUserId(int creatUserId) {
        this.creatUserId = creatUserId;
    }

    public SampleStatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(SampleStatusType statusType) {
        this.statusType = statusType;
    }
}
