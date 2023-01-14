package ArrayList;

import java.util.ArrayList;

public class PairSumII {
    public static boolean calcuSum(ArrayList<Integer> list, int target){
        int n = list.size();
        int brPoint = -1;
        for (int i = 0; i<n; i++){
            if (list.get(i) > list.get(i+1)){
                brPoint = i;
                break;
            }
        }
        int leftPointer = brPoint+1;
        int rightPointer = brPoint;
        while (leftPointer != rightPointer){
            if (list.get(leftPointer) + list.get(rightPointer) == target){
                return true;
            }
            if (list.get(leftPointer) + list.get(rightPointer) < target){
                leftPointer = (leftPointer+1)%n;
            } else {
                rightPointer = (n+rightPointer-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(calcuSum(list,target));

    }
}
