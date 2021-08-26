package string;

import com.softserve.academy.string.Task57;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task57Test {
    @Test
    public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Task57.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Task57.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Task57.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Task57.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Task57.noSpace("8j aam"));
    }

    @Test
    public void nullArugmentTest() {
        assertThrows(NullPointerException.class, () -> Task57.noSpace(null));
    }
}
