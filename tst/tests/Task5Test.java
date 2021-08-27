package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import tasks.Task1;
import tasks.Task5;

public class Task5Test {
    @Test
    public void greet_shouldReturnHelloMyLoveToJohnny() {
        assertEquals("Hello, my love!", Task5.Greet("Johnny"));
    }
    public void greet_shouldReturnHelloNameToNotJohny() {
        assertEquals("Hello, Ivan!", Task5.Greet("Ivan"));
    }

}