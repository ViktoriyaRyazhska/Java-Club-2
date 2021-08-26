package javaClub.team3.Tests;

import javaClub.team3.Task28;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static javaClub.team3.Task28.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task28Test {
    @Test
    void normalTest() {
        /*
        outputBefore(1);
        assertEquals(0, Task28.sequence(1));
        outputAfter();
        outputBefore(2);
        assertEquals(1, Task28.sequence(2));
        outputAfter();
        outputBefore(3);
        assertEquals(1, Task28.sequence(3));
        outputAfter();
        outputBefore(148);
        assertEquals(2, Task28.sequence(148));
        outputAfter();
        */
    }
    @Test
    void negativeTest_bounds() {
        outputBefore(0);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task28.sequence(0) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(-10);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task28.sequence(0) + " is result, but no result expect!"));
        outputAfter();
        /*
        outputBefore((long)Math.pow(10, 19));
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task28.sequence((long)Math.pow(10, 19)) + " is result, but no result expect!"));
        outputAfter();
        */
    }

    void outputBefore(long value) {
        System.out.println("Input params: " + value);
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
