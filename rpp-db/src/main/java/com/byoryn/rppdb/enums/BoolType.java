package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author panguangze
 * @date 2019/10/31
 */
@Getter
@AllArgsConstructor
public enum BoolType {
    BOOL_TRUE((byte) 1, Boolean.TRUE),
    BOOL_FALSE((byte) 0, Boolean.FALSE);

    private byte typeCode;
    private Boolean TypeValue;
}
