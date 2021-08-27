package javaClub.team3.Tests;

import javaClub.team3.Task18;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task18Test {
    @Test
    void normalTest() {
        assertEquals(0, Task18.opposite(0));
        assertEquals(5, Task18.opposite(-5));
        assertEquals(-5, Task18.opposite(5));
    }
}
