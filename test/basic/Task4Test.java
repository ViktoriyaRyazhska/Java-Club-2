package basic;

import com.softserve.academy.basic.Task4;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task4Test {
    @Test
    public void fixedTests() {
        assertTrue(Task4.isDivisible(4050,27));
        assertTrue(Task4.isDivisible(10000,20));
        assertTrue(Task4.isDivisible(10005,1));
        assertFalse(Task4.isDivisible(4066,27));
        assertFalse(Task4.isDivisible(10005,2));
    }
}
