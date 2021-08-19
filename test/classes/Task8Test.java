package classes;

import com.softserve.academy.classes.Task8;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task8Test {
    @Test
    public void test1() {
        assertEquals(true, Task8.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, Task8.isDivisible(3,3,4));
    }
}
