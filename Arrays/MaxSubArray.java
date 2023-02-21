package Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,10};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i<n-1; i++){
            int currSum = 0;
            for (int j = i; j<=n-1; j++){
                currSum += arr[j];
                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maxSum is " +maxSum+'.');
    }
}
