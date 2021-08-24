package java_core;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerOne = scanner.next();
        String playerTwo = scanner.next();
        System.out.println( Kata.rps(playerOne,playerTwo) );
    }

}

 class Kata {
    public static String rps(String p1, String p2) {

        String cycle [] = {"scissors","paper","rock"};
        try {
            for (int i = 0; i < cycle.length; ++i) {
                int j = i + 1;
                if (i == cycle.length - 1) j = 0;
                if (cycle[i].equals(p1) && cycle[j].equals(p2)) return "Player 1 won!";
                else if (cycle[j].equals(p1) && cycle[i].equals(p2)) return "Player 2 won!";
            }
        }
        catch (IndexOutOfBoundsException obj) {
            System.out.println(" Index out of bounds! ");
        }
        return "Draw!";
    }
}

// Player 2 won!