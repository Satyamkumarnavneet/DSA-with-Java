//Write an infinite loop using do while condition.

package ProblemSet1;

import java.util.Scanner;

public class question6 {
    public static void printLoop(int n){
        do {
            System.out.println("Loop is running");

        } while (n>5);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLoop(n);

    }
}
