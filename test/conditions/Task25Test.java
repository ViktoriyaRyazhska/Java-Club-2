package conditions;

import com.softserve.academy.conditions.Task25;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task25Test {

    @Test
    public void testOddAndEven() {
        assertEquals(true, Task25.isLove(1, 4));
        assertEquals(false, Task25.isLove(2, 2));
        assertEquals(false, Task25.isLove(1, 1));
    }

    @Test
    public void TestValueNotEqualsZero() {
        assertThrows(ArithmeticException.class,() -> Task25.isLove(0,1));
        assertThrows(ArithmeticException.class,() -> Task25.isLove(1,0));
        assertThrows(ArithmeticException.class,() -> Task25.isLove(0,0));

        assertThrows(ArithmeticException.class,() -> Task25.isLove(-1,1));
        assertThrows(ArithmeticException.class,() -> Task25.isLove(1,-1));
        assertThrows(ArithmeticException.class,() -> Task25.isLove(-1,-1));

    }





}
