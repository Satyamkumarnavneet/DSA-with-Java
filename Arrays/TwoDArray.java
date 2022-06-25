package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //Input
        int number [][] = new int[rows][cols];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                number [i][j] = sc.nextInt();
            }
        }

        //Output
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }




    }
}
