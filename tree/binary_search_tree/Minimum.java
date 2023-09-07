package binary_search_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}



class Tree {
    int minValue(Node node) {
        if(node == null)
            return -1;
        if(node.left != null)
            return minValue(node.left);
        return node.data;
    }
}
public class Minimum {
    public static void main(String[] args) {

        Node root = buildTree("5 4 6 3 N N 7 1".split(" "));
        Tree tree = new Tree();
       // Tìm giá trị nhỏ nhất trong cây tìm kiếm nhị phâne
        int minValue = tree.minValue(root);
        System.out.println("Ouput:" + minValue);
    }
    public static Node buildTree(String[] nodes) {
        Node root = null;
        for (String node : nodes) {
            if (node.equals("N")) 
                continue;
            int value = Integer.parseInt(node);
            root = insert(root, value);
        }
        return root;
    }
    
    // Helper function to insert a node into a binary search tree
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    
    // Definition of a binary tree node
  
    }
  
