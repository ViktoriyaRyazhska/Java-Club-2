package basic;

import com.softserve.academy.basic.Task10;
import com.softserve.academy.conditions.Task25;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class Task10Test {
    @Test
    public void test1() {
        assertEquals(17-20, Task10.age(19));
    }



}
