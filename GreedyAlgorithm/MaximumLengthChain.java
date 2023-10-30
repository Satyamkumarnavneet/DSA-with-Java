package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthChain {
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}}; // {5,24}, {5,28}, {27,40}, {39,60}, {50,90}
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));         // {00, 01}, {10, 11}, {20,21}, {30,31}, {40, 41}

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for (int i = 1; i<pairs.length; i++){
            if (pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);

    }
}
