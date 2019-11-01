package com.byoryn.rppdb.entity;

public enum SampleType {
    BLOOD((byte)0, "血液", "毫升");

    private byte typeCode;
    private String typeValue;
    private String unit;

    SampleType(byte typeCode, String typeValue, String unit) {
        this.typeCode = typeCode;
        this.typeValue = typeValue;
        this.unit = unit;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
