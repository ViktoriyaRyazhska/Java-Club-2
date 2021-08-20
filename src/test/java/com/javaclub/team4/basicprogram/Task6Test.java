package com.javaclub.team4.basicprogram;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task6Test {

	@Test
	public void testToBinary() {
		assertEquals(1, Task6.toBinary(1));
		assertEquals(10, Task6.toBinary(2));
		assertEquals(11, Task6.toBinary(3));
		assertEquals(101, Task6.toBinary(5));
		assertEquals(110010, Task6.toBinary(50));
	}
}
