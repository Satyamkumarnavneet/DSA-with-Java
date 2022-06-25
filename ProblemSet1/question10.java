//Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 21 .....
//        In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//        (BONUS)

package ProblemSet1;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" ");

        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }

            System.out.println();
        }

    }
}
