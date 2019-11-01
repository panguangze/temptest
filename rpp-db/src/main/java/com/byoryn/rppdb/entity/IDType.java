package com.byoryn.rppdb.entity;

public enum IDType {
    ID_CARD((byte) 0, "身份证");

    private byte typeCode;
    private String typeValue;

    IDType(byte typeCode, String typeValue) {
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
