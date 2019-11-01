package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.utils.CodeValueConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.util.Date;

public class IdentifierEntity extends BaseEntity {
    public IdentifierEntity(){

    }

    @Column(length = 30)
    private String name;
    @Convert(converter = CodeValueConverter.class)
    private GenderType genderType;
    @Column(columnDefinition = "Date")
    private Date birthday;
    @Convert(converter = CodeValueConverter.class)
    private IDType idType;
    @Column(name = "id_num", length = 30)
    private String idNum;
    @Column(name = "id_type_img1", length = 120)
    private String idTypeFirstImg;
    @Column(name = "id_type_img2", length = 120)
    private String idTypeSecondImg;
    @Column(name = "create_user_id")
    private int creatUserId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public IDType getIdType() {
        return idType;
    }

    public void setIdType(IDType idType) {
        this.idType = idType;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdTypeFirstImg() {
        return idTypeFirstImg;
    }

    public void setIdTypeFirstImg(String idTypeFirstImg) {
        this.idTypeFirstImg = idTypeFirstImg;
    }

    public String getIdTypeSecondImg() {
        return idTypeSecondImg;
    }

    public void setIdTypeSecondImg(String idTypeSecondImg) {
        this.idTypeSecondImg = idTypeSecondImg;
    }

    public int getCreatUserId() {
        return creatUserId;
    }

    public void setCreatUserId(int creatUserId) {
        this.creatUserId = creatUserId;
    }
}
