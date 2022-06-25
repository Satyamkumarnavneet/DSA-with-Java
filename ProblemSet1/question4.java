//Write a function that takes in the radius as input and returns the circumference of a circle.
package ProblemSet1;

import java.util.Scanner;

public class question4 {
    public static void printcircumfrence(int r){
        float cirumfrence = (float) (2*3.14*r);
        System.out.println(cirumfrence);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        printcircumfrence(r);

    }
}
