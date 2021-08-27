package javaClub.team3.Tests;

import javaClub.team3.Task43;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task43Test {
    @Test
    void normalTest() {
        outputBefore(1);
        assertEquals(1, Task43.nearestSq(1));
        outputAfter();
        outputBefore(2);
        assertEquals(1, Task43.nearestSq(2));
        outputAfter();
        outputBefore(10);
        assertEquals(9, Task43.nearestSq(10));
        outputAfter();
        outputBefore(111);
        assertEquals(121, Task43.nearestSq(111));
        outputAfter();
        outputBefore(9999);
        assertEquals(10000, Task43.nearestSq(9999));
        outputAfter();
        outputBefore(10001);
        assertEquals(10000, Task43.nearestSq(10001));
        outputAfter();
    }

    @Test
    void negativeTest() {
        outputBefore(-5);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task43.nearestSq(-5) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(0);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task43.nearestSq(0) + " is result, but no result expect!"));
        outputAfter();
    }
    void outputBefore(int par) {
        System.out.println("Input params: " + par);
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
