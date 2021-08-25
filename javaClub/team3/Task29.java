package javaClub.team3;

public class Task29 extends Task {
    @Override
    void execute() {
        try{
            System.out.println("Enter the number between 0-9: ");
            int num = scanner.nextInt();
            Kata29 kata = new Kata29();
            System.out.println(kata.switchItUp(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Kata29
{
    public static String switchItUp(int number)
    {
        switch(number){
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Nothing";
        }
    }
}