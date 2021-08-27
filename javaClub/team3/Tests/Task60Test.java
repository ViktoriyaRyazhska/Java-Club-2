package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static javaClub.team3.Task60.fakeBin;
import static org.junit.jupiter.api.Assertions.*;

class Task60Test {

    @Test
    void fakeBinTest1() {
        assertEquals("01011110001100111", fakeBin("45385593107843568"));
        assertEquals("011011110000101010000011011", fakeBin("366058562030849490134388085"));
    }

    @Test
    void negativeTest_Empty() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(fakeBin("") + " is result, but no result expect!"));
    }
    @Test
    void negativeTest_Letters() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(fakeBin("gdfhjgujgy") + " is result, but no result expect!"));
    }
}