package java_core;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter values of your cuboid: ");
        double [] values = new double[3];
        for (int i =0; i < 3; ++i){
            values[i] = scan.nextDouble();
        }
        System.out.println(getVolumeOfCuboid(values[0],values[1],values[2]));

    }

    public static double getVolumeOfCuboid (double height,double width, double length)
    {
        return height*width*length;
    }

}

