package javaClub.team3.Tests;

import static javaClub.team3.Task64.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task64Test {
	
	 @Test
	    public void testSomething() {
	         assertEquals(1, CodeWars.strCount("Hello", 'o'));
	         assertEquals(2, CodeWars.strCount("Hello", 'l'));
	         assertEquals(0, CodeWars.strCount("",'z'));
	    }
}
