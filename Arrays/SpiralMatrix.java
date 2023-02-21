package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        //int matrix [][] = {{2,3,4,5},{7,8,9,10},{11,12,13,14},{15,16,17,18}};
        int matrix [][] = {{1,2,4,5},{6,7,8}};
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && startColumn <= endCol){

            for (int j = startColumn; j<=endCol; j++){ // Top
                System.out.print(matrix[startRow][j] + " ");
            }
            for (int i = startRow+1; i<=endRow; i++){ // Right
                System.out.print(matrix[i][endCol] + " ");
            }

            for (int j = endCol-1; j>=startColumn; j--){ // Buttom
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endCol][j] + " ");
            }

            for (int i = endRow-1; i>=startRow+1; i--){
                if (startColumn == endCol){
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }
}
