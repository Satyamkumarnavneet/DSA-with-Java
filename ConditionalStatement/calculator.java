package ConditionalStatement;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter operation: ");
        char oper = sc.next().charAt(0);

        switch (oper){
            case '+':
                int sum = a+b;
                System.out.println("The Sum is: " + sum);
                break;
            case '-':
                int sub = a-b;
                System.out.println("The Sub is: " + sub);
                break;
            case '*':
                int mul = a*b;
                System.out.println("The Mul is: " + mul);
                break;
            case '/':
                int div = a/b;
                System.out.println("The div is: " + div);
                break;
            default:
                System.out.println("Invalid operator!!");
                break;

        }

    }
}
