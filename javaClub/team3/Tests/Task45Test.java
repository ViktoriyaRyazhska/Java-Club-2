package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task45.gap;
import static javaClub.team3.Task45.isPrime;
import static org.junit.jupiter.api.Assertions.*;

class Task45Test {

    @Test
    void gapCorrectTryCorrect() {
        long[] res = new long[] { 101, 103 };
        assertArrayEquals(res, gap(2,100,110));
    }
    @Test
    void gapCorrectTryWithNull() {
        assertArrayEquals(null, gap(6,100,110));
    }
    @Test
    void isPrimeTryTrue() {
        assertEquals(true, isPrime(5));
    }
    @Test
    void isPrimeTryFalse() {
        assertEquals(false, isPrime(6));
    }
}