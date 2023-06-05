package TREES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int x) {
            this.value = x;
        }
    }

    static void preorder(Node x) {
        if (x == null) {
            return;
        }
        System.out.print(x.value + " ");
        preorder(x.left);
        preorder(x.right);
    }

    static void inOrder(Node x) {
        if (x == null) {
            return;
        }
        inOrder(x.left);
        System.out.print(x.value + " ");
        inOrder(x.right);
    }

    static void postOrder(Node x) {
        if (x == null) {
            return;
        }
        postOrder(x.left);
        postOrder(x.right);
        System.out.print(x.value + " ");
    }

    static void leveOrderTraversal(Node Node) {
        Queue<Node> q1 = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q1.add(Node);
        while (!q1.isEmpty()) {
            Node curr = q1.poll();
            ans.add(curr.value);
            if (curr.left != null) {
                q1.add(curr.left);
            }
            if (curr.right != null) {
                q1.add(curr.right);
            }
        }
        System.out.println(ans);
    }

    static ArrayList<Integer> preorderIterative(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        if (root == null) {
            return ans;
        }
        s1.push(root) ; 
        while (!s1.empty()) {
            Node curr = s1.pop();
            ans.add(curr.value);
            if(curr.right!=null){
                s1.push(curr.right) ; 
            }
            if(curr.left!=null){
                s1.push(curr.left) ; 
            }

        }
        return ans;
    }

    static int heightOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right) + 1);
    }

    static int count(Node root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

    static int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(root.left.value, root.right.value));
    }

    static int minValue(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.min(root.value, Math.min(root.left.value, root.right.value));
    }

    static void leftView(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        leftView(root.left);
    }

    static void rightView(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        rightView(root.right);
    }

    static void topView(Node root) {
        if (root == null) {
            return;

        }
        topView(root.left);
        System.out.println(root.value);
        topView(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.right = new Node(4);

        // preorder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        // leveOrderTraversal(root);
        // System.out.println( "height = " + heightOfBinaryTree(root));
        // System.out.println(count(root));
        System.out.println(preorderIterative(root));
        // System.out.println(maxValue(root));
        // System.out.println(minValue(root));
        // System.out.println("left view");
        // leftView(root);
        // System.out.println("right view");

        // rightView(root);

        // topView(root);

    }

}
