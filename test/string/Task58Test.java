package string;

import com.softserve.academy.string.Task58;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class Task58Test {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Task58.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Task58.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Task58.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Task58.tripleTrouble("LLh","euo","xtr"));
    }

    @Test
    public void nullArgumentTest() {
        assertThrows(NullPointerException.class, () -> Task58.tripleTrouble(null, "test", "test"));
    }

    @Test
    public void diffLengthTest() {
        assertThrows(IllegalArgumentException.class, () -> Task58.tripleTrouble("b", "bb", "bbb"));
        assertThrows(IllegalArgumentException.class, () -> Task58.tripleTrouble("bbb", "bb", "b"));
        assertThrows(IllegalArgumentException.class, () -> Task58.tripleTrouble("bn", "b", "bbb"));
    }
}
