package Leetcode;

public class sqrtX {
    public static int mySqrt(int x) {
        if(x ==0){
            return x;
        }
        int start = 1;
        int end  = x;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid == x/mid){
                return mid;
            } else if(mid < x/mid){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int x = 25;
        System.out.println(mySqrt(x));
    }
}
