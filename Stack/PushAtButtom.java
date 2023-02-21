package Stack;

import java.util.Stack;

public class PushAtButtom {
    public static void pushButtom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushButtom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> s  = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushButtom(s,4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
