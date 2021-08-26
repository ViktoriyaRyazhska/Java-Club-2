package com.softserve.academy.loops;

import java.util.Arrays;

public class Task7 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double avg = (Arrays.stream(classPoints).sum() + yourPoints) / (classPoints.length + 1);
        return (yourPoints > avg);
    }
}
