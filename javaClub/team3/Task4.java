
package javaClub.team3;

//Your function should take two arguments: the size of the wall in millimeters and the size of
//a pixel in millimeters. It should return True if you can fit  an exact number of pixels on
//the wall, otherwise it should return False. For example is_divisible(4050, 27) should return
//True, but is_divisible(4066, 27)should return False.

public class Task4 extends Task{

    @Override
    void execute() {
        System.out.println("Please enter the size of the wall in millimeters:");
        try{
            int wallSize = scanner.nextInt();
            if(wallSize < 0){
                System.err.println("The size of the wall must be bigger then zero.");
                return;
            }
            System.out.println("Please enter the size of a pixel in millimeters (must be less then size of the wall:");
            int pixelSize = scanner.nextInt();
            if(pixelSize < 0){
                System.err.println("The size of the pixel must be bigger then zero.");
                return;
            }

            Kata4 kata = new Kata4();

            if(kata.IsDivisible(wallSize, pixelSize) == 1){
                System.out.println("Your pixel art is going to be perfect!");
            } if(kata.IsDivisible(wallSize, pixelSize) == 0){
                System.out.println("Oh no! You can`t fit an exact number of pixels on the wall!");
            } else{
                System.out.println("Oh no! The pixel size is bigger then the wall size!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Kata4 {
    public int IsDivisible(int wallLength, int pixelSize) {
        if(wallLength < pixelSize) {
            return -1;
        }
        if(wallLength%pixelSize == 0){
            return 1;
        } else {
            return 0;
        }
    }

}