package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    public static void main(String[] args) {
        class Job{
            int deadLine;
            int profit;
            int id;

            public Job (int i, int d, int p){
                id = i;
                deadLine = d;
                profit = p;
            }
        }
        int jobInfo [][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
//        Job jobs[] = new Job[jobInfo.length];
        for (int i = 0; i< jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit - obj1.profit);
        // Descending order
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i = 0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if (curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max Jobs: " + seq.size());
        for (int i = 0; i<seq.size(); i++){
            System.out.println(seq.get(i) + " ");
        }
        System.out.println();
    }
}
