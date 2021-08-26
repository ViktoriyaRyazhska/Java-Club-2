package string;

import com.softserve.academy.string.Task54;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task54Test {
    Integer test = null;
    @Test
    public void tests() {
        assertEquals(-1, Task54.opposite(1));
    }
    @Test
    public void notNullTest (){
        assertThrows(NullPointerException.class,() ->  Task54.opposite(test));
    }
}
