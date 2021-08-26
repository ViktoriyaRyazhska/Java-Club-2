package javaClub.team3.Tests;

import static javaClub.team3.Task44.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Task44Test {
	
	  
	@Test
    public void test1() {
        assertEquals(1, summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36, summation(8));
    }
}
