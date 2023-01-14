package ArrayList;

import java.util.ArrayList;

public class ContainerWIthMostWater {
    // BruteForce approach
//    public static int maxArea(ArrayList<Integer> height) {
//        int n = height.size();
//        int maxWater = 0;
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                int high = Math.min(height.get(i),height.get(j));
//                int width = j-i;
//                int currWater = high*width;
//                maxWater = Math.max(currWater,maxWater);
//            }
//        }
//        return maxWater;
//    }

     // Optimized solution
    public static int calMaxContainer(ArrayList<Integer> height){
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.size()-1;
        while (leftPointer < rightPointer) {
            int high = Math.min(height.get(leftPointer), height.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currWater = high * width;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //[1,8,6,2,5,4,8,3,7]
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(calMaxContainer(height));
        //System.out.println(maxArea(height));

    }
}
