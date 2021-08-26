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

    @Test
    public void nullArgumentTest() {
        Integer a = null;
        assertThrows(NullPointerException.class, () -> Task8.isDivisible(a, 1, 1));
        assertThrows(NullPointerException.class, () -> Task8.isDivisible(1, a, 1));
        assertThrows(NullPointerException.class, () -> Task8.isDivisible(1, 1, a));
        assertThrows(NullPointerException.class, () -> Task8.isDivisible(a, a, a));
    }

    @Test
    public void zeroDivisionTest() {
        assertThrows(ArithmeticException.class, () -> Task8.isDivisible(1, 0, 1));
        assertThrows(ArithmeticException.class, () -> Task8.isDivisible(1, 1, 0));
    }
}
