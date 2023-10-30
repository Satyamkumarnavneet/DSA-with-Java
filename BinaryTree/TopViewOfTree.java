package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        Node node;
        int horDis;
        public Info(Node node, int horDis){
            this.node = node;
            this.horDis = horDis;
        }
    }

    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root,0));
        q.add(null);
        while (!q.isEmpty()){
            Info curr = q.remove();
            if (curr == null){
                if (q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.horDis)){ // first time my hd is occuring
                    map.put(curr.horDis,curr.node);
                }
                if (curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.horDis-1));
                    min = Math.min(min, curr.horDis-1);
                }
                if (curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.horDis+1));
                    max = Math.max(max,curr.horDis+1);
                }
            }
        }
        for (int i = min; i<=max; i++){
            System.out.println(map.get(i).data + " ");
        }
        System.out.println();


    }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null||root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        //leftLCA=val rightLca=null
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }

    public static int lcaDist(Node root, int n){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftDis = lcaDist(root.left, n);
        int rightDis = lcaDist(root.right, n);

        if (leftDis == -1 && rightDis == -1){
            return -1;
        } else if (leftDis == -1){
            return rightDis + 1;
        } else {
            return leftDis + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }
    public static int kAncestors(Node root, int n, int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftDis = kAncestors(root.left, n, k);
        int rightDis = kAncestors(root.right, n, k);
        if (leftDis == -1 && rightDis == -1){
            return -1;
        }
        int max = Math.max(leftDis, rightDis);
        if (max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static int sumTree(Node root){
        if (root == null){
            return 0;
        }
        int leftSubTreeSum = sumTree(root.left);
        int rightSubTreeSum = sumTree(root.right);
        int data = root.data;
        int newLeftData = root.left == null ? 0 : root.left.data;
        int newRightDat = root.right == null ? 0 : root.right.data;
        root.data = newLeftData + leftSubTreeSum + newRightDat + rightSubTreeSum;
        return data;
    }
    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
         /*         1
                   / \
                  2   3
                 / \  / \
                4   5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //topView(root);
//        int n1 = 4;
//        int n2 = 6;

        int n = 5;
        int k = 2;
        //System.out.println(minDist(root,n1,n2));
        //kAncestors(root,n,k);
        sumTree(root);
        preOrder(root);


    }
}
