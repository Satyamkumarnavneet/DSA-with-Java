package Arrays;

import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,2,5,7,9,8};
        System.out.print("Enter the value to be searched: ");
        int target = sc.nextInt();
        for (int i =0 ; i<arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The index of element "+target+" is : " + i);
                break;
            }
            else {
                System.out.println(-1);
                break;
            }
        }

    }
}