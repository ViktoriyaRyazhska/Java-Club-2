package java_core;

public class Task2 {
	public static void main(String[] args) {
		try {
		Scanner in = new Scanner(System.in);
	    System.out.print("������ ����� 1: ");
	    int num1 = in.nextInt();
	    System.out.print("������ ����� 2: ");
	    int num2 = in.nextInt();
	    System.out.print("���� �������: " + multiply(num1, num2));
		}catch(ArithmeticException e) {
        	System.out.println("�� �������� ��������");
        }
		 }
	
	
	
    public static int multiply(int num1, int num2) {
           
    	int num3 = (int) num1 * num2;
    	return num3;
    	
    	
    } 
}
