package java_core;

public class Task2 {
<<<<<<< HEAD
	
=======
>>>>>>> a6db57049ea5f497b262a760d3a818358a089b71
	public static void main(String[] args) {
		try {
		Scanner in = new Scanner(System.in);
	    System.out.print("������ ����� 1: ");
	    int num1 = in.nextInt();
	    System.out.print("������ ����� 2: ");
	    int num2 = in.nextInt();
	    System.out.print("���� �������: " + multiply(num1, num2));
<<<<<<< HEAD
		}catch(Exception e) {
=======
		}catch(ArithmeticException e) {
>>>>>>> a6db57049ea5f497b262a760d3a818358a089b71
        	System.out.println("�� �������� ��������");
        }
		 }
	
<<<<<<< HEAD
=======
	
	
	
>>>>>>> a6db57049ea5f497b262a760d3a818358a089b71
    public static int multiply(int num1, int num2) {
           
        	int num3 = (int) num1 * num2;
        	return num3;
        
        
    } 
}