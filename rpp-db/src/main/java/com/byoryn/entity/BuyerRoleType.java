package com.byoryn.entity;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum BuyerRoleType  {
    NORMAL(0, "个人买家");

    private int typeNum;
    private String typeValue;

    BuyerRoleType(int typeNum, String typeValue) {
        this.typeNum = typeNum;
        this.typeValue = typeValue;
    }

    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }
}
