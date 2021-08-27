package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import javaClub.team3.Task26;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task26Test {
    @Test
    public void testBoolToWord() {
        assertEquals(Task26.YesOrNo.boolToWord(true),"Yes");
        assertEquals(Task26.YesOrNo.boolToWord(false),"No");
    }
}