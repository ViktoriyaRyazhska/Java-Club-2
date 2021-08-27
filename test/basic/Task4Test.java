package basic;

import com.softserve.academy.basic.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4Test {
    @Test
    public void fixedTests() {
        assertTrue(Task4.isDivisible(4050,27));
        assertTrue(Task4.isDivisible(10000,20));
        assertTrue(Task4.isDivisible(10005,1));
        assertFalse(Task4.isDivisible(4066,27));
        assertFalse(Task4.isDivisible(10005,2));
    }

    private void assertTrue(boolean divisible) {
    }

    @Test
    public void valueCantBeZeroOrNegative(){
        assertThrows(ArithmeticException.class, () -> Task4.isDivisible(0,1));
        assertThrows(ArithmeticException.class, () -> Task4.isDivisible(1,0));
        assertThrows(ArithmeticException.class,() -> Task4.isDivisible(-1,1));
        assertThrows(ArithmeticException.class,() -> Task4.isDivisible(1,-1));


    }
}
