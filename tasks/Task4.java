package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
	
	public static boolean isDivisible (int a, int b) {
		
		try {
			
		int div = a %  b;
		if ( div == 0) {
			return true;
		}else {
			return false;
		}
	} catch(NumberFormatException e) {
		System.out.print(e);
	}catch( ArithmeticException e) {
		System.err.print(e);
	}return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of pixel");
		int pix = Integer.parseInt(br.readLine());
		System.out.println("Enter the value of milimeters");
		int mm = Integer.parseInt(br.readLine());
		
		System.out.println(isDivisible(pix, mm));
		
	}

}
