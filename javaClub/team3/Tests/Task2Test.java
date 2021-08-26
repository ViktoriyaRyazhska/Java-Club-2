package javaClub.team3.Tests;

import javaClub.team3.Task2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Random;

import static javaClub.team3.Task2.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

	@Test
	void normalTest() {
		assertEquals(4, Multiply.multiply(2, 2));
		assertEquals(10, Multiply.multiply(5, 2));
		assertEquals(100, Multiply.multiply(100, 1));
		assertEquals(0, Multiply.multiply(0, 1000));
		assertEquals(-25, Multiply.multiply(5, -5));
		assertEquals(25, Multiply.multiply(-5, -5));
	}

	@Test
	void negativeTest() throws InputMismatchException {
		assertThrows(InputMismatchException.class, () -> {
			Multiply.multiply(1000000000, 1000000000);
		});
	}
}
