package Recursion;

import java.util.Scanner;

public class LengthOfString {
    public static int calcuStringLength(String str){
        if (str.length() == 0){
            return 0;
        } else {
            return calcuStringLength(str.substring(1))+1;
        }
    }
    public static void main(String[] args) {
        String str = "Hii Can we meet?";
        System.out.println(calcuStringLength(str));
        System.out.println(str.substring(0));
        Scanner sc = new Scanner(System.in);

    }
}
