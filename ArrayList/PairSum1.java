package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
//    public static boolean calPair( ArrayList<Integer> list, int target){
//        int n = list.size();
//        for (int i = 0; i<n; i++){
//            for (int j = 0; j<n; j++){
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    public static boolean calPair(ArrayList<Integer> list, int target){
        int n = list.size();
        int low = 0;
        int high = n-1;
        while (low<high){
            if (list.get(low) + list.get(high) == target){
                return true;
            }
            if (list.get(low) + list.get(high) < target){
                low++;
            } else {
                high--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 4;
        System.out.println(calPair(list,target));

    }
}
