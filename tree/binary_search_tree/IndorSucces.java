package binary_search_tree;


import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class inorderSuccessor {
    
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        Node x = new Node(2);
        Solution sol = new Solution();
        Node successor = sol.inorderSuccessor(root, x);
        if (successor != null) {
            System.out.println(" Inorder Successor of the given node in the BST: "+ successor.data);
        } else {
            System.out.println("No inorder successor found.");
        }
    }
    public static Node search(Node root,int x){
		if(root==null||root.data==x)
			return root;
		if(root.data>x)
			return search(root.left,x);
		return search(root.right,x);
	}
}
class Solution
{
public Node inorderSuccessor(Node root,Node x){
    if(root == null)
        return null;
    ArrayList<Node> arr = new ArrayList<Node>();
    inorder(root,arr);
    for(int i=0;i+1<arr.size();i++){
         if(arr.get(i).data == x.data)
             return arr.get(i+1);
     }
     return null;

}
 public void inorder(Node root,ArrayList<Node> arr){
        if(root == null)
            return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
 }

}