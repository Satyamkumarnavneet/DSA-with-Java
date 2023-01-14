package Revision;

public class FactorialOfNumber {
    public static int calcuFact(int n){
        if (n == 0 || n==1){
            return 1;
        }

        int facNM1 = calcuFact(n-1);
        int facN = n*facNM1;
        return facN;
    }

    public static void main(String[] args) {
        System.out.println(calcuFact(5));

    }
}
