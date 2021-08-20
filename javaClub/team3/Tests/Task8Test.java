package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task8.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8Test {
    @Test
    void normalTest() {
        assertEquals(18, century(1705));
        assertEquals(19, century(1900));
        assertEquals(17, century(1601));
        assertEquals(20, century(2000));
        assertEquals(1,  century(89));
    }
}
