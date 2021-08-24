package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;
import javaClub.team3.Task20.*;

import static javaClub.team3.Task20.convert;
import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    public void CheckConvertTrue() {
        assertEquals("true", convert(true));
    }
    @Test
    public void CheckConvertFalse() {
        assertEquals("false", convert(false));
    }
}