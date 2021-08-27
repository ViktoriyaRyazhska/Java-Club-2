package javaClub.team3.Tests;

import static javaClub.team3.Task29.switchItUp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task29Test {
	
	  
	  @Test
	  public void testBasics()
	  {

		    assertEquals("One", switchItUp(1));
	        assertEquals("Three", switchItUp(3));
	        assertEquals("Five", switchItUp(5));
	  }
}
