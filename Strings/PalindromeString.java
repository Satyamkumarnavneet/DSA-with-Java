package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        StringBuffer sb = new StringBuffer(str); // Converting string object to string buffer
//        String newString = String.valueOf(sb);
//        sb.reverse();
//        if (str == newString){
//            System.out.println("Paindrome");
//        } else {
//            System.out.println("Not palindrome");
//        }

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str); // Converting string object to string builder
        sb.reverse();
        if (str.equals(sb.toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
