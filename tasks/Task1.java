package java_core;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your integer number:");
        int i;
        do {
            try {
                String s = scan.nextLine();
                i = Integer.parseInt(s);
                break;
            }
            catch (Exception wrongInputDataType) {
                System.out.println("Wront input data type...");
            }
        } while (true);
        System.out.println(2 * i);
    }
}
