import com.byoryn.rppdb.base.BaseTypeEnum;

/**
 * @author panguangze
 * @data 2019/11/1
 */
public enum Type implements BaseTypeEnum {
    AA((byte) 10,"ddd");

    private byte typeCode;
    private String typeValue;
    @Override
    public byte getTypeCode() {
        return typeCode;
    }

    Type(byte typeCode, String typeValue) {
        this.typeCode = typeCode;
        this.typeValue = typeValue;
    }
}
