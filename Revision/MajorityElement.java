package Revision;

public class MajorityElement {
    public static int findMajority(int arr[]){
        int count = 0;
        int element = 0;
        for (int i: arr){
            if (count == 0){
                element = i;
            }
            if (i == element){
                count++;
            } else {
                count--;
            }
        }
        return element;

    }

    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(findMajority(arr));

    }
}
