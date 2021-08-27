package javaClub.team3.Tests;

import javaClub.team3.Task51;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task51Test {
    @Test
    public void tests() {
        assertEquals("67", Task51.numberToString(67));
        assertEquals("123", Task51.numberToString(123));
        assertEquals("999", Task51.numberToString(999));
    }
}
