package conditions;

import com.softserve.academy.conditions.Task6;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task6Test {
    @Test
    public void update_light() {
        assertEquals("green", Task6.updateLight("red"));
        assertEquals("yellow", Task6.updateLight("green"));
        assertEquals("red", Task6.updateLight("yellow"));
    }

    @Test
    public void wrongColorTest() {
        assertThrows(IllegalArgumentException.class, () -> Task6.updateLight("g"));
    }

    @Test
    public void nullArgumentTest() {
        assertThrows(NullPointerException.class, () -> Task6.updateLight(null));
    }
}
