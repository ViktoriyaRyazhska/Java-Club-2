package javaClub.team3.Tests;

import static javaClub.team3.Task39.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task39Test {
	
	  
	  @Test
	  public void testBasics()
	  {
		  assertEquals(6, grow(new int[]{1,2,3}));
	      assertEquals(16, grow(new int[]{4,1,1,1,4}));
	      assertEquals(64, grow(new int[]{2,2,2,2,2,2}));
	  }
}
