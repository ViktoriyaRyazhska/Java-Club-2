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
}
