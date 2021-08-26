package tasks;

import java.util.Scanner;

public class Task7 { 
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int h;
        int m;
        int s;
        System.out.print("\tTask 7.\n\t\tBeginner Series #2 Clock\n");
        System.out.print("Enter hours :");
        do {
            try {
                h =  Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-int value!!!");
                System.out.print("Enter hours :");

            }
        } while (true);
        System.out.print("Enter minutes :");
        do {
            try {
                m =  Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-int value!!!");
                System.out.print("Enter minutes :");

            }
        } while (true);
        System.out.print("Enter seconds :");
        do {
            try {
                s =  Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Entered non-int value!!!");
                System.out.print("Enter seconds :");

            }
        } while (true);
        String answer = "Answer is :";
        System.out.println(answer + Past(h,m,s));
        scanner.close();


    }
    
    public static int Past(int h, int m, int s)
    {
        h = h * 3600000;
        m = m * 60000;
        s = s * 1000;
        return h + m + s;
    }
}
