package Recursion;

public class evenNum {

    public static void printEvenNum(int s, int l){
        if (l<s){ //Base case
            return;
        }
        if (l%2 == 0){
            printEvenNum(s, l-2);
        }
        System.out.println(l);
    }

    public static void main(String[] args) {
        printEvenNum(1, 20);
        System.out.println();

    }
}
