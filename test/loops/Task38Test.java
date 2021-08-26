package loops;

import com.softserve.academy.loops.Task7;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task38Test {
    @Test
    public void tests() {
        assertEquals(true, Task7.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, Task7.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, Task7.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, Task7.betterThanAverage(new int[] {100, 90}, 11));
    }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> Task7.betterThanAverage(new int[] {2, 3}, -5));
        assertThrows(IllegalArgumentException.class, () -> Task7.betterThanAverage(new int[] {100, -40, 34, 57, 29, 72, 57, 88}, 75));
    }
}
