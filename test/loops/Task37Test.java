package loops;

import com.softserve.academy.loops.Task37;
import static org.junit.Assert.*;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task37Test {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Task37.reverse(5));
    }
    @Test
    public void notSmallerZeroTest(){
        assertThrows(ArithmeticException.class,() -> Task37.reverse(-5));
    }
    @Test
    public void notEqualsZeroTest(){
        assertThrows(ArithmeticException.class,() -> Task37.reverse(0));
    }
}
