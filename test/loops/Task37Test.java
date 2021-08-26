package loops;

import com.softserve.academy.loops.Task37;
import static org.junit.Assert.*;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class Task37Test {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Task37.reverse(5));
    }
}
