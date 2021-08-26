package javaClub.team3.Tests;

import static javaClub.team3.Task54.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task54Test {
	
	  
	  @Test
	  public void tests() {
	    assertEquals(-1, opposite(1));
	    assertEquals(4, opposite(-4));
	    assertEquals(55, opposite(-55));
	  }
}
