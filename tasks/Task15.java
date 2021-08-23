package java_core;

public class Task15 {

    public static void main(String[] args) {
        System.out.println("=================\n first ");
        Canvas board = new Canvas(5, 5);
        board.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
        System.out.println(board.drawCanvas());

        System.out.println("=================\n second ");
        Canvas board2 = new Canvas(7,7);
        board2.draw(1, 1, 5, 4);
        System.out.println(board2.drawCanvas());

        System.out.println("=================\n third ");
        Canvas board3 = new Canvas(7,7);
        board3.draw(1, 1, 5, 4).fill(3, 3, 'o');
        System.out.println(board3.drawCanvas());
        // =============================



    }
}



      class Canvas {

         // private Canvas obj;

          int width,height;
          char[][] canvas;

          //private Canvas (){}

          public Canvas(int width, int height) {

              //obj = new Canvas(width,height);

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
                      else canvas[i][j] = ' '; // пізда
                  }
              }
          }

          // передаватимуться на +1 більші значення
          public Canvas draw(int xPointOne,int yPointOne, int xPointTwo, int yPointTwo) {

              ++xPointOne;
              ++yPointOne;
              ++xPointTwo;
              ++yPointTwo;

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
                  for (int i = xPointOne; i <= (Math.abs(xPointOne-xPointTwo)+1);++i){ //дописав =
                      canvas[yPointOne][i] = 'x';
                  }
              }else {
                  //малюємо прямокутник (незаповнений!!!)
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
                      if (i == yPointOne || i == yPointTwo || j == xPointOne || j == xPointTwo)canvas[i][j] = 'x';
                      else canvas[i][j] = ' ';
                   }
                   }

              }


               return this;
          }

          public Canvas fill(int x, int y, char ch) {

              ++x;
              ++y;

            //if (canvas[x][y] != ' ') return this;
            int minX=width+1,minY=height+1,maxX =0,maxY=0;
            for (int i = 1; i < height+1; ++i){ // не width +1
                for (int j = 1; j < width+1;++j){
                    if (canvas[i][j]=='x'){
                        if (i <= minY && j <= minX) { // подоставляв =
                            minY = i;
                            minX = j;
                        }else if (i >= maxY && j >= maxX){ // подоставляв =
                            maxY = i;
                            maxX = j;
                        }
                    }
                }
            }
             if (x < maxX && y < maxY && x > minX && y > minY){
                 for (int i = minY+1; i < maxY; ++i){
                     for (int j = minX+1; j < maxX;++j){
                         canvas[i][j] = ch;
                     }
                 }
             }



             return this;
          }

          public String drawCanvas() {
              /*for(int i = 0; i < height+2; ++i){
                  for(int j = 0; j < width+2;++j){
                      System.out.print(canvas[i][j]);
                  }
                  System.out.println();
              }*/

              int tempCanvasBorderHeight = height+2;

              //!!!!!!!!!!!!!!!!!!!!!
              StringBuilder canvasStr = new StringBuilder();
              int counter = 0;
              for (char[]subString: canvas){

                  ++counter;

                  canvasStr.append(subString);
                  //!!!!

                  // весь фор з \n окрім останнього циклу
                  if (counter != tempCanvasBorderHeight)
                  canvasStr.append('\n');
              }
                return canvasStr.toString();
             //!!!!!!!!!!!!!!!!!!!!!!
          }
      }

