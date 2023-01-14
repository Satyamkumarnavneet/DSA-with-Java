package Searching_Algorithms;

public class BinarySearch {
    public static int binarySearch(int arr[], int target, int start, int end){
            while (start<=end){
            int mid  = start+(end-start)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,8,9};
        int target = 4;
        int res = binarySearch(arr,target,0,arr.length-1);
        if (res == -1){
            System.out.println("Not found");
        }else {
            System.out.println("Elemnet found at index" + res);
        }
    }
}
