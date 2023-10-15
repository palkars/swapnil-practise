package com.swapnil.graph;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public static void main(String[] args) {
        TreeTraversal treeTraversal = new TreeTraversal();
        Node node = new Node(10, new Node(5, new Node(3), new Node(2)), new Node(15, new Node(4), new Node(6)));
        /*
              10
           5      15
        3    2  4    6
         */
        System.out.println("Inorder traversal: ");
        treeTraversal.inorder(node);
        System.out.println("\nPreOrder traversal");
        treeTraversal.preorder(node);
        System.out.println("\nPostOrder traversal");
        treeTraversal.postorder(node);
        System.out.println("\nLeverOrder traversal");
        treeTraversal.levelOrder(node);

    }

    private void levelOrder(Node node) {
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(node);
        while(!q1.isEmpty() || !q2.isEmpty()) {
            while(!q1.isEmpty()) {
                Node n = q1.poll();
                System.out.print(n.value + " ");
                if(n.left != null ) {
                    q2.add(n.left);
                }
                if(n.right != null) {
                    q2.add(n.right);
                }

            }
            while(!q2.isEmpty()){
                Node n = q2.poll();
                System.out.print(n.value + " ");
                if(n.left != null ) {
                    q1.add(n.left);
                }
                if(n.right != null) {
                    q1.add(n.right);
                }
            }
        }

    }

    private void postorder(Node node) {
        if (node.left != null) {
            postorder(node.left);
        }
        if (node.right != null) {
            postorder(node.right);
        }
        System.out.print(node.value + " ");
    }

    private void preorder(Node node) {
        System.out.print(node.value + " ");
        if (node.left != null) {
            preorder(node.left);
        }
        if (node.right != null) {
            preorder(node.right);
        }
    }

    private void inorder(Node node) {
        if (node.left != null) {
            inorder(node.left);
        }
        System.out.print(node.value + " ");
        if (node.right != null) {
            inorder(node.right);
        }
    }
}
