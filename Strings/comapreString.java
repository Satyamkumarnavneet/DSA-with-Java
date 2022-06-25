package Strings;

import java.util.Scanner;

public class comapreString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String sentance = "My name is Satyam kumar navneet";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.concat(s2));
        String subString = sentance.substring(10,sentance.length());
        System.out.println(subString);

        System.out.println();


        if (s1.compareTo(s2) == 0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }

    }
}
