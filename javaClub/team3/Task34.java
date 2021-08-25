package javaClub.team3;

public class Task34 extends Task{
    @Override
    void execute() {
        System.out.println("Enter the length of an array: ");
        try {
            int length = scanner.nextInt();
            int[] myArray = new int[length];
            for (int i =0; i< length; i++){
                System.out.println("Enter the "+(i+1)+". number: ");
                myArray[i] = scanner.nextInt();
            }
            School school= new School();
            System.out.println("The average mark is "+school.getAverage(myArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class School{
    public static int getAverage(int[] marks){
        int sum = 0;
        for(int i =0; i<marks.length; i++){
            sum+=marks[i];
        }
        return Math.round(sum/(marks.length));
    }
}
