package BasicsRevision;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;

//        while (num > 0){
//            int lastDigit = num%10;
//            rev = lastDigit+ rev*10;
//            num = num/10;
//        }
//        System.out.println("Reverse num is " + rev);


       while (num > 0){
           int lastDigit = num%10;
           num = num/10;
           System.out.print(lastDigit);
       }

    }
}
