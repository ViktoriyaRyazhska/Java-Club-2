package conditions;

import com.softserve.academy.conditions.Task5;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task5Test {
    @Test
    public void basicTests() {
        assertEquals("One", Task5.switchItUp(1));
        assertEquals("Three", Task5.switchItUp(3));
        assertEquals("Five", Task5.switchItUp(5));
    }
}
