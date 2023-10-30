package GreedyAlgorithm;

public class JumpGameII {

    public static void main(String[] args) {
        int nums [] = {2,3,1,1,4};
        int n = nums.length;
        int maxSteps = 0;
        int cur = 0;
        int jumps = 0;
        for (int i=0;i<n-1;i++) {
            maxSteps = Math.max(maxSteps, i + nums[i]);
            if (cur == i) {
                cur = maxSteps;
                jumps++;
            }
        }
        System.out.println(jumps);
    }
}
