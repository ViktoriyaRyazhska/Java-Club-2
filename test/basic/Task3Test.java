package basic;

import com.softserve.academy.basic.Task2;
import com.softserve.academy.basic.Task3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3Test {
    private static final double delta = 0.0001;
    @Test
    public void examples() {

        assertEquals(4, Task3.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, Task3.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
    @Test
    public void sampleTestValueNotEqualsZero(){
        assertThrows(ArithmeticException.class, () -> Task3.getVolumeOfCuboid(0,1,1));
        assertThrows(ArithmeticException.class, () -> Task3.getVolumeOfCuboid(1,0,1));
        assertThrows(ArithmeticException.class, () -> Task3.getVolumeOfCuboid(1,1,0));
        assertThrows(ArithmeticException.class, () -> Task3.getVolumeOfCuboid(0,0,0));
    }
}
