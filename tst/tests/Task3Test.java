package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tasks.Task3;

class Task3Test {

	@ParameterizedTest
	@MethodSource("Cuboid")
	void getVolumeOfCuboidSimpleTest(double length, double width, double height) {
		// fail("Not yet implemented");
		double volume = length * width * height;
		assertEquals(volume, Task3.getVolumeOfCuboid(length, width, height));
	}

	private static Stream<Arguments> Cuboid() {
		return Stream.of(Arguments.of(1, 2, 3), Arguments.of(10, 100, 1000), Arguments.of(1.5, 2.5, 3.5));
	}

	@Test
	void lengthExpectedException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task3.getVolumeOfCuboid(-1, 1, 1);
		});

	}
	@Test
	void  widthExpectedException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task3.getVolumeOfCuboid(1, -1, 1);
		});

	}
	void  heightExpectedException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task3.getVolumeOfCuboid(1, 1, -1);
		});

	}
	 

}
