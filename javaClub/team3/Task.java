package javaClub.team3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

abstract class Task {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    
    abstract void execute();

}