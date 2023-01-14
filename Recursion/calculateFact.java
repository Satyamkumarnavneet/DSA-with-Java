package Recursion;

public class calculateFact {
    public static int printCalcFac(int n){
        if(n ==0 || n==1){
            return 1;
        }
        int calcu_nm1 = printCalcFac(n-1);
        int facN = n*calcu_nm1;
        return facN;

    }

    public static void main(String[] args) {
        int n = 5;
        int ans = printCalcFac(n);
        System.out.println(ans);
    }
}
