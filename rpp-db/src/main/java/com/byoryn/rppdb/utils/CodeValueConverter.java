package com.byoryn.rppdb.utils;

import com.byoryn.rppdb.base.BaseTypeEnum;

import javax.persistence.AttributeConverter;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public class CodeValueConverter implements AttributeConverter<BaseTypeEnum, Byte> {
    @Override
    public Byte convertToDatabaseColumn(BaseTypeEnum attribute) {
        return attribute.getTypeCode();
    }

    @Override
    public BaseTypeEnum convertToEntityAttribute(Byte typeCode) {
        return Code2EnumUtil.codeOf(BaseTypeEnum.class, typeCode);
    }
}
