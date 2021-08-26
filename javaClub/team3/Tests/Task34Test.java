package javaClub.team3.Tests;

import static javaClub.team3.Task34.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task34Test {
	
	  
	  @Test
	  public void testBasics()
	  {

			assertEquals(2,getAverage(new int[] {2,2,2,2}));
			assertEquals(3,getAverage(new int[] {1,2,3,4,5}));
			assertEquals(1,getAverage(new int[] {1,1,1,1,1,1,1,2}));
	  }
}
