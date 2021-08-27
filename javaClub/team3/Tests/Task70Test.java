package javaClub.team3.Tests;

import javaClub.team3.Task70;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Task70Test {

    @Test
    void createListTest() {
        assertEquals(Collections.singletonList(1), Task70.createList(1));
        assertEquals(Arrays.asList(1,2,3,4,5), Task70.createList(5));
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10), Task70.createList(10));
    }
}