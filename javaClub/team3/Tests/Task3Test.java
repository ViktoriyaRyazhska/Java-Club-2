package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static javaClub.team3.Task3.*;

public class Task3Test {
    @Test
    void normalTest() {
        assertEquals(1, getVolumeOfCuboid(1, 1, 1));
        assertEquals(8, getVolumeOfCuboid(2, 2, 2));
        assertEquals(6, getVolumeOfCuboid(1, 2, 3));
        assertEquals(1000, getVolumeOfCuboid(10, 10, 10));
    }
}
