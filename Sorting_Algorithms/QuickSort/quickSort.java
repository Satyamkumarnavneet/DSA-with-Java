package Sorting_Algorithms.QuickSort;

public class quickSort {
    private static int particiation(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j =low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp; // Pivot index
        return i;
    }
    public static void qSort(int arr[], int low, int high){
        if (low<high){
            int pivotIdx = particiation(arr,low,high);
            qSort(arr,low,pivotIdx-1);
            qSort(arr,pivotIdx+1,high);
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,5,9,0,6};
        int n = arr.length;
        qSort(arr,0,n-1);

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}
