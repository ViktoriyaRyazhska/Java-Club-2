package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import tasks.Task9;

public class Task9Test {
    @Test
    public void makeNegative_shouldReturnNegativeNumberIfItIsPositive() {
        assertEquals(-2, Task9.makeNegative(2));
        assertEquals(-50, Task9.makeNegative(50));
    }
    public void makeNegative_shouldReturnSameNumberIfItIsNegative() {
        assertEquals(-5, Task9.makeNegative(-5));
        assertEquals(-20, Task9.makeNegative(-20));
    }


}
