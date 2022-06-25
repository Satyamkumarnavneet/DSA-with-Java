package Strings;

import java.util.Scanner;

public class combinedLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totLength = 0;
        String array [] = new String[size];
        for (int i = 0; i<size; i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);


    }
}
