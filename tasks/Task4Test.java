package java_core_test;


import java_core.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Task4Test {

    @Test
    public void fixedTests() {
        assertTrue(Task4.isDivisible(4050,1));
        assertTrue(Task4.isDivisible(10000,20));
        assertTrue(Task4.isDivisible(10005,5));
        assertFalse(Task4.isDivisible(4066,27));
        assertFalse(Task4.isDivisible(10005,2));
    }

}