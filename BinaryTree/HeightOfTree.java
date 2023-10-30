package BinaryTree;

public class HeightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }
    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);
        return leftNodes + rightNodes + root.data;
    }

    public static int calculateDiameter(Node root){
        if (root == null){
            return 0;
        }
        int leftDia = calculateDiameter(root.left);
        int rightDia = calculateDiameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDia = leftHeight + rightHeight + 1;
        return Math.max(selfDia , Math.max(leftDia,rightDia));
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if (root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam,ht);
    }

    public static boolean isIdentcial(Node node, Node subRoot){
        if (node == null && subRoot == null){
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if (!isIdentcial(node.left, subRoot.left)){
            return false;
        }
        if (!isIdentcial(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if (root == null){
            return false;
        }
        if (root.data == subRoot.data){
            if (isIdentcial(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }


    public static void main(String[] args) {
        /*          1
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


        /*
        Subtree
                 2
                / \
               4   5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("The height of the tree is: "+ height(root));
        System.out.println("The count of the tree is: " + count(root));
        System.out.println("The sum of the all the nodes is: " + sumOfNodes(root));
        System.out.println("The Diameter of the tree will be: " + calculateDiameter(root));
        System.out.println(diameter(root).diam);

        System.out.println("SubTree? "+ isSubtree(root,subRoot));


    }
}
