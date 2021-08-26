package collections;

import com.softserve.academy.collections.Task70;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Task70Test {
    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), Task70.createList(1));
        assertEquals(Arrays.asList(1, 2), Task70.createList(2));
        assertEquals(Arrays.asList(1, 2, 3), Task70.createList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), Task70.createList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), Task70.createList(5));
    }
    @Test public void sampleTestNumberNotSmallerOne()
    {
        assertThrows(ArithmeticException.class, () -> Task70.createList(0));
        assertThrows(ArithmeticException.class, () -> Task70.createList(-1));

    }
}