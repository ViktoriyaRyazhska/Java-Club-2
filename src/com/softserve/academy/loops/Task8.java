package com.softserve.academy.loops;

public class Task8 {
    public static int grow(int[] x){
        int sum = 1;
        for(int n : x) {
            if (n == 0) {
                return 0;
            }
            sum *= n;
        }
        return sum;
    }
}
