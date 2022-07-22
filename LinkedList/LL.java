package LinkedList;
import java.util.*;
public class LL {
    // Collection framework
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Satyam");
        list.add("Supriya");

        list.addFirst("Rishita");
        list.addLast("Jayati");


        System.out.println(list);
        System.out.println(list.size());

        for (int i =0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");

        list.remove(3); // We can pass index as well as objects
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);


    }
}
