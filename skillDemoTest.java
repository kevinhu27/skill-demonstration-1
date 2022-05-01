import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {

    @Test
    public void testAddNumbers() {
        assertEquals(4, skillDemo.addNumbers(2, 2));
    }
}
