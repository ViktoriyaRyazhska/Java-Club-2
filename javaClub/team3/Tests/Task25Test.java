package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task25.isLove;
import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

    @Test
    void isLoveSameNum() {
        assertEquals(false, isLove(3,3));
    }
    @Test
    void isLoveDifferentNum() {
        assertEquals(true, isLove(3,4));
    }
}