package string;

import com.softserve.academy.string.Task66;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task66Test {


    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", Task66.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", Task66.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

}
