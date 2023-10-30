package Heap;

import java.util.ArrayList;

public class InsertInHeap {
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();
        public void add(int data){
            list.add(data); // add last index
            int x = list.size()-1; // Child index

            while (x > 0) { /* If we change the while loop condition to while (list.get(x) < list.get(parent)), but remove the
            while (x > 0) condition, then the loop will continue to swap the child node with its parent node until the heap
            property is satisfied or the child node reaches the root node. However, this could result in an index out of bounds
            error if the child node index becomes negative (since we are dividing the child index by 2 in each iteration).
            Therefore, it is important to keep the while (x > 0) condition in the loop to avoid this error. */

                int parent = (x-1)/2; // Parent index
                if (list.get(x) < list.get(parent)){
                    // swap
                    int temp = list.get(x);
                    list.set(x, list.get(parent));
                    list.set(parent,temp);
                    x = parent;
                } else {
                    break; // heap property is satisfied
                }
            }
        }
        public int peek(){
            return list.get(0);
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if (left < list.size() && list.get(minIdx) > list.get(left)){
                minIdx = left;
            }
            if (right < list.size() && list.get(minIdx) > list.get(right)){
                minIdx = right;
            }
            if (minIdx != i){
                // Swap
                int temp = list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);
                heapify(minIdx);
            }
        }
        public int remove(){
            int data = list.get(0);

            // Swap first and last step
            int temp = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, temp);

            // Step 2 - delete last
            list.remove(list.size()-1);

            // Step 3 - Heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return list.size() == 0;
        }


    }
    public static void main(String[] args) {
        Heap heap = new Heap();
//        heap.add(2);
//        heap.add(3);
//        heap.add(4);
//        heap.add(5);
//        heap.add(10);
//        heap.add(1);

        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);


//        System.out.println(heap.list);
//        System.out.println(heap.peek());

        /*
                1
              /   \
             3     2
            / \   /
           5  10  4

         */

        while (!heap.isEmpty()){
            System.out.println(heap.peek());
            heap.remove();
        }

    }
}
