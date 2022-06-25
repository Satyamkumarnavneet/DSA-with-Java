package Recursion;

public class checkSorted {
    public static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx] <= arr[idx+1]){
            return isSorted(arr,idx+1);
        } else {
            return false;
        }

    }

    // Time complexity = O(n)
    public static void main(String[]args){
        int arr[] = {2,4,6,1,9};
        System.out.println(isSorted(arr,0));

    }
}
