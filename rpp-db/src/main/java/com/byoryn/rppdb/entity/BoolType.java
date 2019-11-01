package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseTypeEnum;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum BoolType implements BaseTypeEnum {
    BOOL_TRUE((byte) 1, Boolean.TRUE),
    BOOL_FALSE((byte) 0, Boolean.FALSE);

    private byte typeCode;
    private Boolean TypeValue;

    BoolType(byte typeCode, Boolean typeValue) {
        this.typeCode = typeCode;
        TypeValue = typeValue;
    }

    public void setTypeCode(byte typeCode) {
        this.typeCode = typeCode;
    }

    public Boolean getTypeValue() {
        return TypeValue;
    }

    public void setTypeValue(Boolean typeValue) {
        TypeValue = typeValue;
    }

    public byte getTypeCode() {
        return typeCode;
    }
}
