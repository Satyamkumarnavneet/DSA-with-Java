package Sorting_Algorithms;

import java.util.SortedMap;

public class bubble_Sort {
    public static void printSortedArray(int arr[]){
        System.out.print("Sorted array: ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {
        int arr [] = {3,2,6,1,8,7};
        // Bubble sort
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printSortedArray(arr);


    }
}
