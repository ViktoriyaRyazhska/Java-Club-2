package basic;

import com.softserve.academy.basic.Task1;
import org.junit.Assert;
import org.junit.Test;

public class TestTask1 {
    @Test
    public final void test_all() {
        Assert.assertEquals("Nope!", 4, Task1.doubleInteger(2));
        Assert.assertEquals("Nope!", 6,  Task1.doubleInteger(3));
    }

}
