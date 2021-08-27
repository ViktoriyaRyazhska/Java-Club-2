package com.javaclub.team4.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.security.SecureRandom;
import java.lang.reflect.*;

public class TestTask12 {
	SecureRandom r = new SecureRandom();

	@Test
	public void testSample() {
		Task12 ed = new Task12();
		assertEquals(0, ed.getNumber());
	}

	@Test
	public void fieldVisibilityTest() {
		Task12 ed = new Task12();
		try {
			Field fieldNumber = ed.getClass().getDeclaredField("number");
			Field fieldStringValue = ed.getClass().getDeclaredField("stringValue");
			Field fieldAnObject = ed.getClass().getDeclaredField("anObject");
			assertTrue("number is not private", Modifier.isPrivate(fieldNumber.getModifiers()));
			assertTrue("stringValue is not private", Modifier.isPrivate(fieldStringValue.getModifiers()));
			assertTrue("anObject is not private", Modifier.isPrivate(fieldAnObject.getModifiers()));
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
			fail();
		}
	}

	@Test
	public void testRandomly() {
		Task12 ed = new Task12(5, "hola", new Integer(5));

		assertEquals(5, ed.getNumber());

		assertEquals("hola", ed.getStringValue());

		assertEquals(new Integer(5), ed.getAnObject());

		// testing setters y getters
		for (int i = 0; i < 35; i++) {
			int expectedNum = r.nextInt(10000);
			ed.setNumber(expectedNum);
			assertEquals(expectedNum, ed.getNumber());

			String expectedStr = r.nextInt(10000) + "";
			ed.setStringValue(expectedStr);
			assertEquals(expectedStr, ed.getStringValue());

			Object expectedObj = r.nextInt(10) > 5 ? new Integer(r.nextInt(10000)) : r.nextInt(10000) + "";
			ed.setAnObject(expectedObj);
			assertEquals(expectedObj, ed.getAnObject());
		}
	}
}
