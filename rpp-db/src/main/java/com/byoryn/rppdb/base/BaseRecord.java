package com.byoryn.rppdb.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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

    public String getOperateInterface() {
        return operateInterface;
    }

    public void setOperateInterface(String operateInterface) {
        this.operateInterface = operateInterface;
    }

    public String getInterfaceMessage() {
        return interfaceMessage;
    }

    public void setInterfaceMessage(String interfaceMessage) {
        this.interfaceMessage = interfaceMessage;
    }
}
