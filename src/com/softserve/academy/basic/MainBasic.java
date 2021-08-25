package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBasic extends Input {

        public static void main (String[]args){

            text();
            try {
                switch (br.readLine()) {
                    case "1":
                        Task1.main(args);
                        break;
                    case "2":
                        Task2.main(args);
                        break;
                    case "3":
                        Task3.main(args);
                      break;
                    case "4":
                        Task4.main(args);
                        break;
                    case "8":
                        Task8.main(args);
                        break;
                    case "9":
                        Task9.main(args);
                        break;
                    default:
                        System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                        System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                        MainBasic.main(args);

                }
            } catch (IOException e) {
                e.printStackTrace();
                MainBasic.main(args);
            }


        }

        private static void text() {

            System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + "  Double Integer");
            System.out.println(ConsoleColors.GREEN + "2" + ConsoleColors.RESET + "  multiplying two numbers");
            System.out.println(ConsoleColors.GREEN + "3" + ConsoleColors.RESET + "  calculate the volume of a cuboid");
            System.out.println(ConsoleColors.GREEN + "4" + ConsoleColors.RESET + "  Pixel art planning");
            System.out.println(ConsoleColors.GREEN + "8" + ConsoleColors.RESET + "  Get century from year");
            System.out.println(ConsoleColors.GREEN + "9" + ConsoleColors.RESET + "  Get negative number");
        }

    }
