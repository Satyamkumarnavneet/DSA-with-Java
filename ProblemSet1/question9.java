//Write a function that calculates the Greatest Common Divisor of 2 numbers.
package ProblemSet1;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b){
            if (a>b){
                a = a-b;
            } else{
                b = b-a;
            }
        }

        System.out.println("GCD OR HCF is: "+ b);

    }
}
