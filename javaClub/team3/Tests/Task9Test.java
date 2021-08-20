package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static javaClub.team3.Task9.MakeNegative;

public class Task9Test {
    @Test
    public void testNegative() {
        assertEquals(-42, MakeNegative(42));
    }
    @Test
    public void testPositive() {
        assertEquals(-128, MakeNegative(128));
    }
    @Test
    public void testZero(){
        assertEquals( 0, MakeNegative(0));
    }
}
