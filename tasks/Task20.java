package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task20 {
	
	public static String converter ( boolean a) {
		
		if(a == true) {
			return "True";
		}else {
			return "False";
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		boolean b = Boolean.parseBoolean(br.readLine());
		System.out.println(converter(b));
		
	}

}
