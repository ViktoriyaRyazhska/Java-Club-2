package java_core;

public class Task6 {
	  
	public static void main() {
		
		public static void main(String[] args) {
			try {
			Scanner in = new Scanner(System.in);
		    System.out.print("������ �����: ");
		    int value = in.nextInt();
		    System.out.print("³������: " + toBinary(value));
			}catch(Exception e) {
	        	System.out.println("�� �������� ��������");
			
			}
			
			
		}
	
	public static int toBinary(int value) {
		  int n = Integer.valueOf(Integer.toBinaryString(value));
		      return n;
		        }
		     
}
