package javaClub.team3;

public class Task44 extends Task{
    @Override
    void execute() {
        try{
            System.out.println("Enter the number : ");
            int num = scanner.nextInt();
            while(num <=0 || num >=10){
                System.out.println("Something is wrong. Enter the number again: ");
                num = scanner.nextInt();
            }
            System.out.println("The summation is "+summation(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int summation(int n) {
        int sum =0;
        for(int i = 1; i<= n; i++){
            sum+= i;
        }
        return sum;
    }
}
