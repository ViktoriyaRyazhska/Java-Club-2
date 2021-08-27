package javaClub.team3.Tests;

import javaClub.team3.Task65;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class Task65Test {

    @Test
    void twoSortTest() {
        assertEquals("b***i***t***c***o***i***n", Task65.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", Task65.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

    @Test
    void negativeTest_Incorrect() {
        assertThrows(InputMismatchException.class,
                () -> System.err.println(Task65.twoSort(new String[] {"2", "3", "4", "5", "6"}) + " is result, but no result expect!"));
    }
}