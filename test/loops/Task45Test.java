package loops;

import com.softserve.academy.loops.Task45;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Task45Test {

    @Test
    public void test() {

        assertEquals("[101, 103]", Arrays.toString(Task45.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(Task45.gap(4,100,110)));
        assertEquals("[337, 347]", Arrays.toString(Task45.gap(10,300,400)));
        assertEquals(null, Task45.gap(6,100,110));
    }


    }
