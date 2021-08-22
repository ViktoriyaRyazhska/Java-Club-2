package Tasks.Task3;
import java.util.Scanner;

public class task3 {
    public static double main (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculate the volume of a cuboid with three values: length, width, height");
        System.out.print("Enter value for length : ");
        double length = scanner.nextDouble();
        System.out.print("Enter value for width : ");
        double width = scanner.nextDouble();
        System.out.print("Enter value for height : ");
        double height = scanner.nextDouble();
        getVolumeOfCuboid(length,width,height);
        String answer = "Volueme of cuboid is : ";
        System.out.println(answer + getVolumeOfCuboid(length,width,height));
        return 0;
    }
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume = length * width * height;
        return volume;
    }

}
