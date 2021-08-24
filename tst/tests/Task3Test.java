package tests;

import tasks.Task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task3Test {

	@Test
	public void testGetVolumeOfCuboid1() {

		assertEquals(1000, Task3.getVolumeOfCuboid(10.0, 10.0, 10.0), 0.001);
		assertEquals(1, Task3.getVolumeOfCuboid(1.0, 1.0, 1.0), 0.001);
		assertEquals(10, Task3.getVolumeOfCuboid(5.0, 1.0, 2.0), 0.001);
	}

	
}
