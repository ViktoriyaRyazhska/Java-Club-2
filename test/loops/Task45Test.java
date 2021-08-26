package loops;

import com.softserve.academy.loops.Task45;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task45Test {

    @Test
    public void test() {

        assertEquals("[101, 103]", Arrays.toString(Task45.gap(2, 100, 110)));
        assertEquals("[103, 107]", Arrays.toString(Task45.gap(4, 100, 110)));
        assertEquals("[337, 347]", Arrays.toString(Task45.gap(10, 300, 400)));
        assertEquals(null, Task45.gap(6, 100, 110));
    }

    @Test
    public void checkedForCorrectValues() {
        assertThrows(ArithmeticException.class, () -> Task45.gap(0, 0, 0));
        assertThrows(ArithmeticException.class, () -> Task45.gap(1, 2, 3));
        assertThrows(ArithmeticException.class, () -> Task45.gap(2, 1, 3));
        assertThrows(ArithmeticException.class, () -> Task45.gap(2, 2, 1500000));

    }

}
