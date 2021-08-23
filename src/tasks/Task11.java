package tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tTask 11.\n\t\tGrasshopper - Debug\n");
        System.out.print("Enter tempereture :");
        int temp;
        do {
            try {
                temp =  Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-int value!!!");
                System.out.print("Enter tempereture :");

            }
        } while (true);

        System.out.print(weatherInfo(temp));
        scanner.close();
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) / 1.8;
        return celsius;
    }
}

