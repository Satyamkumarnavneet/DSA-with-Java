package Recursion;

public class reverseString {
    public static void printRev(String str, int idx){
        if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }

    // Time complexity = 0(n) Where n = string's length

    public static void main(String[]args){
        String str = "Supriya";
        printRev(str,str.length()-1);
    }
}
