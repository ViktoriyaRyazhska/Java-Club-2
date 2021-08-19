package com.softserve.academy.loops;

import java.util.*;

public class Task9 {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }
}
