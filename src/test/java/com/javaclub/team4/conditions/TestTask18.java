package com.javaclub.team4.conditions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTask18 {

	@Test
	public void tests() {
		assertEquals(-1, Task18.opposite(1));
		assertEquals(0, Task18.opposite(0));
		assertEquals(25, Task18.opposite(-25));
	}
}
