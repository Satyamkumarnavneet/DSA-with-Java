package BasicsRevision;

import java.util.Scanner;

public class LargestIn3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 3
        int b = sc.nextInt(); // 5
        int c = sc.nextInt(); // 7

        if (a > b && a > c){
            System.out.println("A is bigger");
        } else if (b > a && b > c){
            System.out.println("B is bigger");
        } else if (c > a && c > b){
            System.out.println("C is bigger");
        } else {
            System.out.println("Invalid");
        }

    }
}
