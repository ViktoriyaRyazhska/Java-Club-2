package tasks;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        System.out.println("\tTask 20.\n\t\tBoolean to string\n");
        System.out.println("Implement a function which convert the given boolean value into its string representation.");
        System.out.print("Enter a boolean value (true or false): ");

        Scanner sc = new Scanner(System.in);
        boolean bool;
        String str;
                do {
            try {
                str = sc.nextLine();
                if (str.equals("false")) {
                    bool = false;
                    System.out.println(convert(bool));
                    break;
                } else if (str.equals("true")) {
                    bool = true;
                    System.out.println(convert(bool));
                    break;
                } else {
                    throw new Exception("Entered non-boolean variable. Please enter true or false");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Enter a boolean value: ");
            }
        } while (true);

    }
    public static String convert(boolean b){

        if(b) {
            return "true";
        } else {
            return "false";
        }
    }
}
