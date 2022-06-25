package Strings;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String result = "";
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += string.charAt(i);
            }
        }
        System.out.println(result);
    }
}
