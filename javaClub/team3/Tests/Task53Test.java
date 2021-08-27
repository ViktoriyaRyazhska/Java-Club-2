package javaClub.team3.Tests;

import javaClub.team3.Task53;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task53Test {
    @Test
    void normalTest() {
        outputBefore(new String[]{"Mike","Anderson"}, "New York", "Washington");
        assertEquals("Hello, Mike Anderson! Welcome to New York, Washington!", Task53.sayHello(new String[]{"Mike","Anderson"}, "New York", "Washington"));
        outputAfter();
    }
    @Test
    void negativeTest_empty() {
        outputBefore(new String[]{"",""}, "New York", "Washington");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task53.sayHello(new String[]{"",""}, "New York", "Washington") + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new String[]{"Mike",""}, "New York", "Washington");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task53.sayHello(new String[]{"Mike",""}, "New York", "Washington") + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new String[]{"Mike","Anderson"}, "", "Washington");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task53.sayHello(new String[]{"Mike","Anderson"}, "", "Washington") + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new String[]{"Mike","Anderson"}, "New York", "");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task53.sayHello(new String[]{"Mike","Anderson"}, "New York", "") + " is result, but no result expect!"));
        outputAfter();
    }
    void outputBefore(String []arr, String par1, String par2) {
        System.out.println("Input params: " + Arrays.toString(arr) + " and \"" + par1 + "\" and \"" + par2 + "\"");

    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
