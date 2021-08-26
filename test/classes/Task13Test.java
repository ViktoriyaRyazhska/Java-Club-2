package classes;

import com.softserve.academy.classes.Task24;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task13Test {
    @Test
    public void testBasics() {
        assertEquals(11, Task24.basicMath("+", 4, 7));
        assertEquals(Task24.basicMath("-", 15, 18), -3);
        assertEquals(Task24.basicMath("*", 5, 5), 25);
        assertEquals(Task24.basicMath("/", 49, 7), 7);
    }

    @Test
    public void nullArgumentTest() {
        Integer a = null;
        assertThrows(NullPointerException.class, () -> Task24.basicMath(null, 4, 7));
        assertThrows(NullPointerException.class, () -> Task24.basicMath("+", a, 7));
        assertThrows(NullPointerException.class, () -> Task24.basicMath("+", 4, a));
    }

    @Test
    public void zeroDivisionTest() {
        assertThrows(ArithmeticException.class, () -> Task24.basicMath("/", 10, 0));
    }

    @Test
    public void wrongOperatorTest() {
        assertThrows(IllegalArgumentException.class, () -> Task24.basicMath("%", 0, 0));
    }

    @Test
    public void overflowTest() {
        assertThrows(ArithmeticException.class, () -> Task24.basicMath("+", Integer.MAX_VALUE, 1));
    }
}
