package javaClub.team3.Tests;

import javaClub.team3.Task13;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task13Test {
    @Test
    public void testing() {
        assertEquals(123, Task13.INST.plus100(23));
        assertEquals(100, Task13.INST.plus100(0));
        assertEquals(77, Task13.INST.plus100(-23));
    }

    @Test
    public void randomTesting() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(10000)-5000;
            assertEquals(a+100, Task13.INST.plus100(a));
        }
    }
}
