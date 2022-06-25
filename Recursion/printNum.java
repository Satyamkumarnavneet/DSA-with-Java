package Recursion;

public class printNum {
    public static void print1to5(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        print1to5(n+1);
    }


    public static void main(String[] args) {
        int n = 1;
        print1to5(n);
    }
}
