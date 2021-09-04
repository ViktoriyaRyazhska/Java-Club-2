package javaClub.team3.Tests;

import javaClub.team3.Task1;
import javaClub.team3.Task58;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    @Test
    public void MainTestPos(){
        assertEquals(2, Task1.Java.doubleInteger(1));
        assertEquals(144, Task1.Java.doubleInteger(72));
        assertEquals(2222, Task1.Java.doubleInteger(1111));
    }
}