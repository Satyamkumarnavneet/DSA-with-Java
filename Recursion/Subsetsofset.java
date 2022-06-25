package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Subsetsofset {
    public static void printSubset(ArrayList<Integer>subset){
        for(int i = 0; i<subset.size(); i++){
            System.out.println(subset.get(i)+ " ");
        }
        System.out.println();
    }

    // Time complexity = 0(2^n)

    public static void findSusbset(int n, ArrayList<Integer>subSet){
        if (n == 0){
            System.out.println(subSet);
            return;
        }
        // will add
        subSet.add(n);
        findSusbset(n-1,subSet);

        // Will not add
        subSet.remove(subSet.size()-1);
        findSusbset(n-1,subSet);

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSusbset(n,subSet);
    }
}
