//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
package ProblemSet1;
import java.util.Scanner;
public class question5 {
    public static void printEligibleOrNot(int age){
        if (age >= 18){
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        printEligibleOrNot(age);


    }
}
