package javaClub.team3.Tests;

import javaClub.team3.Task72.Dictionary;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task72Test {
    @Test
    public void Tests()
    {
        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Can`t find entry for Hi", d.look("Hi"));
        assertEquals("Can`t find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));
    }
}
