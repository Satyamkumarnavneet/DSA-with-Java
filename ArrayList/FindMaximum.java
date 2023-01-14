package ArrayList;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String args[]){
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(5);
        numList.add(8);
        numList.add(10);
        numList.add(33);
        int max  = Integer.MIN_VALUE;
        for (int i = 0; i<numList.size(); i++){
            max = Math.max(max,numList.get(i)); // Math.max method
//            if (max <= numList.get(i)){
//                max = numList.get(i);
//            }
        }
        System.out.println("Maximum element: " + max);
    }

}
