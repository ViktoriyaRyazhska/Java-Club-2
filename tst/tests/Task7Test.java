package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tasks.Task3;
import tasks.Task7;

public class Task7Test {

	@ParameterizedTest
	@MethodSource("ArgumentsPast")
	public void SimpleTestPast(int hours, int minutes, int seconds) {
		int miliSeconds = hours * 3600000 + minutes * 60000 + seconds * 1000;
		assertEquals(miliSeconds, Task7.Past(hours, minutes, seconds));
		// fail("Not yet implemented");
	}

	private static Stream<Arguments> ArgumentsPast() {
		return Stream.of(Arguments.of(0, 0, 1), Arguments.of(0, 1, 0), Arguments.of(1, 0, 0), Arguments.of(23, 59, 59));
	}
	
	@Test
	void HoursExpectedException() {Assertions.assertThrows(IllegalArgumentException.class, () -> {
		Task7.Past(-1, 0, 0);
		}, "Expected exception");
		
	}
	
	@Test
	void  MinutesExpectedException() {Assertions.assertThrows(IllegalArgumentException.class, () -> {
		Task7.Past(0, -1, 0);
		});
		
	}
	
	@Test
	void SecondsExpectedException() {Assertions.assertThrows(IllegalArgumentException.class, () -> {
		Task7.Past(0, 0, -1);
		});
		
	}

}
