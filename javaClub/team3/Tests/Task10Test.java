package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task10.datingRange;
import static javaClub.team3.Task5.greet;
import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void datingRange_LessThen1() {
        assertEquals("Wrong age.", datingRange(-3));
    }
    @Test
    void datingRange_MoreThan100() {
        assertEquals("Wrong age.", datingRange(120));
    }
    @Test
    void datingRange_LessThan14() {
        assertEquals("4-5", datingRange(5));
    }
    @Test
    void datingRange_MoreThan14() {
        assertEquals("20-40", datingRange(27));
    }
}