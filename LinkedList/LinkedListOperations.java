package LinkedList;
import org.w3c.dom.Node;

import java.util.List;

public class LinkedListOperations {
    static Node head;
    private int size;
    LinkedListOperations(){
        this.size = 0;
    }
    class Node {
            String data;
            Node next;
            Node(String data) {
                this.data = data;
                this.next = null;
                size++;
            }
        }

    // Add -- first, last

    public void addFirst(String data){ // Add first
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast (String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print
    public void printList(){
        Node currNode = head;
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

    // Delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }


    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public static boolean isCycle(){
        Node head = null;
        Node next;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }


    public int getSize() {
        return size;
    }
    public void zigZag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alt merge - zig-zag merge
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;

        }
//    public static void zigZag(){
//        Node slow = head;
//        Node fast = head.next;
//        while (fast!= null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        Node mid = slow;
//
//        Node curr = mid.next;
//        Node prev = null;
//        mid.next =null;
//        Node next = null;
//
//        while (curr != null){
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        Node left = head;
//        Node right = prev;
//        Node nextL, nextR;
//
//        while (left != null && right != null){
//            nextL = left.next;
//            left.next = right;
//            nextR = right.next;
//            right.next = nextL;
//
//            left = nextL;
//            right = nextR;
//        }

    }

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//
//        list.addFirst("this");
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//
//        list.getSize();
//        System.out.println(list.getSize());

        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        list.addLast("f");
        list.printList();
        list.zigZag();
        list.printList();

    }
}
