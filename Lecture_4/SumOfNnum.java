// Sum of n natural number
package Lecture_4;

import java.util.Scanner;
public class SumOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("The sum is " +sum);
    }

}
