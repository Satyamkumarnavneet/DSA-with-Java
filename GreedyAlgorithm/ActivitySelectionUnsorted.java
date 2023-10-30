package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnsorted {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;//index value
            activities[i][1]=start[i];//start val
            activities[i][2]=end[i];//end val
        }
        //lambda function->shortform of big function,o[2] is sorting based on col. 2,i.e.ending
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //1st Activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("max activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
