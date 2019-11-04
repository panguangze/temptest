package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderType {
    MALE((byte) 0, "男"),
    FEMALE((byte) 1, "女");

    private byte typeCode;
    private String typeValue;

}
