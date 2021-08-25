package javaClub.team3;

import java.io.IOException;

//          You are going to write a simple console-style drawing board program.
//
//        Functions
//        The drawing board is very simple so only these functions are supported.
//
//        Function	Description
//        Create canvas	Create new empty canvas (filled with ' ') with given width and height
//        Draw line / rectangle	Draw the line with 'x' which connects the given points.
//        If the points are diagonal, a rectangle instead of diagonal line should be drawn
//        Fill color	Fill the entire area connected to the given point with given character,
//        also known as "bucket fill" in paint programs

public class Task15 extends Task {
    static char[][] canvasStorage;
    static int canvasX;
    static int canvasY;

    public Task15() {
    }

    public Task15(int width, int height) {
        drawCanvas(width, height);
    }

    @Override
    void execute() {
        Task15 canvasInstance = new Task15();
        boolean canvasExists = false;
        String action = " ";
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        while (!action.equals("q") && !action.equals("Q")) {
            int width = 0;
            int height = 0;
            if (canvasExists == false) {
                try {
                    System.out.println("Please enter canvas width: ");
                    width = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter canvas height: ");
                    height = Integer.parseInt(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (width <= 0 || height <= 0) {
                    System.err.println("Wrong input!");
                    return;
                }
                canvasInstance = new Task15(width, height);
                canvasExists = true;
                continue;
            }
            if (canvasExists == true) {
                try {
                    int userChoice = 0;
                    System.out.println("Please make your choice.");
                    System.out.println("Press 1 to draw primitives.");
                    System.out.println("Press 2 to use bucket fill.");
                    System.out.println("Press 3 to reset canvas.");
                    System.out.println("Press 4 to check empty cells.");
                    userChoice = Integer.parseInt(bufferedReader.readLine());
                    switch (userChoice) {
                        case 1:
                            System.out.println("(Coordinates starts from 0)");
                            System.out.println("Please enter coordinates of a primitive to draw (x1): ");
                            x1 = Integer.parseInt(bufferedReader.readLine());
                            System.out.println("Please enter coordinates of a primitive to draw (y1): ");
                            y1 = Integer.parseInt(bufferedReader.readLine());
                            System.out.println("Please enter coordinates of a primitive to draw (x2): ");
                            x2 = Integer.parseInt(bufferedReader.readLine());
                            System.out.println("Please enter coordinates of a primitive to draw (y2): ");
                            y2 = Integer.parseInt(bufferedReader.readLine());
                            //Input validation:
                            if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0 ||
                                    x1 >= canvasX - 2 || y1 >= canvasY - 2 ||
                                    x2 >= canvasX - 2 || y2 >= canvasY - 2) {
                                System.err.println("Wrong input!");
                            } else if (x2 < x1 || y2 < y1) {
                                System.err.println("x2 should be greater than x1, " +
                                        "y2 should be greater than y1!");
                            } else {
                                canvasInstance.draw(x1, y1, x2, y2);
                            }
                            break;
                        case 2:
                            int bucketX = 0;
                            int bucketY = 0;
                            char bucketSymbol = ' ';
                            System.out.println("(Coordinates starts from 0)");
                            System.out.println("Please enter bucket fill X coordinate: ");
                            bucketX = Integer.parseInt(bufferedReader.readLine());
                            System.out.println("Please enter bucket fill Y coordinate: ");
                            bucketY = Integer.parseInt(bufferedReader.readLine());
                            System.out.println("Please enter a symbol with which you want to perform fill: ");
                            bucketSymbol = bufferedReader.readLine().charAt(0);
                            System.out.println(bucketSymbol);
                            //Input validation:
                            if (bucketX < 0 || bucketY < 0 || bucketX >= canvasX - 2 || bucketY >= canvasY - 2){
                                System.err.println("Wrong input!");
                            } else{
                                bucketFill(bucketX, bucketY, bucketSymbol);
                            }
                            break;
                        case 3:
                            reset();
                            break;
                        case 4:
                            System.out.println(checkForEmpty());
                            break;
                        default:
                            System.err.println("Wrong input!");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.err.println("Wrong input!");
                }
            }
            System.out.println("Press 'Q' to quit, press any key to repeat: ");
            try {
                action = bufferedReader.readLine();
                System.out.println(action);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //This method creates 2 dimensional [int] array which will contains
    //pre-defined X*Y canvas.
    public static void drawCanvas(int x, int y) {
        canvasX = x + 2;
        canvasY = y + 2;
        canvasStorage = new char[canvasX][canvasY];
        char currentCharacter = ' ';
        for (int i = 0; i < canvasY; i++) {
            for (int j = 0; j < canvasX; j++) {
                if (i == 0 || i == canvasY - 1) {
                    currentCharacter = '-';
                } else if (j == 0 || j == canvasX - 1) {
                    currentCharacter = '|';
                } else {
                    currentCharacter = ' ';
                }
                canvasStorage[j][i] = currentCharacter;
            }
        }
    }

    //This method just paints the canvas.
    //Should be executed after each operation.
    public static void repaint() {
        for (int i = 0; i < canvasY; i++) {
            for (int j = 0; j < canvasX; j++) {
                System.out.print(canvasStorage[j][i]);
            }
            System.out.println();
        }
    }

    //Method to draw points
    public static void drawPoint(int x, int y) {
        canvasStorage[x + 1][y + 1] = 'o';
        repaint();
    }

    //Method to draw lines/rectangles on canvas.
    //If the points are diagonal, a rectangle instead of diagonal line should be drawn
    public Task15 draw(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            //Vertical line;
            for (int i = 0; i <= y2 - y1; i++) {
                canvasStorage[x1 + 1][i + 1] = 'x';
            }
        } else if (y1 == y2) {
            //Horizontal line;
            for (int i = 0; i <= x2 - x1; i++) {
                canvasStorage[i + 1][y1 + 1] = 'x';
            }
        } else {
            //draw rectangle (don't forget about +1)
            int rectX1 = x1 + 1;
            int rectY1 = y1 + 1;
            int rectX2 = x2 + 1;
            int rectY2 = y2 + 1;
            for (int i = rectY1; i <= rectY2; i++) {
                for (int j = rectX1; j <= rectX2; j++) {
                    if (i == rectY1 || i == rectY2) {
                        canvasStorage[j][i] = 'x';
                    } else if (j == rectX1 || j == rectX2) {
                        canvasStorage[j][i] = 'x';
                    } else {
                        canvasStorage[j][i] = 'o';
                    }
                }
            }
        }
        repaint();
        return this;
    }

    int counter = 0;

    //Fill the entire area connected to the given point with given character,
    //also known as "bucket fill" in paint programs
    public void bucketFill(int x, int y, char c) {
        counter++;
        if (x < 0 || y < 0 || x >= canvasX - 2 || y >= canvasY - 2) {
            return;
        }
        if (canvasStorage[x + 1][y + 1] == c) {
            return;
        }
        if (canvasStorage[x + 1][y + 1] != ' ') {
            return;
        }
        canvasStorage[x + 1][y + 1] = c;
        bucketFill(x - 1, y, c);
        bucketFill(x, y + 1, c);
        bucketFill(x + 1, y, c);
        bucketFill(x, y - 1, c);
        repaint();
        System.out.println(counter);

    }

    //Makes canvas empty
    public void reset() {
        for (int i = 1; i < canvasY - 1; i++) {
            for (int j = 1; j < canvasX - 1; j++) {
                canvasStorage[j][i] = ' ';
            }
        }
        repaint();
    }

    //Checks if there are an empty cells left.
    public boolean checkForEmpty() {
        boolean containsEmpty;
        for (int i = 1; i < canvasY - 1; i++) {
            for (int j = 1; j < canvasX - 1; j++) {
                if (canvasStorage[j][i] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }
}
