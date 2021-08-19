package loops;

import com.softserve.academy.loops.Task8;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task39Test {
    @Test
    public void testSomething() {
        assertEquals(6, Task8.grow(new int[]{1,2,3}));
        assertEquals(16, Task8.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Task8.grow(new int[]{2,2,2,2,2,2}));
    }
}
