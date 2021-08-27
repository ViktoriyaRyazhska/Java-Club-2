package javaClub.team3.Tests;

import javaClub.team3.Task23;
import org.junit.jupiter.api.Test;
import java.awt.Color;

import java.util.InputMismatchException;

import static javaClub.team3.Task3.getVolumeOfCuboid;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task23Test {
    @Test
    void normalTest() {
        outputBefore("paper", "rock");
        assertEquals("Player 1 won!", Task23.rps("paper", "rock"));
        outputAfter();
        outputBefore("paper", "scissors");
        assertEquals("Player 2 won!", Task23.rps("paper", "scissors"));
        outputAfter();
        outputBefore("rock", "rock");
        assertEquals("Draw!", Task23.rps("rock", "rock"));
        outputAfter();
    }

    @Test
    void negativeTest_empty() {
        outputBefore("paper", "");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task23.rps("paper", "") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("", "rock");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task23.rps("", "rock") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("", "");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task23.rps("", "") + " is result, but no result expect!"));
        outputAfter();
    }

    @Test
    void negativeTest_incorrect() {
        outputBefore("poper", "rick");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task23.rps("poper", "rick") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("paper", "rick");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task23.rps("paper", "rick") + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(String s1, String s2) {
        System.out.println("Input params: \"" + s1 + "\" and \"" + s2 + "\"");
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
