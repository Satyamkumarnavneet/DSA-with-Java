package BinarySearch;

public class FIndIndex {
    public static int findindex(int nums[], int target){
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = left+(right-left)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums [] = {3,4,6,9,10};
        System.out.print("Element found at index: ");
        System.out.println(findindex(nums,6));
    }
}
