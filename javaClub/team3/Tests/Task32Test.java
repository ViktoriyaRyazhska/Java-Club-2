package javaClub.team3.Tests;

import static javaClub.team3.Task3.getVolumeOfCuboid;
import static org.junit.jupiter.api.Assertions.*;

import javaClub.team3.Task32.Solution;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class Task32Test {
    @Test public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
    //Negative
    @Test public void exceptionThrowsTest(){
        assertThrows(InputMismatchException.class,
                () -> Solution.repeatStr(0, ""));
    }
}
