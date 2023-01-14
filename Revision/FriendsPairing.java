package Revision;

public class FriendsPairing {
    public static int calcuToatalWays(int n){
        if (n == 1 || n == 2){
            return n;
        }
        int fnm1 = calcuToatalWays(n-1);
        int fnm2 = calcuToatalWays(n-2);
        int pairWays = calcuToatalWays(n-1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(calcuToatalWays(3));
    }
}
