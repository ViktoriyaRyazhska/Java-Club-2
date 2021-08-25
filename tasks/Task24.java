package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task24 {
	
	public static Double basicMath(final String sign, final double a, final double b) {
		
		Double result = 0.0;
		
		try {
			
		if(sign.equals("+")) {
			result = a+b;
			return  result;
			
		}if(sign.equals("-")) {
			result = a-b;
			return result;
			
		}if (sign.equals("*")) {
			result = a*b;
			return result;
			
		}if(sign.equals("/")) {
			result = a/b;
			return result;
		}else {
			System.out.println("You must enter on of 4 basic operators");
		}
		}catch(ArithmeticException | NumberFormatException e) {
			System.err.print(e);
			
		}
		return result;
		
	}		
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("enter the one of 4 basic math's operations");
		String sign = br.readLine();
		System.out.println("Enter the first number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(basicMath(sign, a, b));
	}
}