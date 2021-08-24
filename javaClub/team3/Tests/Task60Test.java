package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static javaClub.team3.Task60.fakeBin;
import static org.junit.jupiter.api.Assertions.*;

class Task60Test {

    @Test
    void fakeBinTest1() {
        assertEquals("01011110001100111", fakeBin("45385593107843568"));
    }
    @Test
    void fakeBinTest2() {
        assertEquals("011011110000101010000011011", fakeBin("366058562030849490134388085"));
    }
}