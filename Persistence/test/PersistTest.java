import com.company.Persist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ousma on 4/26/2017.
 */
public class PersistTest {
    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }
}
