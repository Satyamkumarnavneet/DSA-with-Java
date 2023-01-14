package Recursion;

public class print5to1 {
    public static void print_5to1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print_5to1(n-1);

    }
    public static void main(String[] args) {
        print_5to1(5);
    }
}
