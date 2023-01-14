package LinkedList;
import org.w3c.dom.Node;

import java.util.List;

public class LinkedListOperations {
    Node head;
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

    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.printList();

        list.getSize();
        System.out.println(list.getSize());

    }
}
