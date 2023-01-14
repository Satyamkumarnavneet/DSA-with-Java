package Recursion;

public class FriendsPairingProblem {
    public static int findWays(int n){
        if (n == 1 || n == 2){
            return n;
        }
        int fnm1 = findWays(n-1);
        int fnm2 = findWays(n-2);
        int pairWays = (n-1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
        //return findWays(n-1) * findWays(n-2) + findWays(n-1);
    }
    public static void main(String[] args) {
        System.out.println(findWays(3));
    }
}
