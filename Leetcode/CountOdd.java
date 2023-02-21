package Leetcode;

public class CountOdd {
    public static int countOdds(int low, int high) {
        int count=0;
        for(int i = low; i<=high; i+=2){
            if (i%2 != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int ans=countOdds(3,7);
        System.out.println(ans);
    }
}
