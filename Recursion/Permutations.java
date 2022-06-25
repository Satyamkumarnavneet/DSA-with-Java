package Recursion;

public class Permutations {
    public static void printPermut(String str, String permut){
        if (str.length() == 0){
            System.out.println(permut);
            return;
        }

        for (int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);

            String newString = str.substring(0,i) + str.substring(i+1);
            printPermut(newString,permut+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermut(str,"");

    }
}
