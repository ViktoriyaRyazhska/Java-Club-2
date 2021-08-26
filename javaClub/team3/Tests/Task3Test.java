package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static javaClub.team3.Task3.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3Test {
    @Test
    void normalTest() {
        assertEquals(1, getVolumeOfCuboid(1, 1, 1));
        assertEquals(8, getVolumeOfCuboid(2, 2, 2));
        assertEquals(6, getVolumeOfCuboid(1, 2, 3));
        assertEquals(1000, getVolumeOfCuboid(10, 10, 10));
    }

    @Test
    void negativeTest_Zero() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(getVolumeOfCuboid(0, 0, 0) + " is result, but no result expect!"));
    }

    @Test
    void negativeTest_minus() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(getVolumeOfCuboid(-5, 5, 1) + " is result, but no result expect!"));
    }
}
