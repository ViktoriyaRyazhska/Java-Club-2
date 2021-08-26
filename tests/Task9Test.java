package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java_core.Task9;

class Task9Test {

	@Test
	void testBasicPositive() {
		assertEquals("-42", Task9.ReturnNegative("42"));
	}
	
	@Test
	void testbasicNegative() {
		assertEquals("-5", Task9.ReturnNegative("-5"));
	}

}
