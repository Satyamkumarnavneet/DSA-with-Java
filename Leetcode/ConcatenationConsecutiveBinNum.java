package Leetcode;

public class ConcatenationConsecutiveBinNum {
    public static int concatenatedBinary(int n) {
        long res = 0;
        int mod = 1_000_000_007;
        for(int i = 1; i<=n; i++){
            String binaryString = Integer.toBinaryString(i);
            res = (res << binaryString.length()) % mod;
            res = (res + i) % mod;
        }
        return (int)res;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(concatenatedBinary(n));
    }
}
