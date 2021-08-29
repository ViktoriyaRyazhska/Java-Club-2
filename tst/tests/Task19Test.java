package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tasks.Task19;

class Task19Test {

	@ParameterizedTest
	@MethodSource("parametersTrueIsDivisible")
	void testTrueIsDivisible(long num, long x, long y) {

		assertTrue(Task19.isDivisible(num, x, y));
	}

	private static Stream<Arguments> parametersTrueIsDivisible() {
		return Stream.of(Arguments.of(6, 2, 3), Arguments.of(10, 2, 5), Arguments.of(8, 2, 4), Arguments.of(12, 2, 3),
				Arguments.of(15, 5, 3));
	}

	@ParameterizedTest
	@MethodSource("parametersFalseIsDivisible")
	void testFalseIsDivisible(long num, long x, long y) {

		assertFalse(Task19.isDivisible(num, x, y));
	}

	private static Stream<Arguments> parametersFalseIsDivisible() {
		return Stream.of(Arguments.of(5, 2, 3), Arguments.of(11, 2, 5), Arguments.of(9, 2, 4), Arguments.of(45, 2, 3),
				Arguments.of(57, 15, 13));
	}

}
