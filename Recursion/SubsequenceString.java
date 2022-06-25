package Recursion;

import com.sun.jdi.request.StepRequest;

public class SubsequenceString {
    public static void subSequences(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currElement = str.charAt(idx);
        // to be
        subSequences(str,idx+1, newString+currElement);
        // or not to be
        subSequences(str,idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str,0,"");

    }
}
