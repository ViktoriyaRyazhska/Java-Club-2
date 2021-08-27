package javaClub.team3.Tests;

import javaClub.team3.Task68;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task68Test {
    @Test
    void normalTest() {
        outputBefore("Hi!", 1);
        assertEquals("Hi", Task68.remove("Hi!", 1));
        outputAfter();
        outputBefore("Hi!", 100);
        assertEquals("Hi", Task68.remove("Hi!", 100));
        outputAfter();
        outputBefore("Hi!!!", 1);
        assertEquals("Hi!!", Task68.remove("Hi!!!", 1));
        outputAfter();
        outputBefore("Hi!!!", 100);
        assertEquals("Hi", Task68.remove("Hi!!!", 100));
        outputAfter();
        outputBefore("!Hi", 1);
        assertEquals("Hi", Task68.remove("!Hi", 1));
        outputAfter();
        outputBefore("!Hi!", 1);
        assertEquals("Hi!", Task68.remove("!Hi!", 1));
        outputAfter();
        outputBefore("!Hi!", 100);
        assertEquals("Hi", Task68.remove("!Hi!", 100));
        outputAfter();
        outputBefore("!!!Hi !!hi!!! !hi", 1);
        assertEquals("!!Hi !!hi!!! !hi", Task68.remove("!!!Hi !!hi!!! !hi", 1));
        outputAfter();
        outputBefore("!!!Hi !!hi!!! !hi", 3);
        assertEquals("Hi !!hi!!! !hi", Task68.remove("!!!Hi !!hi!!! !hi", 3));
        outputAfter();
        outputBefore("!!!Hi !!hi!!! !hi", 5);
        assertEquals("Hi hi!!! !hi", Task68.remove("!!!Hi !!hi!!! !hi", 5));
        outputAfter();
        outputBefore("!!!Hi !!hi!!! !hi", 100);
        assertEquals("Hi hi hi", Task68.remove("!!!Hi !!hi!!! !hi", 100));
        outputAfter();
        outputBefore("!Hi! !", 0);
        assertEquals("!Hi! !", Task68.remove("!Hi! !", 0));
        outputAfter();
    }

    @Test
    void negativeTest_empty() {
        outputBefore("", 1);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task68.remove("", 1) + " is result, but no result expect!"));
        outputAfter();
    }

    @Test
    void negativeTest_minus() {
        outputBefore("Hi!", -1);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task68.remove("Hi!", -1) + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(String par1, int par2) {
        System.out.println("Input params: \"" + par1 + "\" and " + par2);
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
