import com.company.DuplicateEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ousma on 4/26/2017.
 */
public class DuplicateEncoderTest
{
    @Test
    public void test() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
        assertEquals("(((", DuplicateEncoder.encode("din"));
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
        assertEquals(")())())", DuplicateEncoder.encode("Success"));
        assertEquals("))((", DuplicateEncoder.encode("(( @"));
    }
}
