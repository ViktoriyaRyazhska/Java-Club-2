package string;

import com.softserve.academy.string.Task54;
import com.softserve.academy.string.Task55;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task55Test {

    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Task55.replaceDots("one.two.three")));
    }
    @Test
    public void notNullTest (){
        assertThrows(NullPointerException.class,() ->  Task55.replaceDots(null));
    }
}

