package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java_core.Task1;
class Task1Test {

	@Test
	void basicTest() {
		assertEquals(4, java_core.Task1.Double(2));
		assertEquals(18, Task1.Double(9));
	}

}
