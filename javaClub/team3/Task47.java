package javaClub.team3;
//https://www.codewars.com/kata/basic-subclasses-adam-and-eve

/* @Test
 * unable to test
 */
public class Task47 extends Task{
    @Override
    void execute() {
        System.out.println("Nothing to output");
    }

    public static class God {
        public static Human[] create(){
            return new Human[]{new Man(), new Woman()};
        }
    }

    public static class Human {
    }

    public static class Man extends Human {
    }

    public static class Woman extends Human {
    }
}