package Recursion;

import java.util.HashSet;

public class UniqueSubsequences {
    public static void uniqueSubseq(String str, int idx, String newString, HashSet<String> set){
        if (idx == str.length()){
            if (set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

       char currElement = str.charAt(idx);
        // to be
        uniqueSubseq(str,idx+1,newString+currElement,set);

        // not to be
        uniqueSubseq(str,idx+1,newString,set);




    }

    public static void main(String[] args) {
        String str = "aba";
        HashSet<String> set = new HashSet<>();
        uniqueSubseq(str,0,"",set);



    }
}
