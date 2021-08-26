package java_core;

import java.util.Scanner;

public class Task9 {
    public static String ReturnNegative(String  word){
        if ((word.charAt(0) == '-') || (word.equals("0")) ){
            return word;
        } else
            return "-" + word;
    }

    public static boolean isNumeric(String x) {
        return isInt(x) || isDouble(x);
    }
    
    public static boolean isInt(String x) throws NumberFormatException {
        try {
            Integer.parseInt(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static boolean isDouble(String x) throws NumberFormatException {
        try {
            Double.parseDouble(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your integer number:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (isNumeric(s)){
            if(isInt(s)){
                System.out.println(ReturnNegative(s));
            } else if (isDouble(s)){
                System.out.println(ReturnNegative(s));
            } else return;
        } else {
            System.out.println("Wrong input data type...");
            return;
        }
    }
}
