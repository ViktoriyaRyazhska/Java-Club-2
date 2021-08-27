package javaClub.team3.Tests;

import javaClub.team3.Task63;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task63Test {
    @Test
    void normalTest() {
        outputBefore("Sam Harris");
        assertEquals("S.H", Task63.abbrevName("Sam Harris"));
        outputAfter();
        outputBefore("Patrick Feenan");
        assertEquals("P.F", Task63.abbrevName("Patrick Feenan"));
        outputAfter();
        outputBefore("Evan Cole");
        assertEquals("E.C", Task63.abbrevName("Evan Cole"));
        outputAfter();
        outputBefore("P Favuzzi");
        assertEquals("P.F", Task63.abbrevName("P Favuzzi"));
        outputAfter();
        outputBefore("David Mendieta");
        assertEquals("D.M", Task63.abbrevName("David Mendieta"));
        outputAfter();
    }

    @Test
    void negativeTest() {
        outputBefore("Paulo David Radkovsky");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task63.abbrevName("Paulo David Radkovsky") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("Paulo");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task63.abbrevName("Paulo") + " is result, but no result expect!"));
        outputAfter();
    }

    @Test
    void negativeTest_empty() {
        outputBefore("");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task63.abbrevName("") + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(String par) {
        System.out.println("Input params: \"" + par + "\"");
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
