package com.byoryn.entity;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum ProductStatusType  {
    ONLINE(0, "已上线"),
    OFFLINE(1, "已下线"),
    DELETED(2, "已删除");

    private int typeNum;
    private String typeValue;

    ProductStatusType(int typeNum, String typeValue) {
        this.typeNum = typeNum;
        this.typeValue = typeValue;
    }

    public int getTypeNum() {
        return typeNum;
    }
}
