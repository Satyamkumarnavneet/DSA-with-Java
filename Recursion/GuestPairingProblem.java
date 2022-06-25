package Recursion;

public class GuestPairingProblem {
    public static int callGuests(int n){
        if (n<=1){
            return 1;
        }

        // Single
        int firstWay = callGuests(n-1);

        // Pair
        int secondWay = (n-1) * callGuests(n-2);
        return firstWay+secondWay;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));

    }
}
