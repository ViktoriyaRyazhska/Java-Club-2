package string;

import com.softserve.academy.string.Task65;
import com.softserve.academy.string.Task66;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task66Test {


    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", Task66.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", Task66.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
    @Test
    public void notNullTest (){
        assertThrows(NullPointerException.class,() -> Task66.twoSort(null));
    }

}
