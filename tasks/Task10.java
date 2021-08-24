package java_core;
import java.util.Scanner;

public class Task10 {
	 public static void main(String[] args) {
         
	Scanner in = new Scanner(System.in);
    System.out.print("¬вед≥ть св≥й в≥к: ");
    int age = in.nextInt();
    if((int)age >= 14) {
    System.out.println(datingRange(age));
    }else {
    	System.out.println("¬и ще занадто юн≥.");
    	}
    
	 }
	 
	public static String datingRange(int age) {
	    int min;
	    int max;
	    
	    if( age >=14){
	    	
	    min = (int) (age - 0.10 * age);
	 	max = (int) (age + 0.10 * age);
	 	String a = (String) "–екомендований в≥к " + min + "-" + max;
	 	return a;
	    }
	
		return null;
	 	
	    }
	
	}
	 
	 