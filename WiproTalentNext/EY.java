package WiproTalentNext;

import java.util.Scanner;

public class EY {
    public static int validQuadruples(int N, int A[]) {
        int count = 0;
        for (int i = 0; i < N - 3; i++) {
            int leftSum = A[i] + A[i + 1];
            int rightSum = A[i + 2] + A[i + 3];

            if (leftSum == rightSum) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // OUTPUT [uncomment & modify if required]
        System.out.println(validQuadruples(N, A));
        sc.close();
    }


}
