package javaClub.team3.Tests;

import javaClub.team3.Task25;
import org.junit.jupiter.api.Test;

import static javaClub.team3.Task25.isLove;
import static org.junit.jupiter.api.Assertions.*;

public class Task25Test {
    Task25 test = new Task25();

    @Test
    void isLoveTrue() {
        assertEquals(true, isLove(1,2));
    }
    @Test
    void isLoveFalse() {
        assertEquals(false, isLove(4,2));
    }
}