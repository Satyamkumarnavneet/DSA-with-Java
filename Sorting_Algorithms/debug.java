package Sorting_Algorithms;
public class debug {
    public static void printArray(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 8, 4, 5, 4};
        // bubble sort
        for (int i = 0; i < arr.length-1; i++) { // n-1
            for (int j = 0; j < arr.length - i - 1; j++) { // n, n-1,n-2, n-3...so on
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                if (arr[j]==arr[j+1]) {

                }
            }
        }

        printArray(arr);
    }
}
