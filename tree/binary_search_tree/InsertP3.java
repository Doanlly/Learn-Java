package binary_search_tree;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class InsertP3 {
    // Function to insert a node in a BST.
   

    // Function to traverse a BST in inorder.
    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    Node insert(Node root, int Key) {
        if (root == null)
            return new Node(Key);

        if (root.data < Key) {
            root.right = insert(root.right, Key);
        } else {
            root.left = insert(root.left, Key);
        }

        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an empty BST
        Node root = null;
        int n = sc.nextInt();
        InsertP3 solution = new InsertP3();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            root = solution.insert(root, key);
        }
        solution.inorder(root);
    }
}
