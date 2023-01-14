package Revision;

public class InversionCountArray {
    public static int conquer(int arr[], int temp[], int left, int mid, int right){
        int inverseCount = 0;
        int i = left;
        int j = mid;
        int k = left;
        while ((i<= mid-1) && (j<=right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else{
                temp[k++] = arr[j++];
                inverseCount = inverseCount + (mid-i);
            }
        }
        while (i<= mid-1){
            temp [k++] = arr[i++];
        }
        while (j<= right){
            temp[k++] = arr[j++];
        }
        for (i = left; i<=right; i++){
            arr[i] = temp[i];
        }
        return inverseCount;
    }
    public static int divide(int arr[], int[] temp, int left, int right){
        int mid = 0;
        int inverseCount = 0;
        if (right>left){
            mid = left+(right-left)/2;
            inverseCount += divide(arr,temp, left, mid);
            inverseCount += divide(arr,temp,mid+1,right);
            inverseCount += conquer(arr,temp,left,mid+1,right);
        }
        return inverseCount;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        int n = arr.length;
        int temp[] = new int[n];
        int ans = divide(arr,temp,0,n-1);
        System.out.println(ans);

    }
}
