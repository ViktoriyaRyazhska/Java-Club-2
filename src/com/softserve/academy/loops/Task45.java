package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task45 extends Input {

    public static void main(String[] args) {

        int gap;
        long start;
        long finish;

        int count = 0;

        System.out.println("");
        System.out.println("Lops 45 ");
        System.out.println("Gap in Primes");
        System.out.println("I find first pair of prime numbers as specified gap on numerical line");
        System.out.println("for example: gap 2 , numerical line with 100 to 110 --->>  101, 103 ");

        try {
            System.out.println("put gap >= 2");
            gap = Integer.parseInt(br.readLine());
            System.out.println("put  start of numerical line >=2 ");
            start = Long.parseLong(br.readLine());
            System.out.println("put finish of numerical line >=2  (won't go beyond 1100000)");
            finish = Long.parseLong(br.readLine());

         if(gap >= 2 && start >=2 && finish <= 1100000 ) {
             System.out.println(Arrays.toString(gap(gap,start,finish)));
         }else {
             System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
             Task45.main(args);
         }



        } catch (IOException | NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task45.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task45.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task45.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }


    public static long[] gap(int g, long m, long n) {
        List<Long> listPrimeNumbs = allPrimeNumbsBetween(m, n);
        for (int i = 0; i < listPrimeNumbs.size() - 1; i++) {
            if (listPrimeNumbs.get(i + 1) - listPrimeNumbs.get(i) == g) {
                return new long[]{listPrimeNumbs.get(i), listPrimeNumbs.get(i + 1)};
            }
        }

        return null;
    }


    private static List allPrimeNumbsBetween(long m, long n) {

        List<Long> listPrimeNumbs = new ArrayList<>();
        for (long i = m; i < n; i++) {
            if (numbIsPrime(i)) {
                listPrimeNumbs.add(i);
            }
        }

        return listPrimeNumbs;
    }

    private static boolean numbIsPrime(long numb) {
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }


}

