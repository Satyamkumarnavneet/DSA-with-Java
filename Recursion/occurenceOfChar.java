package Recursion;

public class occurenceOfChar {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurence(String str, int idx, char element){
        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        // Time complexity = 0(n) where n = string length

        char currElement = str.charAt(idx);
        if (currElement == element){
            if (first == -1){
                first = idx;
            } else {
                last =idx;
            }
        }
        printOccurence(str,idx+1,element);

    }

    public static void main (String[]args){
        String str = "SatyamSupriya";
        printOccurence(str,0,'S');

    }
}
