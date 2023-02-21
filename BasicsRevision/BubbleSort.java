package BasicsRevision;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,8,3,5,9,4,7};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i<n; i++){
                System.out.print(arr[i]+ " ");
            }
    }
}
