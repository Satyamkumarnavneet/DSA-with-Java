package BasicsRevision;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int temp = num;
//        int sum = 0;
//        int digits = (int) (Math.log10(num) + 1);
//        while (temp > 0) {
//            int digit = temp % 10;
//            sum += Math.pow(digit, digits);
//            temp = temp/10;
//        }
//        if (sum == num){
//            System.out.println("Number is a armstrong number");
//        } else {
//            System.out.println("Not a armstrong number");
//        }
        int n = sc.nextInt();
        int x = n;
        int r = 0;
        int dig = 0;
        int sum = 0;

        // Count the number of digits in the input number
        while (x > 0) {
            r = x % 10;
            x = x / 10;
            dig++;
        }

        // Reset the value of x to the input number
        x = n;

        // Calculate the sum of the cubes of the digits
        while (x > 0) {
            r = x % 10;
            sum += Math.pow(r, dig);
            x = x / 10;
        }

        // Check if the sum is equal to the input number
        if (sum == n) {
            System.out.print(n + " is an Armstrong number");
        } else {
            System.out.print(n + " is not an Armstrong number");
        }
    }
}
