package tasks;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
        double height;
        System.out.print("\tTask 3.\n\t\tVolume of a Cuboid\n");
        System.out.print("Enter value for length : ");
        do {
            try {
                length =  Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-double value!!!");
                System.out.print("Enter value for length : ");

            }
        } while (true);
        System.out.print("Enter value for width : ");
        do {
            try {
                width =  Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-double value!!!");
                System.out.print("Enter value for width : ");

            }
        } while (true);
        System.out.print("Enter value for height : ");
        do {
            try {
                height =  Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-double value!!!");
                System.out.print("Enter value for width : ");

            }
        } while (true);
        String answer = "Volueme of cuboid is : ";
        System.out.println(answer + getVolumeOfCuboid(length,width,height));
        scanner.close();

    }
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume = length * width * height;
        return volume;
    }

}
