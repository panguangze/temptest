package com.byoryn.rppdb.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@ToString
@MappedSuperclass
public class BaseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "create_time", updatable = false, columnDefinition = "Date")
    private Date createTime;
    @Column(name = "operate_interface", length = 30)
    private String operateInterface;
    @Column(name = "interface_message", length = 30)
    private String interfaceMessage;
}
