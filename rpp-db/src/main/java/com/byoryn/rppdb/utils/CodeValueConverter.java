package com.byoryn.rppdb.utils;

import com.byoryn.rppdb.base.BaseTypeEnum;
import com.byoryn.rppdb.enums.UserRoleType;

import javax.persistence.AttributeConverter;

/**
 * @author panguangze
 * @date 2019/10/31
 */
public class CodeValueConverter implements AttributeConverter<UserRoleType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(UserRoleType attribute) {
//        return attribute.getTypeCode();
        return null;
    }

    @Override
    public UserRoleType convertToEntityAttribute(Integer typeCode) {
//        return UserRoleType.getByTypeCode(typeCode);
        return null;
    }
}
