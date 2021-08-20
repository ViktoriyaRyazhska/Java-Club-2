package javaClub.team3.Tests;

import static javaClub.team3.Task5.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Task5Test {
    @Test
    void GreetJim() {
        assertEquals("Hello, Jim!", greet("Jim"));
    }
    @Test
    void GreetJohnny() {
        assertEquals("Hello, my love!", greet("Johnny"));
    }
}