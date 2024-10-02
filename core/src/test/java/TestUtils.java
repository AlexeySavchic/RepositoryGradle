import org.example.StringUtils;
import org.example.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestUtils
{
    @Test
    void TestUtils()
    {
        assertTrue(Utils.isAllPositiveNumber("1","13","0.3"));
        assertFalse(Utils.isAllPositiveNumber("-1","13","0.3"));
        assertFalse(Utils.isAllPositiveNumber("0","13","0.3"));
        assertFalse(Utils.isAllPositiveNumber("abc","13","0.3"));
    }


}
