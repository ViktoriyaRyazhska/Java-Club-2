package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static javaClub.team3.Task2.*;

public class Task2Test {
	@Test
	void normalTest() {
		assertEquals(4, multiply(2, 2));
		assertEquals(10, multiply(5, 2));
		assertEquals(100, multiply(100, 1));
		assertEquals(0, multiply(0, 1000));
	}
}
