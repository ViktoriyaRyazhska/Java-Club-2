package basic;

import com.softserve.academy.basic.Task2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {


    @Test
    public void sampleTest() {
        assertEquals(4, Task2.multiply(2, 2));
        assertEquals(10, Task2.multiply(5, 2));
        assertEquals(100, Task2.multiply(100, 1));
        assertEquals(0, Task2.multiply(0, 1000));
    }

    @Test(expected = ArithmeticException.class)
    public void sampleTestOutRangeInt (){
        Task2.multiply(999999999,999999999);
    }
}
