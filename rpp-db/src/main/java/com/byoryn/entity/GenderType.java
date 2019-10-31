package com.byoryn.entity;

public enum GenderType {
    MALE(0, "男"),
    FEMALE(1, "女");

    private int typeNum;
    private String typeValue;

    GenderType(int typeNum, String typeValue) {
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
