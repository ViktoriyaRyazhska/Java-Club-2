package javaClub.team3.Tests;

import javaClub.team3.Task61;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task61Test {
    @Test
    void normalTest() {
        outputBefore("0 year old");
        assertEquals(0, Task61.howOld("0 year old"));
        outputAfter();
        outputBefore("1 year old");
        assertEquals(1, Task61.howOld("1 year old"));
        outputAfter();
        outputBefore("3 years old");
        assertEquals(3, Task61.howOld("3 years old"));
        outputAfter();
        outputBefore("6 years old");
        assertEquals(6, Task61.howOld("6 years old"));
        outputAfter();
        outputBefore("9 years old");
        assertEquals(9, Task61.howOld("9 years old"));
        outputAfter();
    }

    @Test
    void negativeTest_int() {
        outputBefore("15 years old");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task61.howOld("15 years old") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("-5 years old");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task61.howOld("-5 years old") + " is result, but no result expect!"));
        outputAfter();
    }

    @Test
    void negativeTest_string() {
        outputBefore("");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task61.howOld("") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("old 5 years");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task61.howOld("old 5 years") + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(String par) {
        System.out.println("Input params: \"" + par + "\"");
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
