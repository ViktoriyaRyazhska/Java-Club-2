package javaClub.team3.Tests;

import javaClub.team3.Task58;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task58Test {
    @Test
    void normalTest() {
        outputBefore("this", "test", "lock");
        assertEquals("ttlheoiscstk", Task58.tripleTrouble("this", "test", "lock"));
        outputAfter();
        outputBefore("aa","bb","cc");
        assertEquals("abcabc", Task58.tripleTrouble("aa","bb","cc"));
        outputAfter();
        outputBefore("Bm", "aa", "tn");
        assertEquals("Batman", Task58.tripleTrouble("Bm", "aa", "tn"));
        outputAfter();
        outputBefore("LLh","euo","xtr");
        assertEquals("LexLuthor", Task58.tripleTrouble("LLh","euo","xtr"));
        outputAfter();
    }

    @Test
    void negativeTest_empty() {
        outputBefore("","test","lock");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task58.tripleTrouble("","test","lock") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("this","","lock");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task58.tripleTrouble("this","","lock") + " is result, but no result expect!"));
        outputAfter();
        outputBefore("this","test","");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task58.tripleTrouble("this","test","") + " is result, but no result expect!"));
        outputAfter();
    }

    @Test
    void negativeTest_incorrect() {
        outputBefore("this","test","not");
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task58.tripleTrouble("this","test","not") + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(String par1, String par2, String par3) {
        System.out.println("Input params: \"" + par1 + "\" and \"" + par2 + "\" and \"" + par3 + "\"");
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
