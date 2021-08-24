package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tasks.Task3;

public class Task3Test {

	@Test
	public void testGetVolumeOfCuboid1() {

		assertEquals(1000, Task3.getVolumeOfCuboid(10.0, 10.0, 10.0), 0.001);
		assertEquals(1, Task3.getVolumeOfCuboid(1.0, 1.0, 1.0), 0.001);
		assertEquals(10, Task3.getVolumeOfCuboid(5.0, 1.0, 2.0), 0.001);
	}

	@Test
	public void testNegativeResult() {
		double vol1 = 0;
				vol1 = Task3.getVolumeOfCuboid(-10, 100, 10);
			if (vol1 < 0) {
				throw new  RuntimeException("Bad result.");
			}
			vol1 = Task3.getVolumeOfCuboid(10, -100, 10);
			if (vol1 < 0) {
				throw new  RuntimeException("Bad result.");
			}
			vol1 = Task3.getVolumeOfCuboid(10, 100, -10) ;
			if (vol1 < 0) {
				throw new  RuntimeException("Bad result.");
			}
			
		
		

	}

}
