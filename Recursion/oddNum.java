package Recursion;

public class oddNum {
    public static void printOddNum(int s, int l){
        if (s>=l) {
            return;
        }
        if (s%2 == 1){
            printOddNum(s+2, l);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        printOddNum(1,10);

    }
}

