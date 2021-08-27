package tasks;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		double length;
		double width;
		double height;
		System.out.print("\tTask 3.\n\t\tVolume of a Cuboid\n");
		System.out.print("Enter value for length : ");
		do {
			try {
				length = Double.parseDouble(scanner.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-double value!!!");
				System.out.print("Enter value for length : ");

			}
		} while (true);
		System.out.print("Enter value for width : ");
		do {
			try {
				width = Double.parseDouble(scanner.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-double value!!!");
				System.out.print("Enter value for width : ");

			}
		} while (true);
		System.out.print("Enter value for height : ");
		do {
			try {
				height = Double.parseDouble(scanner.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-double value!!!");
				System.out.print("Enter value for width : ");

			}
		} while (true);
		String answer = "Volueme of cuboid is : ";
		try {
                    System.out.println(answer + getVolumeOfCuboid(length, width, height));
                    } 
		catch (IllegalArgumentException e) {
                // TODO: handle exception
                    System.out.print(e.getMessage());
                    }
		    scanner.close();

	         }

	public static double getVolumeOfCuboid(final double length, final double width, final double height) {
		
	        if(length < 0) {
                               throw  new IllegalArgumentException ("Error! Lentgh must be non-negative double");
                                }
                if(width < 0) {
                               throw  new IllegalArgumentException ("Error! Width must be non-negative double");
                                }
                if(height < 0) {
                               throw  new IllegalArgumentException ("Error! Height must be non-negative double");
                                }
                return length * width * height;
		
	}

}
