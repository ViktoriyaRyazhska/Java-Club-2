package javaClub.team3.Tests;

import javaClub.team3.Task33;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class Task33Test {
    @Test
    void normalTest() {
        outputBefore(1);
        assertArrayEquals(new int[]{1,15,15}, Task33.humanYearsCatYearsDogYears(1));
        outputAfter();
        outputBefore(2);
        assertArrayEquals(new int[]{2,24,24}, Task33.humanYearsCatYearsDogYears(2));
        outputAfter();
        outputBefore(10);
        assertArrayEquals(new int[]{10,56,64},Task33.humanYearsCatYearsDogYears(10));
        outputAfter();
    }

    @Test
    void negativeTest() {
        outputBefore(0);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Arrays.toString(Task33.humanYearsCatYearsDogYears(0)) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(-5);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Arrays.toString(Task33.humanYearsCatYearsDogYears(-5)) + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(int par1) {
        System.out.println("Input params: " + par1);
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
