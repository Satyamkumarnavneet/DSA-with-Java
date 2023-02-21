package Arrays;

public class MaxSubArraySum { // Using Kadane's algorithm
    public static void main(String[] args) {
//        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
//        int n = arr.length;
//        int sum = 0;
//        int maxSum = arr[0];
//        for (int  i=0; i<n; i++){
//            sum += arr[i];
//            if (sum > maxSum){
//                maxSum = sum;
//            } else if (sum < 0){
//                sum = 0;
//            }
//        }
//        System.out.println(maxSum);

        int arr[] = {-9,-3,-5,-5,2,-7};
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean allNegative = true;
        for (int i = 0; i<n; i++){
            if (arr[i] > 0){
                allNegative = false;
                break;
            }
            maxSum = Math.max(arr[i],maxSum);
        }
        if (allNegative){
            System.out.println(maxSum);
            return;
        }

        for (int i =0; i<n; i++){
            sum += arr[i];
            if (sum > 0){
                maxSum = sum;
            } else if (sum < 0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
