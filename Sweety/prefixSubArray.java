package Sweety;

public class prefixSubArray {
    public static int maximumSumSubarray(int arr[], int n) {
        int minPrefixSum = 0; // Initialize minimum, prefix sum to 0.
        int res = Integer.MIN_VALUE; // Initialize maximum subarray, sum so far to -infinity.
        int prefixSum[] = new int[n]; // Initialize and compute, the prefix sum array.
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        for (int i = 0; i < n; i++) { // loop through the array, keep track of minimum prefix sum so far and maximum subarray sum.
            res = Math.max(res, prefixSum[i] - minPrefixSum);
            minPrefixSum = Math.min(minPrefixSum, prefixSum[i]);
        }
        return res;
    }
    public static void main(String args[]){
        int arr []={1,-2,6,-1,3};
        int n = arr.length;
        int res = maximumSumSubarray(arr,n);
        System.out.println(res);
    }
}
