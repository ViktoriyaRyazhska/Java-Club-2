package loops;

import com.softserve.academy.loops.Task35;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task35Test {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Task35.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Task35.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Task35.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}