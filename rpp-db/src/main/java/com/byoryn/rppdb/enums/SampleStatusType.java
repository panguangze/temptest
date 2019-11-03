package com.byoryn.rppdb.enums;

public enum SampleStatusType {
    POSTED((byte) 0, "已邮寄");

    private byte typeCode;
    private String typeValue;

    SampleStatusType(byte typeCode, String typeValue) {
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
