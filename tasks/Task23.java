package java_core;

import java.util.Scanner;

public class Task23 {
    Scanner scanner = new Scanner(System.in);
    loop:
            while (true) {
        String playerOne = scanner.nextLine().trim().toLowerCase();
        String playerTwo = scanner.nextLine().trim().toLowerCase();
        if ((playerOne.equals("scissors") || playerOne.equals("paper") || playerOne.equals("rock")) &&
                (playerTwo.equals("scissors") || playerTwo.equals("paper") || playerTwo.equals("rock")))
        {
            System.out.println(java_core.Kata.rps(playerOne, playerTwo));
            break loop;
        }
        System.out.println("Enter correct values: scissors/paper/rock");
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