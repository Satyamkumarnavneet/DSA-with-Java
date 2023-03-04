package Stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void maxArea(int height[]){
        int maxArea = 0;
        int nextSmallestLeft [] = new int[height.length];
        int nextSmallestRight [] = new int[height.length];

        Stack<Integer> s  = new Stack<>();

        // Next Smallest left - 0(n)
        /*
        The logic behind the else block is that if the top of the stack is less than the current element,
        then the top of the stack cannot be the next smallest element to the left of the current element.
        Instead, we need to look at the element at the top of the stack that was popped, which is guaranteed
        to be smaller than the current element. So, we set the nextSmallestLeft value for the current element to the
        index of the popped element.
         */
        for (int i = 0; i< height.length; i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nextSmallestLeft[i] = -1;
            } else {
                nextSmallestLeft[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smallest right - 0(n)
        s  = new Stack<>();
        for (int i = height.length-1; i>=0; i--){
            while (!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nextSmallestRight[i] = height.length;
            } else {
                nextSmallestRight[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area: Width = j-i-1 or nextSmallestRight[j] - nextSmallestLeft[i] -1;
        // 0(n)
        for (int i = 0; i<height.length; i++){
            int length = height[i];
            int width = nextSmallestRight[i] - nextSmallestLeft[i] - 1;
            int currArea = length * width;
            maxArea = Math.max(currArea,maxArea);
        }

        // O(n)+0(n)+0(n) = 0(3n) == 0(n)

        System.out.println("MaxArea in Histogram is: " + maxArea);


    }

    public static void main(String[] args) {
        int height [] = {2,1,5,6,2,3};
        maxArea(height);

    }
}
