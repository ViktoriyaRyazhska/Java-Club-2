package tasks;
/*
https://www.codewars.com/kata/opposites-attract/train/java
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task25{

    public static void main(String[] args) {
        int flower1 = 0;
        int flower2 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter a number of first flowers petals: ");
            flower1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please enter a number of second flowers petals: ");
            flower2 = Integer.parseInt(bufferedReader.readLine());
            if(flower1 <= 0 || flower2 <=0 ){
                System.err.println("It seems you entered a wrong number of petals.");
                return;
            }
            else {
                if (isLove(flower1, flower2)){
                    System.out.println("Timmy & Sarah are in love!");
                } else {
                    System.out.println("Timmy & Sarah aren't in love!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }
    }
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 !=0)
                || (flower1 % 2 != 0 && flower2 % 2 == 0 );
    }
}
