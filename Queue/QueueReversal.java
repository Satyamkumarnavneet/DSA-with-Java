package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()){
            System.out.print(s.push(q.remove()) + " ");
        }
        System.out.println();

        while (!s.isEmpty()){
            q.add(s.pop());
        }

        while (!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
