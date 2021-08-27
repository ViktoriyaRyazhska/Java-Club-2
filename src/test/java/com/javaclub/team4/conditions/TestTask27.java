package com.javaclub.team4.conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class TestTask27 {
	@Test
	public void testBob() {
		assertEquals("Should return 0.", 0, Task27.enough(10, 5, 5));
		assertEquals("Should return 10.", 10, Task27.enough(100, 60, 50));
		assertEquals("Should return 0.", 0, Task27.enough(20, 5, 5));
	}

	@Test
	public void randomTest() {
		Random r = new Random();
		int c = r.nextInt(60) + 40;
		int o = Math.min(c, r.nextInt(80) + 1);
		int w = r.nextInt(80) + 1;
		for (int i = 1; i <= 100; i++) {
			assertEquals(bob(c, o, w), Task27.enough(c, o, w));
		}
		System.out.println("100 random tests.");
	}

	private static int bob(int co, int ono, int waito) {
		return (ono + waito) <= co ? 0 : (co - (ono + waito)) * -1;
	}
}
