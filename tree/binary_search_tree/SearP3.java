package binary_search_tree;
import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class SearP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bst bst = new bst();

        // Enter the number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Enter the number of nodes in the BST
            int n = sc.nextInt();

            // Create the BST
            Node root = null;
            while (n-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char c = sc.next().charAt(0);
                if (root == null) {
                    root = new Node(a);
                }
                bst.search(root, a);
            }

            // Enter the key to search for
            int x = sc.nextInt();

            // Search for the key in the BST
            if (bst.search(root, x)) {
                System.out.println("Key found in the BST");
            } else {
                System.out.println("Key not found in the BST");
            }
        }
    }}
class bst {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root == null)
        return false;
        if(root.data == x)
        return true;
        return search(root.right, x) || search(root.left, x);
    }
}
