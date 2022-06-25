//Write a function which takes in 2 numbers and returns the greater of those two.

package ProblemSet1;
import java.util.Scanner;

public class question3 {

    public static void grater(int a, int b){
        if (a>b){
            System.out.println("a is grater "+a);
        } else {
            System.out.println("b is grater "+b);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        grater(a,b);


    }

}
