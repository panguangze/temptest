package com.byoryn.entity;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum BoolType  {
    BOOL_TRUE(1, Boolean.TRUE),
    BOOL_FALSE(0, Boolean.FALSE);

    private int typeNum;
    private Boolean TypeValue;

    BoolType(int typeNum, Boolean typeValue) {
        this.typeNum = typeNum;
        TypeValue = typeValue;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }

    public Boolean getTypeValue() {
        return TypeValue;
    }

    public void setTypeValue(Boolean typeValue) {
        TypeValue = typeValue;
    }

    public int getTypeNum() {
        return typeNum;
    }
}
