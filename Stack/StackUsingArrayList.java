package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static Stack.StackUsingArrayList.Stacks.list;

public class StackUsingArrayList {
    static class Stacks {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){ // Inserting data
            list.add(data);
        }
        public static int pop(){ // Deleting top data
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){ // Displaying top data without removing into stack
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size() -1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }

}
