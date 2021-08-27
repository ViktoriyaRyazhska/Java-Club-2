package javaClub.team3.Tests;


import javaClub.team3.Task40;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task40Test {
    Task40 test = new Task40();
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {2,4,6,8};
    int[] arr3 = {23,39,74, 104};

    @Test
    void sumTest1() {
        assertEquals(10, test.sum(arr1));
    }

    @Test
    void sumTest2() {
        assertEquals(20, test.sum(arr2));
    }

    @Test
    void sumTest3() {
        assertEquals(240, test.sum(arr3));
    }
}