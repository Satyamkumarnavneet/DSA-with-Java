//Enter 3 numbers from the user & make a function to print their average.
package ProblemSet1;

import java.util.Scanner;

public class Question1 {

    public static void averageOfNum (int a, int b, int c){
       int avg = a+b+c/3;
        System.out.println(avg);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        averageOfNum(a,b,c);


    }

}
