package Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for( int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums [] = {1,3,4,5,8};
        int target = 7;
//        int ans [] = new int[2];
//        for (int i = 0; i<arr.length; i++){
//            for (int j = i+1; j<arr.length; j++){
//                if (arr[i] + arr[j] == target){
//                    ans[0] = arr[i];
//                    ans[1] = arr[j];
//                }
//            }
//        }
//
//        for (int i = 0; i<ans.length; i++){
//            System.out.println(ans[i]);
//        }

        twoSum(nums, target);
    }
}


