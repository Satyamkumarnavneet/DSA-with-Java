package Heap;

import java.util.PriorityQueue;

public class PriorityQueueUsingObjects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    /*
    The comparison between Student objects is being performed in the compareTo() method,
    which is defined in the Comparable interface.

    The PriorityQueue class uses this comparison logic to maintain the Student objects in the priority
    queue in increasing order of their ranks. When elements are added or removed from the priority queue,
    the compareTo() method is called automatically to determine their relative priority.

     */
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new java.util.PriorityQueue<>();
        pq.add(new Student("A",4));
        pq.add(new Student("M",6));
        pq.add(new Student("I",8));
        pq.add(new Student("S",2));
        pq.add(new Student("H",7));
        pq.add(new Student("A",1));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
