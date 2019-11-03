package com.byoryn.rppdb.utils;

import com.byoryn.rppdb.base.BaseTypeEnum;

/**
 * @author panguangze
 * @data 2019/11/1
 * 根据typeCode得到对应的枚举对象
 */
public class Code2EnumUtil {
    public static BaseTypeEnum codeOf(Class<? extends BaseTypeEnum> enumClass, int typeCode) {
        BaseTypeEnum[] enumConstants = enumClass.getEnumConstants();
        for (BaseTypeEnum typeEnum : enumConstants) {
            if (typeEnum.getTypeCode() == typeCode)
                return typeEnum;
        }
        return null;
    }

}
