package Recursion;

public class reverseDigit {
    static int sum = 0;
    static void reverse(int n){
        if (n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }

//    2nd way
//    static int reverse1(int n){
//        int digit = (int) (Math.log10(n)) +1;
//        return helper(n,digit);
//    }
//
//    private static int helper(int n, int digit) {
//        if (n%10 == n){
//            return n;
//        }
//        int rem = n%10;
//        return rem * (int) (Math.pow(10,digit-1)) +helper(n/10,digit-1);
//    }

    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }
}
