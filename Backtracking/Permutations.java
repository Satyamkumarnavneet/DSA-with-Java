package Backtracking;

public class Permutations {
    public static void printPermut(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPermut(newString,ans+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermut(str,"");

    }
}
