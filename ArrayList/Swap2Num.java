package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2Num {
    public static void Swap(ArrayList<Integer> numList, int idx1, int idx2){
        int temp = numList.get(idx1);
        numList.set(idx1, numList.get(idx2));
        numList.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(6);
        numList.add(9);
        numList.add(2);

//        System.out.println(numList);
//        Collections.swap(numList,0,1);
//        System.out.println(numList);

        int idx1 = 1;
        int idx2 = 3;
        System.out.println(numList);
        Swap(numList,idx1,idx2);
        System.out.println(numList);


    }
}
