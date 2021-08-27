package java_core;

public class Task15 {

    public static void main(String[] args) {
        Canvas board = new Canvas(5, 4);
        board.drawCanvas();
        System.out.println("=================");
        board.draw(1,3,4,1);
        board.drawCanvas();

    }
}



      class Canvas {

          int width,height;
          char[][] canvas;


          public Canvas(int width, int height) {
              this.width = width;
              this.height = height;

              int canvasWidth, canvasHeight;
              canvasWidth = width +2;
              canvasHeight = height +2;

              canvas = new char[canvasHeight][canvasWidth];

              for(int i = 0; i < canvasHeight; ++i){
                  for(int j = 0; j < canvasWidth;++j){
                      if((i  == 0) || (i == canvasHeight-1))
                      {
                          canvas[i][j] = '-';
                      }else if ((j  == 0) || (j == canvasWidth-1)){
                          canvas[i][j] = '|';
                      }
                  }
              }
          }

          // передаватимуться на +1 більші значення
          public void draw(int xPointOne,int yPointOne, int xPointTwo, int yPointTwo) {

              if (xPointOne == xPointTwo ){

                  if (yPointOne > yPointTwo){
                      int t = yPointOne;
                      yPointOne = yPointTwo;
                      yPointTwo = t;
                  }

                  for(int i = yPointOne; i <= (Math.abs(yPointOne-yPointTwo)+1); ++i){
                      canvas[i][xPointOne] = 'x';
                  }

              }else if (yPointOne == yPointTwo) {
                  if (xPointOne > xPointTwo){
                      int t = xPointOne;
                      xPointOne = xPointTwo;
                      xPointTwo = t;
                  }
                  for (int i = xPointOne; i < (Math.abs(xPointOne-xPointTwo)+1);++i){
                      canvas[yPointOne][i] = 'x';
                  }
              }else {
                   if (xPointOne > xPointTwo && yPointOne > yPointTwo){
                      int tx = xPointOne;
                      int ty = yPointOne;
                      xPointOne = xPointTwo;
                      yPointOne = yPointTwo;
                      xPointTwo = tx;
                      yPointTwo = ty;
                  }else if (xPointOne < xPointTwo && yPointOne > yPointTwo){
                       int ty = yPointOne;
                       yPointOne = yPointTwo;
                       yPointTwo = ty;
                   }
                   for (int i = yPointOne; i<=yPointTwo; ++i){
                   for (int j = xPointOne; j <= xPointTwo; ++j){
                      canvas[i][j] = 'x';
                   }
                   }
              }


              // return this;
          }

          public void fill(int x, int y, char ch) {
            if (canvas[x][y]!='x')return;

          }

          public void drawCanvas() {
              for(int i = 0; i < height+2; ++i){
                  for(int j = 0; j < width+2;++j){
                      System.out.print(canvas[i][j]);
                  }
                  System.out.println();
              }
              // return "draw the canvas with borders";
          }
      }

