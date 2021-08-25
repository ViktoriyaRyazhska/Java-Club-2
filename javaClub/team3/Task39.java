package javaClub.team3;

public class Task39 extends Task{
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
            Kata39 kata = new Kata39();
            System.out.println("The result of grown is " + kata.grow(myArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Kata39{
    public static int grow(int[] x){
        int res = x[0];
        for(int i =1; i< x.length; i++){
            res*=x[i];
        }
        return res;
    }
}