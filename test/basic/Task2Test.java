package basic;

import com.softserve.academy.basic.Task2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {
Task2 task = new Task2();

    @Test
    public void sampleTest() {
        assertEquals(4, task.multiply(2, 2));
        assertEquals(10, task.multiply(5, 2));
        assertEquals(100, task.multiply(100, 1));
        assertEquals(0, task.multiply(0, 1000));
    }
}
