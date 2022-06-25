package Strings;

import java.util.Scanner;

public class lectureProblem {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName+" "+ lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());
        for (int i = 0; i<=fullName.length(); i++){
            System.out.println(fullName.charAt(i));

        }

    }
}
