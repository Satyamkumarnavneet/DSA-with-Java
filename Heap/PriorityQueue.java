package Heap;

public class PriorityQueue {

    public static void main(String[] args) {
        java.util.PriorityQueue <Integer> pq = new java.util.PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        /*
        The priority queue internally maintains the elements in a heap data structure,
        with the highest-priority element (i.e., the smallest integer) at the root of the heap.
         */

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove(); // 0(logn)
        }
    }
}
