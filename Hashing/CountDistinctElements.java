package Hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int nums[] = {2, 1, 4, 1, 4, 1, 4, 1};

        // Brute force
//        int res[] = new int[nums.length];
//        int count = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            boolean found = false;
//            for (int j = 0; j < count; j++) {
//                if (nums[i] == res[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                res[count] = nums[i];
//                count++;
//            }
//        }
//        System.out.println(count);

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println("Unique num: " + set.size());


    }
}
