//package LinkedList;
//
//import org.w3c.dom.Node;
//
//public class DetectCycle {
//    public static boolean isCyclic(){
//        Node head = null;
//        Node next;
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if (slow == fast){
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
