package Lecture_4;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if (marks>=90){
                System.out.println("This is good");
            } else if (marks>=60){
                System.out.println("This is also good");
            } else if (marks>= 0 && marks<=59){
                System.out.println("This is good ass well");
            } else {
                System.out.println("Invalid");
            }
            System.out.print("Wanaa contine... (press 1 for yes and 0 for no): ");
            n = sc.nextInt();

        } while (n==1);
        if (n !=0 && n !=1){
            System.out.println("Invalid...press 0 or 1 ");
        }
    }
}
