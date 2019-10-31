package com.byoryn.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @author panguangze
 * @data 2019/10/31
 * 基本Entity类，一般情况下所有的Entity都继承该类
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 该记录的创建时间，自动生成
     */
    @Column(name = "create_time", updatable = false)
    private Date createTime;

    /**
     * 备注信息不宜过长，varchar(255)，支持保存的utf_8汉字最长为85个
     */
    @Column(name = "addition_info")
    private String additionInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAdditionInfo() {
        return additionInfo;
    }

    public void setAdditionInfo(String additionInfo) {
        this.additionInfo = additionInfo;
    }
}
