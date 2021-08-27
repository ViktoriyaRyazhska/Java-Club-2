package com.javaclub.team4.conditions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class TestTask24 {
    
    @Test
    public void testBasics() {
      System.out.println("Basic Tests");
      assertThat(Task24.basicMath("+", 4, 7), is(11));
      assertThat(Task24.basicMath("-", 15, 18), is(-3));
      assertThat(Task24.basicMath("*", 5, 5), is(25));
      assertThat(Task24.basicMath("/", 49, 7), is(7));
    }
    
    @Test
    public void testRandomAddition() {
      for(int i=0; i<5; i++) {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        
        assertThat(Task24.basicMath("+", value1, value2), is(value1 + value2));
      }
    }
    
    @Test
    public void testRandomSubtraction() {
      for(int i=0; i<5; i++) {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        
        assertThat(Task24.basicMath("-", value1, value2), is(value1 - value2));
      }
    }
    
    @Test
    public void testRandomMultiplication() {
      for(int i=0; i<5; i++) {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        
        assertThat(Task24.basicMath("*", value1, value2), is(value1 * value2));
      }
    }
    
    @Test
    public void testRandomDivision() {
      for(int i=0; i<5; i++) {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        
        assertThat(Task24.basicMath("/", value1, value2), is(value1 / value2));
      }
    }
}