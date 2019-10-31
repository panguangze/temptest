package com.byoryn.utils;

import javax.persistence.AttributeConverter;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public class TypeEnumConverter implements AttributeConverter<Enum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Enum Enum) {
        return null;
//        return Enum.getTypeNum();
    }
    @Override
    public Enum convertToEntityAttribute(Integer typeNum) {
//        return BaseEnum.getEnumInstance(typeNum);
        return null;
    }
}
