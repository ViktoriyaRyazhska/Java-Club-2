package javaClub.team3.Tests;

import javaClub.team3.Task36;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task36Test {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };
    Boolean[] arrayEmpty;

    @Test
    public void test() {
        assertEquals(17, new Task36.Counter().countSheeps(array1));
    }
    //Just for fun:
    @Test
    public void emptyArrayThrowsNullPointer() {
        assertThrows(NullPointerException.class,
                () -> new Task36.Counter().countSheeps(arrayEmpty));
    }
}
