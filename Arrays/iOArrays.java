package Arrays;

import java.util.Scanner;

public class iOArrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int number [] = new int[size];
//        for (int i = 0; i<size; i++){
//            number[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i<= number.length; i++){
//            System.out.println(number[i]+ " ");
//        }
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //print the numbers in array
        for(int i=0; i<numbers.length; i++) {
//            System.out.print(numbers[i]+" ");
            if(numbers[i]==x){
                System.out.println("Number found at index: "+i);
            }
        }


    }
}
