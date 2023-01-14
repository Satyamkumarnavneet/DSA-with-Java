package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int arr [] = {3,2,5,7,2};
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum is " + sum+".");
    }
}
