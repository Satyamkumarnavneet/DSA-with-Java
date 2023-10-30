package BinarySearchTree;

import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }


    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inOrder);
        inOrder.add(root.data);
        getInorder(root.right, inOrder);
    }

    public static Node createBST(ArrayList<Integer> inOrder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBST(inOrder, start, mid - 1);
        root.right = createBST(inOrder, mid + 1, end);
        return root;
    }

    public static Node balancedBST(Node root) {
        // Inorder sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInorder(root,inOrder);
        // Sorted Inorder -> balanced BST

        root = createBST(inOrder, 0, inOrder.size()-1);
        return root;
    }


    public static void main(String[] args) {
             /* BST
                      8
                     / \
                    6   10
                   /     \
                  6       11
                 /         \
                3           12


                Balanced BST

                     8
                    / \
                   5   11
                  / \  / \
                 3  6  10 12
            */

        Node root = new Node(8);
        root. left = new Node(6);
        root. left. left = new Node( 5);
        root. left. left. left = new Node( 3);

        root.right = new Node( 10);
        root.right. right = new Node( 11);
        root.right.right.right = new Node(12);

        root = balancedBST(root);
        preOrder(root);


    }
}
