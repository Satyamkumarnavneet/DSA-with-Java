package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class reverseLinkedList {
    Node head;
    class Node {
        int data;
        reverseLinkedList.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
     // Add -- first, last

//    public void addFirst(int data){ // Add first
//        reverseLinkedList.Node newNode = new reverseLinkedList.Node(data);
//        if (head == null){
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }

    public void addLast (int data){
        reverseLinkedList.Node newNode = new reverseLinkedList.Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        reverseLinkedList.Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print
    public void printList(){
        reverseLinkedList.Node currNode = head;
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        while (currNode != null){
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }

        System.out.println("NULL");

    }

    // Iterative Method

//    public void reverseList() {
//        if(head == null || head.next == null) {
//            return;
//        }
//
//        Node prevNode = head;
//        Node currNode = head.next;
//        while(currNode != null) {
//            Node nextNode = currNode.next;
//            currNode.next = prevNode;
//            prevNode = currNode;
//            currNode = nextNode;
//        }
//        head.next = null;
//        head = prevNode;
//    }

    // Recursive Method

    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;


    }


    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();
        // Collection Method
        LinkedList<Integer> list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Collections.reverse(list2);
        System.out.println(list2);

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();
//        list.reverseList();

        list.head = list.reverseRecursive(list.head);
        list.printList();



        

//
//        for (int i =0; i<list.size(); i++){
//            System.out.print(list.get(i) + " -> ");
//        }
//        System.out.println("N");


    }
}

