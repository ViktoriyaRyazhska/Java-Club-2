package basic;

import com.softserve.academy.basic.Task8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Task8Test {
    @Test
    public void basicTests() {
        assertEquals(18, Task8.century(1705));
        assertEquals(19, Task8.century(1900));
        assertEquals(1,  Task8.century(89));
    }

    @Test
    public void lastYearTest() {
        assertEquals(20, Task8.century(2000));
        assertEquals(19, Task8.century(1900));
        assertEquals(5, Task8.century(500));
    }

    @Test
    public void firstYearTest() {
        assertEquals(17, Task8.century(1601));
        assertEquals(15, Task8.century(1401));
        assertEquals(21, Task8.century(2001));
    }

    @Test
    public void invalidYearTest() {
        assertThrows(IllegalArgumentException.class, () -> Task8.century(-5));
    }

    @Test
    public void nullArgumentTest() {
        Integer a = null;
        assertThrows(NullPointerException.class, () -> Task8.century(a));
    }
}
