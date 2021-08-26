package classes;

import com.softserve.academy.classes.Task9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Task9Test {
    @Test
    public void testTrue() {
        assertEquals(Task9.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(Task9.convert(false), "false");
    }

    @Test
    public void nullArgumentTest() {
        assertThrows(NullPointerException.class, () -> Task9.convert((Boolean) null));
    }
}
