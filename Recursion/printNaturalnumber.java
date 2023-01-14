package Recursion;

public class printNaturalnumber {
    public static void printnumb(int n){
        if (n == 100){
            System.out.println(100);
            return;
        }
        System.out.println(n);
        printnumb(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        printnumb(n);

    }
}
