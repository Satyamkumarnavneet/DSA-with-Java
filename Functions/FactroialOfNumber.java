package Function;

import java.util.Scanner;
public class FactroialOfNumber {

    public static void printfactroial(int n){
        if (n<0){
            System.out.println("Invalid");
            return;
        }
        int factorail = 1;
               for (int i = n; i>=1; i--){
                   factorail = factorail*i;
        }
        System.out.println(factorail);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfactroial(n);


    }
}
