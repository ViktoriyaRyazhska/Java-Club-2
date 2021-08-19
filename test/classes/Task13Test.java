package classes;

import com.softserve.academy.classes.Task13;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task13Test {
    @Test
    public void testBasics() {
        assertEquals(11, Task13.basicMath("+", 4, 7));
        assertEquals(Task13.basicMath("-", 15, 18), -3);
        assertEquals(Task13.basicMath("*", 5, 5), 25);
        assertEquals(Task13.basicMath("/", 49, 7), 7);
    }
}
