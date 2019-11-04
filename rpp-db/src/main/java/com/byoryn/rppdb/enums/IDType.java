package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IDType {
    ID_CARD((byte) 0, "身份证");

    private byte typeCode;
    private String typeValue;
}
