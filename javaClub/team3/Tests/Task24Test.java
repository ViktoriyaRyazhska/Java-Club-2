package javaClub.team3.Tests;

import static javaClub.team3.Task24.basicMath;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task24Test {
	
	  
	  @Test
	  public void testBasics()
	  {

	    assertEquals(basicMath("+", 4, 7), 11);
	    assertEquals(basicMath("-", 15, 18), -3);
	    assertEquals(basicMath("*", 5, 5), 25);
	    assertEquals(basicMath("/", 49, 7), 7);
	  }
}
