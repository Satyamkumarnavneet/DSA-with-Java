package Sorting_Algorithms.MergeSort;

import java.util.ArrayList;
import java.util.*;

public class MergeSortedArray {
        public static int[][] merge(int[][] intervals) {
            ArrayList<int[]> ans = new ArrayList<>();
            //Base conditions when no value present in intervals array
            if(intervals.length==0||intervals==null)
                return ans.toArray(new int[0][]);

            Arrays.sort(intervals , (a,b)->a[0]-b[0]);

            //Then create two pointers for start and end of an interval
            int start = intervals[0][0];
            int end = intervals[0][1];

            for(int i = 1; i < intervals.length; i++) {
                //Basically no overlap condition
                if(intervals[i][0] > end) {
                    ans.add(new int[]{start , end});
                    start = intervals[i][0];
                    end = intervals[i][1];
                }
                //overlap condition
                else if(intervals[i][1] >= end){
                    end = intervals[i][1];
                }
            }

            //final pair , adding the remaining interval element
            ans.add(new int[]{start , end});
            return ans.toArray(new int[ans.size()][]);
        }

    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
         int ans [] [] = merge(intervals);
        System.out.println(ans);


    }
}