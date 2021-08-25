package string;

import com.softserve.academy.string.Task55;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task55Test {
    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Task55.replaceDots("one.two.three")));
    }
}
