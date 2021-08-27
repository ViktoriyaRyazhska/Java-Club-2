package javaClub.team3.Tests;

import javaClub.team3.Task41;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task41Test {
    @Test
    void exampleTest() {
        outputBefore(new String[]{ "tail", "body", "head" });
        assertArrayEquals(new String[]{ "head", "body", "tail" },
                Task41.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
        outputAfter();
    }

    @Test
    void negativeTest_empty() {
        outputBefore(new String[]{"", "", ""});
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Arrays.toString(Task41.fixTheMeerkat(new String[]{"", "", ""})) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new String[]{"", "body", "head"});
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Arrays.toString(Task41.fixTheMeerkat(new String[]{"", "body", "head"})) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new String[]{"tail", "", "head"});
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Arrays.toString(Task41.fixTheMeerkat(new String[]{"tail", "", "head"})) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new String[]{"tail", "body", ""});
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Arrays.toString(Task41.fixTheMeerkat(new String[]{"tail", "body", ""})) + " is result, but no result expect!"));
        outputAfter();
    }
    void outputBefore(String []arr) {
        System.out.println("Input params: " + Arrays.toString(arr));
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
