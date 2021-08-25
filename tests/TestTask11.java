package java_core_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import java_core.Task11;

class TestTask11 {
	  @Test
	    public void testA() {
	        assertEquals("10.0 is above freezing temperature", Task11.weatherInfo(50));
	    }
	    @Test
	    public void testB() {
	        assertEquals("-5.0 is freezing temperature", Task11.weatherInfo(23));
	    }
}
