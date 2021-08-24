package test;

import static java_core.Task5.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Task5Test {

	@Test
	void GreetJim() {
		
		assertEquals("Hello, Jack!", Greet("Jack"));
	
	}
	
	@Test
	void GreetJohny() {
		
		assertEquals("Hello, my love!",Greet ("Johnny") );
	}

}
