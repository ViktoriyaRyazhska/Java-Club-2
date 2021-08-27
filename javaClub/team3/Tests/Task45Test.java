package javaClub.team3.Tests;

import javaClub.team3.Task45;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class Task45Test {

    long[] arr1 = {101, 103};
    long[] arr2 = {103, 107};

    @Test
    void isPrimeTest1() {
        assertArrayEquals(arr1, Task45.gap(2,100,110));
        assertArrayEquals(arr2, Task45.gap(4,100,110));
        assertArrayEquals(null, Task45.gap(6,100,110));
    }

    @Test
    void isPrimeTest2() {
        assertEquals(true, Task45.isPrime(23));
        assertEquals(true, Task45.isPrime(41));
        assertEquals(false, Task45.isPrime(102));
    }

    @Test
    void negativeTestForPrimeZero() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task45.isPrime(0) + " is result, but no result expect!"));
    }
    @Test
    void negativeTestForPrimeOne() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task45.isPrime(1) + " is result, but no result expect!"));
    }
}