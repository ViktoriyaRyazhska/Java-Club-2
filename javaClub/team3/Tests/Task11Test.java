package javaClub.team3.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import javaClub.team3.Task11;

public class Task11Test {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", Task11.Weather.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", Task11.Weather.weatherInfo(23));
    }
}
