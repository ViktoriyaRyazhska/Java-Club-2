package basic;

import com.softserve.academy.basic.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestTask1 {
    @Test
    public final void test_all() {
        assertEquals( 4, Task1.doubleInteger(2));
        assertEquals( 6,  Task1.doubleInteger(3));
    }

}
