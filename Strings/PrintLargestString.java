package Strings;

public class PrintLargestString {
    public static void main(String[] args) {
        String name [] = {"Sweety", "Shweta", "Alisha"};
        String largest = name[0];
        for(int i =1; i<name.length; i++){
            if(largest.compareTo(name[i]) < 0){
                largest = name[i];
            }
        }
        System.out.println(largest);
    }

}
