package LinkedList;
//
  public class LinkedOperations {
//    public class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data = data;
//            this.next = null;
//
//        }
//    }
//
//    public static Node head;
//    public static Node tail;
//    public static Node size;
//
//    public void addFirst(int data){
//        // Step 1. Create new node
//        Node newNode = new Node(data);
//        if (head == null){
//            head = tail = newNode;
//            return;
//        }
//        // Step 2. point newNode to head
//        newNode.next = head;
//        // Step 3. point head to node
//        head = newNode;
//    }
//
//    public void addLast(int data){
//        // Create a new node
//        Node newNode = new Node(data);
//        if (head == null){
//            head = tail = newNode;
//            return;
//        }
//        // Point tail.next to newNode
//        tail.next = newNode;
//        // Point tail to newNode
//        tail = newNode;
//    }
//    public void print(){
//        Node temp = head;
//        if (temp == null){
//            System.out.println("List is empty");
//            return;
//        }
//        while (temp != null){
//            System.out.print(temp.data+ " ->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//    public void add(int idx, int data){
//        if (idx == 0){
//            addFirst(data);
//            return;
//        }
//        Node newNode = new Node(data);
//        int i = 0;
//        Node temp = head;
//        while (i< idx-1){
//            temp = temp.next;
//            i++;
//        }
//        newNode.next = temp.next;
//        temp.next = newNode;
//    }
//
//    public int removeFirst(){
//        if (size == 0){
//            System.out.println("List is empty");
//            return Integer.MIN_VALUE;
//        } else if (size == 1){
//            int val = head.data;
//            head = tail = null;
//            size = 0;
//            return val;
//
//        }
//        int val = head.data;
//        head = head.next;
//        size--;
//        return val;
//    }
public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step 1=create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2=new nodes next=head
        newNode.next=head;
        //step 3
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp= temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.print("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    // Step1. prev.next = null
    // Step2. tail = prev
    public int removeLast(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        // Prev: i = size-2;
        Node prev = head;
        for (int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    public static int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;;
            i++;
        }
        return -1;

    }
//    public static int itrSearch(int key){
//        Node temp = head;
//        int i = 0;
//        while (temp != null){
//            if (temp.data == key){
//                return i; //
//            }
//            temp = temp.next;
//            i++;
//        }
//        // Not found case
//        return -1;
//    }
    public static int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

//    public void deleteNthNode(int n){
//        int size = 0;
//        Node temp = head;
//        while (temp != null){
//            temp = temp.next;
//            size++;
//        }
//        if (n == size){
//            head = head.next;
//            return;
//        }
//        int i = 1;
//        int iToFind  = size-n;
//        Node prev = head;
//        while (i<iToFind){
//            prev = prev.next;
//            i++;
//        }
//        prev.next = prev.next.next;
//        return;
//    }
    public void deleteNthfromEnd(int n){
           int sz=0;//Calculate size
             Node temp=head;
             while(temp!=null){
                 temp=temp.next;
                 size++;
             }
             if(n==sz){
                 head=head.next;//remove first
                 return;
             }
            // sz-n
            int i=1;
            int iToFind=sz-n;
            Node prev=head;
            while(i<iToFind){
              prev=prev.next;
              i++;
            }
            prev.next=prev.next.next;
            return;
         }



    public static void main(String[] args) {
        LinkedOperations ll  = new LinkedOperations();
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.add(2,3);
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.itrSearch(6));
//        System.out.println(ll.recSearch(30));
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
