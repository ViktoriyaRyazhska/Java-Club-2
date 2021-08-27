package javaClub.team3.Tests;

import javaClub.team3.Task21;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task21Test {
    @Test
    void normalTest() {
        outputBefore(10000, true);
        assertEquals(("£")+"100000",Task21.bonusTime(10000, true));
        outputAfter();
        outputBefore(25000, true);
        assertEquals(("£")+"250000", Task21.bonusTime(25000, true));
        outputAfter();
        outputBefore(10000, false);
        assertEquals(("£")+"10000",Task21.bonusTime(10000, false));
        outputAfter();
        outputBefore(60000, false);
        assertEquals(("£")+"60000",Task21.bonusTime(60000, false));
        outputAfter();
        outputBefore(2, true);
        assertEquals(("£")+"20",Task21.bonusTime(2, true));
        outputAfter();
        outputBefore(78, false);
        assertEquals(("£")+"78",Task21.bonusTime(78, false));
        outputAfter();
        outputBefore(67890, true);
        assertEquals(("£")+"678900",Task21.bonusTime(67890, true));
        outputAfter();
        outputBefore(0, true);
        assertEquals(("£")+"0",Task21.bonusTime(0, true));
        outputAfter();
        outputBefore(0, false);
        assertEquals(("£")+"0",Task21.bonusTime(0, false));
        outputAfter();
    }

    @Test
    void negativeTest() {
        outputBefore(-100, true);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task21.bonusTime(-100, true) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(-100, false);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task21.bonusTime(-100, false) + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(int par1, boolean par2) {
        System.out.println("Input params: " + par1 + " and " + par2);
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
