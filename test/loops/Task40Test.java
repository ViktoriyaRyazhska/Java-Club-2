package loops;

import com.softserve.academy.loops.Task9;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task40Test {
    @Test
    public void testSomething() {
        assertEquals(15, Task9.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Task9.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Task9.sum(new int[]{}));
        assertEquals(0, Task9.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Task9.sum(new int[]{-1,2,3,4,-5}));
    }
}
