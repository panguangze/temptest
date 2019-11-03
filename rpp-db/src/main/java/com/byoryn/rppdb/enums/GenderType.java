package com.byoryn.rppdb.enums;

public enum GenderType {
    MALE((byte) 0, "男"),
    FEMALE((byte) 1, "女");

    private byte typeCode;
    private String typeValue;

    GenderType(byte typeCode, String typeValue) {
        this.typeCode = typeCode;
        this.typeValue = typeValue;
    }

    public int getTypeCode() {
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
