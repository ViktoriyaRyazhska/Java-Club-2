package javaClub.team3.Tests;

import static javaClub.team3.Task59.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task59Test {
	
	  
	 @Test
	    public void basicTests() {
	        assertEquals("Position of alphabet: 1", position('a'));
	        assertEquals("Position of alphabet: 26", position('z'));
	        assertEquals("Position of alphabet: 5", position('e'));       
	    }
}
