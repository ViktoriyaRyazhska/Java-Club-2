package javaClub.team3.Tests;

import javaClub.team3.Task38;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class Task38Test {
    @Test
    void normalTest() {
        outputBefore(new int[]{2, 3}, 5);
        assertTrue(Task38.betterThanAverage(new int[]{2, 3}, 5));
        outputAfter();
        outputBefore(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75);
        assertTrue(Task38.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        outputAfter();
        outputBefore(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69);
        assertTrue(Task38.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        outputAfter();
        outputBefore(new int[]{100, 90}, 11);
        assertFalse(Task38.betterThanAverage(new int[]{100, 90}, 11));
        outputAfter();
        outputBefore(new int[]{100, 90}, 95);
        assertFalse(Task38.betterThanAverage(new int[]{100, 90}, 95));
        outputAfter();
        outputBefore(new int[]{}, 40);
        assertFalse(Task38.betterThanAverage(new int[]{}, 40));
        outputAfter();
    }

    @Test
    void negativeTest_minus() {
        outputBefore(new int[]{100, 90}, -100);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task38.betterThanAverage(new int[]{100, 90}, -100) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new int[]{-100, -90}, 100);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task38.betterThanAverage(new int[]{-100, -90}, 100) + " is result, but no result expect!"));
        outputAfter();
        outputBefore(new int[]{-100, -90}, -100);
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task38.betterThanAverage(new int[]{-100, -90}, -100) + " is result, but no result expect!"));
        outputAfter();
    }

    void outputBefore(int[] arr, int par) {
        System.out.println("Input params: " + Arrays.toString(arr) + " and " + par);
    }
    void outputAfter() {
        System.out.println("OK!");
    }
}
