package tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int num1, num2;

        System.out.print("\tTask 4.\n\t\t\n" +
                "Thinkful - Number Drills: Pixelart planning.\n");
        System.out.println("Your function should take two arguments: the size of the wall in millimeters " +
                "and the size of a pixel in millimeters." + "\n" +
                "It should return True if you can fit an exact number of pixels on the wall, " +
                "otherwise it should return False. \n");


        System.out.print("Input size of the wall in millimeters:");
        Scanner sc = new Scanner(System.in);

        do {
            try {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-integer value!!!");
                System.out.print("Input valid integer value:");

            }
        } while (true);

        System.out.print("Input size of the pixel in millimeters:");

        do {
            try {
                num2 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-integer value!!!");
                System.out.print("Input valid integer value:");
            }
        } while (true);

        System.out.println("Result: " + isDivisible(num1, num2));
        sc.close();
    }
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }

}
