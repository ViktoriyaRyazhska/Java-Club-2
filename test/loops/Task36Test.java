package loops;

import com.softserve.academy.loops.Task36;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task36Test {
    Boolean[] array = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void sheeps() {
        assertEquals(17, Task36.countSheeps(array));
    }
    @Test
    public void notNullTest(){
        array = null;
        assertThrows(NullPointerException.class,() -> Task36.countSheeps(array));
    }


}
