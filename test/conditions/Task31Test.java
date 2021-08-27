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
        Assert.assertEquals(0, Task31.price(0));
        Assert.assertEquals(80, Task31.price(2));
        Assert.assertEquals(100, Task31.price(3));
        Assert.assertEquals(140, Task31.price(4));
        Assert.assertEquals(230, Task31.price(7));
        Assert.assertEquals(270, Task31.price(8));


    }
}
