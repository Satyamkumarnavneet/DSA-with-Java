package BasicsRevision;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {2,9,5,1,7,8};
        int n = arr.length;

        for (int i = 0; i<n-1; i++){
            int smallest = i;
            for (int j = i+1; j<n; j++){
                if (arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
