package java_core;

import java.util.Scanner;


public class Task18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    System.out.print("Entrer the num: ");
	    int num = in.nextInt();
	    System.out.println(num + ": " + opposite(num));

	}

	
	public static int opposite(int num) {
		try {
		int oppo = num - (num * 2);
		return oppo;
	}catch(NumberFormatException e) {
    	System.out.println("You must enter number");
    }
		return 0;
	
	}
	
	
	
	
}
