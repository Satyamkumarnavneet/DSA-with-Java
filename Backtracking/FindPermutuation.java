package Backtracking;

public class FindPermutuation {
    public static void printPermutuation(String str, String perm, int idx){
        if (str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutuation(newStr,perm+currChar,idx);
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutuation(str,"",0);

    }
}
