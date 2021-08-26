package string;

import com.softserve.academy.string.Task58;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task58Test {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Task58.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Task58.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Task58.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Task58.tripleTrouble("LLh","euo","xtr"));
    }
}
