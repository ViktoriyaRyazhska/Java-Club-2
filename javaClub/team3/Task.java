package javaClub.team3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class Task {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    abstract void execute();

}
