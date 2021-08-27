package javaClub.team3.Tests;

import static javaClub.team3.Task10.datingRange;
import static javaClub.team3.Task3.getVolumeOfCuboid;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

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
        assertEquals("age = 5   =>   4-5", datingRange(5));
    }
    @Test
    void datingRange_MoreThan14() {
        assertEquals("age = 27   =>   20-40", datingRange(27));
    }
}