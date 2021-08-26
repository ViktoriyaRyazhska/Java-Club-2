package javaClub.team3.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static javaClub.team3.Task7.*;

public class Task7Test {
	@Test
	void normalTest() {
		assertEquals(61000, Past.past(0,1,1));
	}
}