package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;
import static javaClub.team3.Task19.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task19Test {
	@Test
	public void test1() {
		assertEquals(true, isDivisible(12,4,3));
	}
	@Test
	public void test2() {
		assertEquals(false, isDivisible(3,3,4));
	}	
		
}
