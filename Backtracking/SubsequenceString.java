package Backtracking;

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
//public static void findSubsets(String str,String ans,int i){
//    if(i==str.length()){
//        if(ans.length()==0){
//            System.out.println("null");
//        }
//        else{
//            System.out.println(ans);
//        }
//        return;
//    }
//    findSubsets(str, ans+str.charAt(i), i+1);
//    findSubsets(str, ans, i+1);
//}
//    public static void main(String args[]){
//        String str="abc";
//        findSubsets(str,"",0);
//    }
}
