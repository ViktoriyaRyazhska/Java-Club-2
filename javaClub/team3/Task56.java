package javaClub.team3;
//https://www.codewars.com/kata/are-you-playing-banjo/
public class Task56 extends Task{
    @Override
    void execute() {

    }
    public class Banjo {
        public String areYouPlayingBanjo(String name) {
            if (name.toLowerCase().charAt(0) == 'r') return name+" plays banjo";
            else return name+" does not play banjo";
        }
    }
}
