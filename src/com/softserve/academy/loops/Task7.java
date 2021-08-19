package com.softserve.academy.loops;

import java.util.Arrays;

public class Task7 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    /* int sum = yourPoints;
    for(int i = 0; i < classPoints.length; i++) {
      sum += classPoints[i];
    }
    double avg = sum / (classPoints.length + 1);
    return (yourPoints >= avg); */
        double avg = (Arrays.stream(classPoints).sum() + yourPoints) / (classPoints.length + 1);
        return (yourPoints > avg);
    }
}
