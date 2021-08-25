package tasks;

import static org.junit.Assert.*;
import tasks.Task7;

import org.junit.Test;


public class Task7Test {

	@Test
	public void testPast() {
		
		
		assertEquals(0, Task7.Past(0, 0, 0));
		assertEquals(59000, Task7.Past(0, 0, 59));
		assertEquals(3540000, Task7.Past(0, 59, 0));
		assertEquals(82800000, Task7.Past(23, 0, 0 ));
		// fail("Not yet implemented");

	}

	
	
}
