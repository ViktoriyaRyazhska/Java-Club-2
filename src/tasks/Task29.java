package tasks;
/*
https://www.codewars.com/kata/switch-it-up/
Description:
When provided with a number between 0-9, return it in words.
Input :: 1
Output :: "One".
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the number between 0-9: ");
            int num = scanner.nextInt();
            while(num <=0 || num >=10){
                System.out.println("Something is wrong. Enter the number between 0-9: ");
                num = scanner.nextInt();
            }
            System.out.println(switchItUp(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
    public static String switchItUp(int number)
    {
        switch(number){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Nothing";
        }
    }
}
