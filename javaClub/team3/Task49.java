package javaClub.team3;

import java.util.Scanner;

public class Task49 extends Task{
    @Override
    void execute() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string to encode: ");
            String sourse = scanner.nextLine();
            while(sourse == null){
                System.out.println("Something is wrong. Enter the string again: ");
                sourse = scanner.nextLine();
            }
            Leetspeak newOne = new Leetspeak();
            System.out.println("The result of encoding is "+newOne.encode(sourse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    abstract class Encoder{
        public abstract String encode(String source);
    }

    public class Leetspeak extends Encoder {

        public String encode(String source) {
            if (source == null) {
                return "";
            }
            String result = "";
            char[] arr = source.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                result =result.concat(encode(arr[i]));
            }
            return result;
        }

        public String encode(char source) {
            switch (Character.toLowerCase(source)) {
                case 'a':
                    return "4";
                case 'e':
                    return "3";
                case 'l':
                    return "1";
                case 'm':
                    return "/^^\\";
                case 'o':
                    return "0";
                case 'u':
                    return "(_)";
                default:
                    return Character.toString(source);
            }
        }
    }
}
