package javaClub.team3.Tests;

import javaClub.team3.Task30;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static javaClub.team3.Task3.getVolumeOfCuboid;
import static org.junit.jupiter.api.Assertions.*;

public class Task30Test {
    Task30 test = new Task30();

    @Test
    void updateLightYellow() {
        assertEquals("yellow", Task30.updateLight("green"));
    }
    @Test
    void updateLightRed() {
        assertEquals("red", Task30.updateLight("yellow"));
    }
    @Test
    void updateLightGreen() {
        assertEquals("green", Task30.updateLight("red"));
    }

    @Test
    void negativeTest_Incorrect() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task30.updateLight("Blue") + " is result, but no result expect!"));
    }

    @Test
    void negativeTest_Empty() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task30.updateLight("") + " is result, but no result expect!"));
    }
}