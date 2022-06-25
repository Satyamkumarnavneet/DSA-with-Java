package Lecture_4;
import java.util.Scanner;
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
                for (int i = 1; i<=n; i++) {
                int count = 0;
                for (int j = 1; j<=i; j++) {
                    if (i % j == 0) {
                        count = count + 1;

                    }
                }
                if (count <= 2) {
                    System.out.println(i);
                }
            }
        }
    }
