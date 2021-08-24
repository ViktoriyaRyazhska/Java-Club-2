package java_core;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    System.out.print("Firs number: ");
	    int num1 = in.nextInt();
	    System.out.print("Second number: ");
	    int num2 = in.nextInt();
	    System.out.print("Your answer: " + multiply(num1, num2));
		
		 }

    public static int multiply(int num1, int num2) {

    	try {  
    	int num3 = (int) num1 * num2;
    	return num3;
    	}catch(NumberFormatException e) {
        	System.out.println("You must enter number");
        }
    	
    } 
}