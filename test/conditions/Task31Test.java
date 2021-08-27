package conditions;

import com.softserve.academy.collections.Task3;
import static org.junit.Assert.*;

import com.softserve.academy.conditions.Task31;
import org.junit.Assert;
import org.junit.Test;



public class Task31Test {
    @Test
    public void secondTest()
    {
        assertEquals(0, Task31.price(0));
        assertEquals(80, Task31.price(2));
        assertEquals(100, Task31.price(3));
        assertEquals(140, Task31.price(4));
        assertEquals(230, Task31.price(7));
        assertEquals(270, Task31.price(8));


    }
}
