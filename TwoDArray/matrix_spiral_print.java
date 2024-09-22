package TwoDArray;

public class matrix_spiral_print{

    public static void spiralPrint(int matrix [][]){
      int startRow = 0;
      int startCol = 0;
      int endRow =   matrix.length-1;
      int endCol = matrix[0].length-1;

      while(startRow <= endRow && startCol <= endCol ){

        //printing top part
        for(int i = startCol; i <= endCol;i++){
            System.out.print(matrix[startRow][i]+" ");
        }

        // printint right side part
        for(int i =startRow+1; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+" ");
        }

        // printing bottom part
        // no need to put any stop conditoin because  for loop condition will not overlap 
        for(int i = endCol-1; i >= startCol; i--){
           
            System.out.print(matrix[endCol][i]+" ");
        }

        // printing left side part
        for(int i = endRow-1; i>= startRow+1; i--){
            
            System.out.print(matrix[i][startCol]+" ");
        }

        startRow++;
        startCol++;
        endRow--;
        endCol--;

        System.out.println();
      }

    }
    

    public static void main(String args[]){

        int[][] matrix = {
            { 1,  2,  3,  4,  5,  6},
            {20, 21, 22, 23, 24,  7},
            {19, 32, 33, 34, 25,  8},
            {18, 31, 36, 35, 26,  9},
            {17, 30, 29, 28, 27, 10},
            {16, 15, 14, 13, 12, 11}
        };
          
        
        spiralPrint(matrix);
    }
    
}
