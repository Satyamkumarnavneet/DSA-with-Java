//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//        1 : + (Addition) a + b
//        2 : - (Subtraction) a - b
//        3 : * (Multiplication) a * b
//        4 : / (Division) a / b
//        5 : % (Modulo or remainder) a % b
//        Calculate the result according to the operation given and display it to the user.

package Lecture_3;

import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();
        System.out.print("Enter operation: ");
        char op = sc.next().charAt(0);
        int c = 0;
        switch (op){
            case '+' :
                c = a+b;
                System.out.println("Sum of the number is " + c+".");
                break;
            case '-' :
                c = a-b;
                System.out.println("Sub of the number is " + c+".");
                break;
            case '*' :
                c = a*b;
                System.out.println("Mul of the number is "+c+".");
                break;
            case '/' :
                c = a/b;
                System.out.println("Div of the number is "+ c +".");
                break;
            case '%' :
                c = (a%b);
                System.out.println("Mod (remainder) of the num is "+ c +".");
                break;
            default:
                System.out.println("Error!! you have done something wrong");



        }


    }
}
