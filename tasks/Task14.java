package java_core;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter the top of the first fraction: ");
	    int top = in.nextInt();
	    System.out.print("Enter the bottom of the first fraction: ");
	    int bottom = in.nextInt();
        Task14 firstOne = new Task14(top, bottom);

        System.out.println("Enter the top of the second fraction:");
        top = in.nextInt();
        System.out.println("Enter the bottom of the second fraction:");
        bottom = in.nextInt();
        Task14 secondOne = new Task14(top, bottom);

        System.out.println(firstOne.add(secondOne).toString());
	
	}
	
	private final long top;
    private final long bottom;


    public Task14(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { try{ return 17 * Long.hashCode(top) + Long.hashCode(bottom);}catch(Exception e) {
		System.out.println("Try again");
	}
	return 0; }    
    @Override
    public boolean equals(Object o) { try { return compareTo((Task14)o) == 0; }catch(Exception e) {
		System.out.println("Try again");
	}
	return false;}    
    public int compareTo(Task14 f2){ try{ return Long.compare(top * f2.bottom, f2.top * bottom); }catch(Exception e) {
		System.out.println("Try again");
	}
	return 0;}
    
    public String toString() {
    	try {
    	String drob = top + "/" + bottom;
		return drob;
    	}catch(Exception e) {
    		System.out.println("Try again");
    	}
		return null;
    	}

    //Add two fractions
    public Task14 add(Task14 f2) {
        try {
    	long top= this.top * f2.bottom + this.bottom * f2.top;
        long bottom= this.bottom * f2.bottom;
        Task14 miniDrob = new Task14(top, bottom);
        return miniDrob.Reduction();
        }catch(Exception e) {
    		System.out.println("Try again");
    	}
		return null;
        }
    
    public Task14 Reduction() {
        try {
    	long gcd =0;
        for (long i=1; i<= this.bottom && i<= this.top; i++) {
            if (this.top%i ==0 && this.bottom  % i ==0 ){
                gcd = i;
            }
        }
        Task14 miniDrob = new Task14(this.top/gcd, this.bottom/gcd);
        return miniDrob;
        }catch(Exception e) {
    		System.out.println("Try again");
    	}
		return null;
        }
}
