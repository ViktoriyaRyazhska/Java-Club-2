package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task35.map;
import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @Test
    void mapTest1() {
        int[] given = new int[] { 1, 2, 3 };
        int[] result = new int[] { 2, 4, 6 };
        assertArrayEquals(result, map(given));
    }
    @Test
    void mapTest2() {
        int[] given = new int[] { 6, 8, 10 };
        int[] result = new int[] { 12, 16, 20 };
        assertArrayEquals(result, map(given));
    }
}