package Hashing;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int num1[] = {7,3,9};
        int num2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<num1.length; i++){
            set.add(num1[i]);
        }
        for(int i = 0; i<num2.length; i++){
            set.add(num2[i]);
        }
        System.out.println("Union" + " = " + set.size() + " "+ set);


    }
}
