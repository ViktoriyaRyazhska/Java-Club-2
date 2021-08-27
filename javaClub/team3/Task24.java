package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task24 extends Task{

    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the operation: ");
            String op = scanner.nextLine();
            System.out.println("Enter the first value: ");
            int val1 = scanner.nextInt();
            System.out.println("Enter the second value: ");
            int val2 = scanner.nextInt();
            System.out.println(basicMath(op, val1, val2));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch(op){
            case "+": return v1+v2;
            case "-": return v1-v2;
            case "*":return v1*v2;
            case "/": return v1/v2;
            default: return 0;
        }
    }

}

