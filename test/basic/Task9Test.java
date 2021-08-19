package basic;

import com.softserve.academy.basic.Task9;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task9Test {

    @Test
    public void testPositives() {
        assertEquals(-5, Task9.makeNegative(5));
        assertEquals(-100, Task9.makeNegative(100));
        assertEquals(-95, Task9.makeNegative(95));
    }

    @Test
    public void testNegatives() {
        assertEquals(-5, Task9.makeNegative(-5));
        assertEquals(-100, Task9.makeNegative(-100));
        assertEquals(-95, Task9.makeNegative(-95));
    }
}
