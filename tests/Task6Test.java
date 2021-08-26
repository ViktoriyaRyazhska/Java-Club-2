package java_core_test;

import java_core.Task6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    public void Test(){
        assertEquals(1, Task6.toBinary(1));
        assertEquals(110, Task6.toBinary(6));
        assertEquals(1011, Task6.toBinary(11));
    }
}