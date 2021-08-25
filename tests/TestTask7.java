package java_core_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java_core.Task7;

public class TestTask7 {

	@Test
	public void test1() {

		assertEquals(18305000, Task7.getTime(5, 5, 5));
	}

}
