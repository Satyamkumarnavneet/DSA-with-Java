package Arrays;
public class TrappingRainWater {
    public static void main(String[] args) {
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int leftMax [] = new int[height.length];
        int trappedWater = 0;

        leftMax[0] = height[0];
        for (int i = 1; i<height.length; i++){ // Calculate leftMax
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int rightMax [] = new int [height.length];
        rightMax[height.length-1] = height[height.length-1];

        for (int i =height.length-2; i>=0; i--){ // Calculate rightMax
            rightMax [i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i = 0; i<height.length; i++){
            int waterLev = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLev - height[i];
        }
        System.out.println(trappedWater);
    }
}
