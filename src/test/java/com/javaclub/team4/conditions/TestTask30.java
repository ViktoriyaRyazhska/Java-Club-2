package com.javaclub.team4.conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class TestTask30 {
	String input;
	String expected;

	@Test
	public void testUpdateLight() {
		assertEquals("green", Task30.updateLight("red"));
		assertEquals("yellow", Task30.updateLight("green"));
		assertEquals("red", Task30.updateLight("yellow"));
	}

	@Test
	public void testRandomUpdateLight() {
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			int index = rand.nextInt(3);
			switch (index) {
			case 0:
				input = "green";
				expected = "yellow";
				break;
			case 1:
				input = "yellow";
				expected = "red";
				break;
			case 2:
				input = "red";
				expected = "green";
				break;
			}
			assertEquals(expected, Task30.updateLight(input));
		}
	}
}
