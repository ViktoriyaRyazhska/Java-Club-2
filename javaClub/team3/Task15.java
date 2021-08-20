package javaClub.team3;


import java.io.IOException;

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
                }
                canvasInstance = new Task15(width, height);
                canvasExists = true;
                continue;
            }
            if (canvasExists == true) {
                try {
                    System.out.println("Please enter coordinates of a primitive to draw (x1): ");
                    x1 = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter coordinates of a primitive to draw (y1): ");
                    y1 = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter coordinates of a primitive to draw (x2): ");
                    x2 = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter coordinates of a primitive to draw (y2): ");
                    y2 = Integer.parseInt(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                canvasInstance.draw(x1, y1, x2, y2);
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
                System.out.print(currentCharacter);
            }
            System.out.println();
        }
    }

    public static void repaint() {
        for (int i = 0; i < canvasY; i++) {
            for (int j = 0; j < canvasX; j++) {
                System.out.print(canvasStorage[j][i]);
            }
            System.out.println();
        }
    }

    public static void drawPoint(int x, int y) {
        canvasStorage[x + 1][y + 1] = 'x';
        repaint();
    }

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
            canvasStorage[rectX1][rectY1] = 'O';
            canvasStorage[rectX2][rectY2] = 'O';
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
}
