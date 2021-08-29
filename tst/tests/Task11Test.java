package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import tasks.Task11;

class Task11Test {

	/*@ParameterizedTest
	@ValueSource(ints = {-10, 5, -5, 10, 20, -20} )
	void testWeatherInfo(int celTemp) {
		String expectedResult = "";
		
		// fail("Not yet implemented");
	}
*/
	@ParameterizedTest
	@ValueSource(ints = { 100, 50, 40, 35, 0 })
	void testConvertToCelsius(int temp) {

		int cels = (int)Math.round( ( (temp - 32) / 1.8));
		System.out.println ("testConvertToCelsius: expected: "+cels+" actual: "+Task11.convertToCelsius(temp));
		assertEquals(cels, Task11.convertToCelsius(temp));
		
		// fail("Not yet implemented");
	}

}
