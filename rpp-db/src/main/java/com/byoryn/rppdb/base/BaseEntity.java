package com.byoryn.rppdb.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author panguangze
 * @date 2019/10/31
 * 基本Entity类，一般情况下所有的Entity都继承该类
 */
@Setter
@Getter
@ToString
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
}
