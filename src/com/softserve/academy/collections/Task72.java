package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;
import com.softserve.academy.classes.Task23;

import java.util.HashMap;
import java.util.Map;


import java.io.IOException;

import static com.softserve.academy.Input.br;


public class Task72 {
    Dictionary d = new Dictionary();
    public static void main(String[] args){
        String command ;
        String command3 = "initilized";
        String word;
        String description;
        Dictionary d = new Dictionary();

        try{
            System.out.println("What do you want to do?");
            System.out.println("1  -   add a new word and a description to the dictionary");
            System.out.println("2  -  read the description  of the word");
            command = br.readLine();
            if(command.equals("1")){
                System.out.println("Please, write in the word: ");
                word = br.readLine();
                System.out.println("Please, write in the description for: " + word);
                description = br.readLine();
                d.add_word(word, description);
                System.out.println("The word and description have beeen added successfully! ");
            }
            else if(command.equals("2")){
                System.out.println("Please, write in the word: ");
                word = br.readLine();
                System.out.println(d.look(word));

            }
            else {
                throw new IOException("Illegal input");
            }

            while(!command3.equals("3")){
                System.out.println("Wanna try again? ");
                System.out.println("1 - put a new word and the desciption into the dictionary. ");
                System.out.println("2 - read the description of the added word.");
                System.out.println("3 -  end the game");
                command3 = br.readLine();
                if(command3.equals("1")){
                    System.out.println("Please, write in the word: ");
                    word = br.readLine();
                    System.out.println("Please, write in the description for: " + word);
                    description = br.readLine();
                    d.add_word(word, description);
                    System.out.println("The word and description have beeen added successfully! ");
                }
                else if (command3.equals("2")){
                    System.out.println("Please, write in the word: ");
                    word = br.readLine();
                    System.out.println(d.look(word));
                }
                else break;
            }

        }
        catch(IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);
            Task72.main(args);

        }
        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task72.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task72.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }



    };


    public static class Dictionary{
        Map<String, String> map = new HashMap<>();

        public void add_word(String word, String description){
           // if(word.equals("") || description.equals(""))throw new Exception("Illegal input");
            this.map.put(word, description);
        }


         public String look(String word){
            //if (word.equals("")) throw new IOException("Illegal input");
            if(this.map.containsKey(word))
                    return this.map.get(word);
            return "Can`t find entry for " + word;
         }


    }
}


