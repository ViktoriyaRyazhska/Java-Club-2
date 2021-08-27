package javaClub.team3.Tests;

import javaClub.team3.Task12;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task12Test {
    Task12.EncapsulationDemo encDemo = new Task12.EncapsulationDemo(3, "helloWorld", new Object());
    @Test
    public void gettersTest(){
        assertEquals(3, encDemo.getNumber());
        assertEquals("helloWorld", encDemo.getStringValue());
        assertEquals(Object.class, encDemo.getAnObject().getClass());
    }
    @Test
    public void settersTest(){
        encDemo.setNumber(8);
        assertEquals(8, encDemo.getNumber());
        encDemo.setStringValue("New string");
        assertEquals("New string", encDemo.getStringValue());
        encDemo.setAnObject(null);
        assertEquals(null, encDemo.getAnObject());
    }
}
