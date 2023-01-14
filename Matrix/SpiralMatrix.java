package Matrix;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <=endRow && startCol<=endCol){
            // Top
            for(int i = startCol; i<=endCol; i++){
                System.out.print(matrix[startRow][i] + " ");
            }
            // Right
            for (int j = startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol] + " ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // Left
            for (int j = endRow-1; j>=startCol+1; j--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(matrix[j][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][]={
                {2,-1,2},
                {3,2,1},
                {-1,1,7},
                {3,-1,17},
                {0,1,-4}};
        printSpiral(matrix);

    }
}
