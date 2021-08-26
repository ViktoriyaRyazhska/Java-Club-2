package string;

import com.softserve.academy.string.Task67;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class Task67Test {
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", Task67.toAlternativeString("hello world"));
        assertEquals("hello world", Task67.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", Task67.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", Task67.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", Task67.toAlternativeString(Task67.toAlternativeString("Hello World")));
        assertEquals("12345", Task67.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", Task67.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", Task67.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", Task67.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", Task67.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", Task67.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", Task67.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }

    @Test
    public void testNullArgument() {
        assertThrows(NullPointerException.class, () -> Task67.toAlternativeString(null));
    }
}
