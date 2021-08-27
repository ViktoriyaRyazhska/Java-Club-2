package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task46 extends Task{

    @Override
    void execute() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of sticks:");
            int stick = scanner.nextInt();
            int defaultSt = stick;

            int turn=0;
            int num=0;
            while(stick > 0){
                if (turn == 0){
                    num =makeMove(stick);
                    stick-=num;
                    System.out.println("Bob takes "+(defaultSt-stick)+"   -->  "+stick+" sticks left");
                    defaultSt = stick;
                    turn++;
                } else{
                    num =makeMove(stick);
                    stick-=num;
                    System.out.println("Jim takes "+(defaultSt-stick)+"   -->  "+stick+" sticks left");
                    defaultSt = stick;
                    turn--;
                }
            }

            if(turn ==0){
                System.out.println("Jim has won!");
                //jim will never win, but let this condition be for fairness
            } else{
                System.out.println("Bob has won!");
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    private static final Random r = new Random();
    public static int makeMove(int sticks) {
        if (sticks % 4 == 0) {
            return r.nextInt(3) + 1;
        }
        return sticks % 4;
    }
}
