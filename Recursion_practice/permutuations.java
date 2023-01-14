package Recursion_practice;

public class permutuations {
    public static void findPerm(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
        }
        for (int i = 0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            findPerm(newString, ans+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str,"");


    }
}
