package javaClub.team3.Tests;

import static javaClub.team3.Task69.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task69Test {
	
	 @Test
	    public void testSomething() {
		    List<String> items = push();
		      assertEquals(1,items.size());
		      assertEquals("an object", items.get(0));
	    }
}
