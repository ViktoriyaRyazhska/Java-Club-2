package loops;

import com.softserve.academy.loops.Task33;
import com.softserve.academy.loops.Task37;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task33Test {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{1,15,15}, Task33.pet_human_years(1));
        assertArrayEquals(new int[]{2,24,24}, Task33.pet_human_years(2));
        assertArrayEquals(new int[]{3,28,29}, Task33.pet_human_years(3));
    }
    }


