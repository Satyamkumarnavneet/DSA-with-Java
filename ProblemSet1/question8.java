//Two numbers are entered by the user, x and n. Write a function to find
//the value of one number raised to the power of another i.e. xn.

package ProblemSet1;
import java.util.Scanner;

public class question8 {
    public static void powerFunction(int x, int n){
        int powerOFn = x*n;
        System.out.println(powerOFn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int n = sc.nextInt();
        powerFunction(x,n);



    }

}
