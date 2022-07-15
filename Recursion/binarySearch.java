package Recursion;

public class binarySearch {

    static int search(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return search(arr,target,s,mid-1);
        }
        return search(arr, target, mid+1,e);

    }

    public static void main(String[] args) {
        int arr[] = {3,2,6,8,9,22,55,77,22}; // In binary search array must be sorted first to be able to apply binary search
        int target = 55;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
