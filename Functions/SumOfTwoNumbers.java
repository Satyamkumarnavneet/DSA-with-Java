package Function;

import java.util.Scanner;

class SumOfNumbers {

    public static void sumOfNumbers(int Sum){
        System.out.println(Sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int Sum = a+b;
        sumOfNumbers(Sum);


    }
}
