package javaClub.team3.Tests;

import javaClub.team3.Task35;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task35Test {

    int[] arr1 = {1,2,3,4};
    int[] arr2 = {2,4,6,8};
    int[] arr3 = {23,39,74, 104};
    int[] arr4 = {46,78,148, 208};

    @Test
    void mapTestCorrect() {
        assertArrayEquals(arr4, Task35.map(arr3));
        assertArrayEquals(arr2, Task35.map(arr1));
    }
}