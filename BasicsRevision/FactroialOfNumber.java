package BasicsRevision;

import java.util.Scanner;

public class FactroialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

//        for (int i = 1; i<=n; i++){
//            fact = i*fact;
//        }

        for (int i = n; i>=1; i--){
            fact = i*fact;
        }
        System.out.println(fact);
    }
}
