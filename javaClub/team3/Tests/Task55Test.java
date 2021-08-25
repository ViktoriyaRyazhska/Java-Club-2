package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task55.replaceDots;
import static org.junit.jupiter.api.Assertions.*;

class Task55Test {

    @Test
    void replaceDotsTest() {
        assertEquals("Just-Try-Again", replaceDots("Just.Try.Again"));
    }
}