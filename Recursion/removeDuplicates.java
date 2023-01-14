package Recursion;

public class removeDuplicates {
    public static boolean map[] = new boolean [26];
    public static void removeElement(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currElement = str.charAt(idx);
        if (map[currElement - 'a'] == true){
            removeElement(str,idx+1,newString);
        } else {
            newString += currElement;
            map[currElement - 'a'] = true;
            removeElement(str,idx+1,newString);
        }
    }

    public static void main(String[] args) {
        String str = "satyamsupriya";
        removeElement(str,0,"");
        System.out.println('c' - 'a');
    }
}
