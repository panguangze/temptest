package com.byoryn.rppdb.entity;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum BuyerRoleType  {
    NORMAL((byte)0, "个人买家");

    private byte typeCode;
    private String typeValue;

    BuyerRoleType(byte typeCode, String typeValue) {
        this.typeCode = typeCode;
        this.typeValue = typeValue;
    }

    public byte getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(byte typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }
}
