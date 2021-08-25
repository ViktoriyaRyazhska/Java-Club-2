package java_core;

import java.util.Scanner;

public class Task6 {
	  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter num: ");
	    int value = in.nextInt();
	    System.out.print("Answer: " + toBinary(value));
	}
	
	public static int toBinary(int value) {
		int n;
		try {
		n = Integer.valueOf(Integer.toBinaryString(value));
  		 return n;

		}catch(Exception e) {
        	System.out.println("Incorrect input");
		}
		 return 0;
	}
}
