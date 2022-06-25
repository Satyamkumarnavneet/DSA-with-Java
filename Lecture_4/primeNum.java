package Lecture_4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            int count = 0;
            for (int j = 1; j<=i; j++){
                if (i%j == 0){
                    count++;
                }

            }
            if (count<=2){
                System.out.println(i);
            }

        }

    }
}
