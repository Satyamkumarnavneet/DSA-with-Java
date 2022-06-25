package Sorting_Algorithms;

public class selection_Sort {
    public static void printSortedArray(int arr[]){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = {2,1,6,9,5,7};

        // Time complexity = O(n^2)
        //Selection sort
        for (int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printSortedArray(arr);
    }
}
