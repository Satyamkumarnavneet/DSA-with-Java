package Sweety;

public class CalculatePower {
    public static int printPow(int x, int n){
        if(x == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }

        if (n%2 == 0){
            return printPow(x,n/2) * printPow(x, n/2);
        } else {
            return printPow(x,n/2) * printPow(x,n/2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(printPow(x,n));
    }
}
