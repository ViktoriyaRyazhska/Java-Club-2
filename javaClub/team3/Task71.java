package javaClub.team3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task71 extends Task{
    @Override
    void execute() {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        String input = "";
        try {
            System.out.println("Please enter a list of integers (q to finish input): ");
            while(!input.equals("q") && !input.equals("Q")){
                input = bufferedReader.readLine();
                if (!input.equals("q") && !input.equals("Q")){
                    listOfNumbers.add(Integer.parseInt(input));
                }
            }
            System.out.println("Only odd numbers: " + filterOddNumber(listOfNumbers));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }
    }
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        return listOfNumbers.stream().filter(l -> l%2 != 0).collect(Collectors.toList());
    }
}
