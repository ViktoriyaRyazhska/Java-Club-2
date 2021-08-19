package classes;

import com.softserve.academy.classes.Task7;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task7Test {
    @Test
    public void tests() {
        assertEquals(-1, Task7.opposite(1));
        assertEquals(1, Task7.opposite(-1));
        assertEquals(0, Task7.opposite(0));
    }
}
