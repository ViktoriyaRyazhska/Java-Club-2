package classes;

import com.softserve.academy.classes.Task9;
import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;

public class Task9Test {
    @Test public void testTrue() {
        assertEquals(Task9.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(Task9.convert(false), "false");
    }
}
