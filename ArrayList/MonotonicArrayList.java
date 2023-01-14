package ArrayList;
import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean increasing(ArrayList<Integer> nums){
        for (int i = 0; i<nums.size()-1; i++){
            if (nums.get(i) > nums.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean decreasing(ArrayList<Integer> nums){
        for (int i = 0; i<nums.size()-1; i++){
            if (nums.get(i) < nums.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotonic(ArrayList<Integer> nums){
        return increasing(nums) || decreasing(nums);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        System.out.println(isMonotonic(nums));
    }



//    public static boolean incrasing(int nums[]){
//        for (int i = 0; i <nums.length-1; i++){
//            if (nums[i] > nums[i+1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean decreasing(int nums[]){
//        for(int i = 0; i<nums.length-1; i++){
//            if (nums[i] < nums[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isMonotonic(int nums[]){
//        return incrasing(nums) || decreasing(nums);
//    }
//    public static void main(String[] args) {
//        int nums [] = {1,2,2,3};
//        System.out.println(isMonotonic(nums));
//    }
}
