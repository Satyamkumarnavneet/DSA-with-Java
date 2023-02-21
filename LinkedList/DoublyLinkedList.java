package LinkedList;

public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // removeFirst

    public int removeFirst(){
        if (head == null){
            System.out.println("LinkedList is Empty!!");
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // Reverse List

    public void reverseList(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;

    }


    // PrintList

    public void printList(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");

    }



    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printList();
        System.out.println(dll.getSize());

        dll.removeFirst();
        dll.printList();
        System.out.println(dll.getSize());

        dll.reverseList();
        dll.printList();
    }

}
