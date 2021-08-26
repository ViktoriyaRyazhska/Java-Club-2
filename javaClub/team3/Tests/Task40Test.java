package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task40.sum;
import static org.junit.jupiter.api.Assertions.*;

class Task40Test {

    @Test
    void sumTest() {
        int[] inputed = new int[] { 10, -5, 20, 0, -7, 5 };
        assertEquals(35, sum(inputed));
    }
}