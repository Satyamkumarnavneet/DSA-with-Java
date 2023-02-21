package Arrays;

public class SubArray {
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,10};
        int sum  = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                for (int k = i; k<=j; k++){
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Sum of the subArray is " + sum);
    }
}
