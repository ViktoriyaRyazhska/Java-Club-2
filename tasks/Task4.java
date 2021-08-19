package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task4 {

	public static void is_divisible(int a, int b) {
		
		boolean div = (a % b) == 0;
		if(div == true) {
			System.out.println("True");
		}else {
			
			System.out.println("False");
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size value in pixels");
		int pix = Integer.parseInt(br.readLine());
		System.out.println("Enter the size value milimeters");
		int mil = Integer.parseInt(br.readLine());
		
		is_divisible(pix, mil);
		
	}
	
}
