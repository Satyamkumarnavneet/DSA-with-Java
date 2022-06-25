package Sorting_Algorithms;

public class selectionSort {
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,5,1,6,8,9};
        for (int i=0; i<arr.length; i++){
            int smallest = i;
            for (int j = i+1; j<arr.length-1; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printArray(arr);


    }
}
