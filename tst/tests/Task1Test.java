package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import tasks.Task1;

public class Task1Test {
    @Test
    public void doubleInt_shouldReturnTwiceBiggerNumber() {
        assertEquals(4, Task1.doubleInt(2));
        assertEquals(8, Task1.doubleInt(4));
        assertEquals(100, Task1.doubleInt(50));

    }

}
