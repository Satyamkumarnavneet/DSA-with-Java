package Sweety;

public class prefixSumII {
    public static int maxSubArray(int[] nums) {
        int min = 0;
        int runningSum = 0;
        int max = nums[0];
        for (int num: nums) {
            runningSum += num;
            max = Math.max(max, runningSum - min);
            min = Math.min(runningSum, min);
        }
        return max;
    }






//    public static void Printsubarraysum(int numbers[]){
//        int currSum=0;
//        int maxSum=Integer.MIN_VALUE;
//        int prefix[]=new int[numbers.length];
//        prefix[0]=numbers[0];
//        for(int i=1;i<prefix.length;i++){
//            prefix[i]=prefix[i-1]+numbers[i];
//        }
//        for(int i=0;i<numbers.length;i++){
//            int start=i;
//            for(int j=i;j<numbers.length;j++){
//                int end=j;
//                currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
//                System.out.println(currSum);
//                if(maxSum<currSum){
//                    maxSum=currSum;
//                }
//
//            }
//
//        }
//        System.out.println("max sum: "+maxSum);
//    }


    public static void main(String args[]){
        int nums[]={1,-2,6,-1,3};
        System.out.println(maxSubArray(nums));

    }
}
