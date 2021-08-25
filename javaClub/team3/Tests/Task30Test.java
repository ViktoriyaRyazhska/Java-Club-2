package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task30.updateLight;
import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @Test
    void updateLightGreen() {
        assertEquals("yellow",updateLight("green"));
    }
    @Test
    void updateLighYellow() {
        assertEquals("red",updateLight("yellow"));
    }
    @Test
    void updateLightRed() {
        assertEquals("green",updateLight("red"));
    }
    @Test
    void updateLightWrong() {
        assertEquals("Wrong input!",updateLight("blue"));
    }
}