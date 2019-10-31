package com.byoryn.entity;

import com.byoryn.base.BaseEntity;
import com.byoryn.utils.TypeEnumConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.util.Date;

public class PostEntity extends BaseEntity {

    public PostEntity() {

    }

    @Column(length = 30)
    private String company;
    @Column(name = "post_num", length = 30)
    private String postNum;
    @Column(name = "post_time", columnDefinition = "Date")
    private Date postTime;
    @Column(name = "post_price")
    private float postPrice;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType received;
    @Column(name = "received_time", columnDefinition = "Date")
    private Date receivedTime;
    @Column(length = 30)
    private String receiver;
    @Column(length = 30)
    private String sender;
    @Column(name = "create_user_id")
    private int createUserId;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public float getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(float postPrice) {
        this.postPrice = postPrice;
    }

    public BoolType getReceived() {
        return received;
    }

    public void setReceived(BoolType received) {
        this.received = received;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }
}
