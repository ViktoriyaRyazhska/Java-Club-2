package basic;

import com.softserve.academy.basic.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task1Test {

    @Test
    public void simpleTest(){
        assertEquals(4, Task1.doubleInteger(2));
        assertEquals(12, Task1.doubleInteger(6));
    }
    @Test
    public void simpleTestOutOfIntRange () throws ArithmeticException{
        assertThrows(ArithmeticException.class, () -> Task1.doubleInteger(2100000000));
    }
}
