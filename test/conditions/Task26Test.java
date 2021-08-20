package conditions;

import com.softserve.academy.conditions.Task26;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task26Test {
    @Test
    public void testBoolToWord() {
        assertEquals(Task26.boolToWord(true),"Yes");
        assertEquals(Task26.boolToWord(false),"No");
    }
}
