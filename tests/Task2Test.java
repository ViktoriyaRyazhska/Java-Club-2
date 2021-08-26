package java_core_test;

import java_core.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void Test() {
        assertEquals(777, Task2.multiply(1, 777));
        assertEquals(0, Task2.multiply(47, 0));
        assertEquals(-610, Task2.multiply(61, -10));
        assertEquals(1462, Task2.multiply(43, 34));
    }
}