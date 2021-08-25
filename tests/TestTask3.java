package java_core_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java_core.Task3;

class TestTask3 {

	private static final double delta = 0.0001;
	  @Test
	  public void test() {
		  
	      assertEquals(132, Task3.getVolumeOfCuboid(22, 2, 3), delta);
	      assertEquals(63, Task3.getVolumeOfCuboid(6.3, 2, 5), delta);
	  }
	}



