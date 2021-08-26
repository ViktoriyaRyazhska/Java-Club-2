package classes;

import com.softserve.academy.classes.Task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task7Test {
    @Test
    public void tests() {
        assertEquals(-1, Task7.opposite(1));
        assertEquals(1, Task7.opposite(-1));
        assertEquals(0, Task7.opposite(0));
    }

    @Test
    public void nullArgumentTest() {
        assertThrows(NullPointerException.class, () -> Task7.opposite((Integer) null));
    }
}
