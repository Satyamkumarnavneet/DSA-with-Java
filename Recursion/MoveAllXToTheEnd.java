package Recursion;

public class MoveAllXToTheEnd {
    public static void moveToEnd(String str, int idx, int count, String newString){
        if (idx == str.length()){
            for (int i =0; i<count; i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        // Time complexity = 0( n + count(n) ) = 0(2n) = 0(n)
        char currElement = str.charAt(idx);
        if (currElement == 'x'){
            count++;
            moveToEnd(str,idx+1,count,newString);
        } else {
            newString += currElement;
            moveToEnd(str,idx+1,count,newString);
        }
    }

    public static void main(String [] args){
        String str = "axxbcxxd";
        moveToEnd(str,0,0,"");

    }
}
