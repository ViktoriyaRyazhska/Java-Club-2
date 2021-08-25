package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import com.softserve.academy.basic.Task3;

import java.io.IOException;


public class Task12 extends Input {
    private int number = 0;
    private String stringValue;
    private Object anObject;

    public Task12(){}
    public Task12(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }



    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Classes task12 ");
        System.out.println("I just use encapsulate ");
        System.out.println("I use encapsulate. test is finished ");

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task3.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task12.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


}
