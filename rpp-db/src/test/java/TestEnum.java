import com.byoryn.rppdb.utils.Code2EnumUtil;
import org.junit.jupiter.api.Test;

/**
 * @author panguangze
 * @data 2019/11/1
 */
public class TestEnum {
    @Test
    public void shit(){
        System.out.println(Code2EnumUtil.codeOf(Type.class,(byte) 10));
    }
}
