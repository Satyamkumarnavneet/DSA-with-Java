//Write a function to print the sum of all odd numbers from 1 to n.

package ProblemSet1;
import java.util.Scanner;
public class question2 {
    public static void sumOfodd(int n ){
        int sum =0;
        for (int i = 1; i<=n; i++){
            if ((i%2)==1){
                sum +=i;
            }

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sumOfodd(n);
    }
}
