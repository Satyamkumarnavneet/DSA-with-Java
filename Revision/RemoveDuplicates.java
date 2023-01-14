package Revision;

public class RemoveDuplicates {
    public static boolean map [] = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curElement = str.charAt(idx);
        if (map[curElement - 'a'] == true){
            removeDuplicates(str,idx+1,newString);
        } else {
            newString += curElement;
            map[curElement - 'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        String str = "Sweety";
        removeDuplicates(str,0,"");
        System.out.println('c' - 'a');


    }
}
