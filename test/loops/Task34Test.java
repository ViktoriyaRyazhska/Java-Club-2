package loops;

import com.softserve.academy.loops.Task34;
import com.softserve.academy.loops.Task37;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task34Test {
    @Test
    public void simpleTest() {
        Assert.assertEquals(0, Task34.average(new int[]{0,0,0,0}));
        Assert.assertEquals(5, Task34.average(new int[]{9,3,4}));
        Assert.assertEquals(5, Task34.average(new int[]{5,5,5}));
        Assert.assertEquals(4, Task34.average(new int[]{4}));
    }
}
