package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static javaClub.team3.Task55.replaceDots;
import static org.junit.jupiter.api.Assertions.*;

class Task55Test {

    @Test
    void replaceDotsTest() {
        assertEquals("Just-Try-Again", replaceDots("Just.Try.Again"));
    }

    @Test
    void negativeTest_Empty() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(replaceDots("") + " is result, but no result expect!"));
    }
}