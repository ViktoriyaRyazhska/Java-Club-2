package java_core;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Firs year: ");
	    int num1 = in.nextInt();
	    System.out.print("Second year: ");
	    int num2 = in.nextInt();
	    System.out.print(CalculateAge(num1, num2));

	}

	public static String CalculateAge(int birth, int yearTo) {
	    if(birth < yearTo) {
	    	int a = yearTo - birth;
	    	if(a == 1) {
	    	String one = "You are " + a + " year old.";
	    	return one;
	    	}if(a > 1) {
	    	String one = "You are " + a + " years old.";
	    	return one;
	    	}
	    }if(birth > yearTo){
	    	int a = birth - yearTo;
	    	if(a == 1) {
	    	String two = "You will be born in " + a + " year.";
	    	return two;
	    	}if(a > 1){
	    	String two = "You will be born in " + a + " years.";
		    return two;
	    	}
	    }if(birth == yearTo){
	    	String three = "You were born this very year!";
	    	return three;
	    }
		return null;
	  }
	
}
