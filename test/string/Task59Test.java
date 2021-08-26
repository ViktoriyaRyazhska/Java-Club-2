package string;

import com.softserve.academy.string.Task59;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class Task59Test {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Task59.position('a'));
        assertEquals("Position of alphabet: 26", Task59.position('z'));
        assertEquals("Position of alphabet: 5", Task59.position('e'));
    }

    @Test
    public void nullArgumentTest() {
        assertThrows(NullPointerException.class, () -> Task59.position((Character) null));
    }

    @Test
    public void wrongCharTest() {
        assertThrows(IllegalArgumentException.class, () -> Task59.position('A'));
    }
}
