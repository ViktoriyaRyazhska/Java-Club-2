package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
	
	public static int whatCentury(int a) {
		
		int century = 0;
		
		try {
			
			century = a / 100;
			if (a % 100 >0) 
				century +=1;
			
		}catch (NumberFormatException e){
			System.out.println(e);
		}return century;
	}	

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any year");
		int year = Integer.parseInt(br.readLine());
		System.out.println("Your year is from " + whatCentury(year) + " century ");
	}

}
