package javaClub.team3.Tests;

import javaClub.team3.Task41;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task41Test {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{ "head", "body", "tail" },
                Task41.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{ "heads", "body", "tails" },
                Task41.fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{ "top", "middle", "bottom" },
                Task41.fixTheMeerkat(new String[]{ "bottom", "middle", "top" }));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{ "upper legs", "torso", "lower legs" },
                Task41.fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs" }));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{ "sky", "rainbow", "ground" },
                Task41.fixTheMeerkat(new String[]{ "ground", "rainbow", "sky" }));
    }
}
