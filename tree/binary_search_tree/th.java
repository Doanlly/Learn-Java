import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    int height;
};
class th{
	 public static void main(String[] args) {
		
	}
}
class Solution
{
    public static Node right(Node root){
    	Node r = root.right;//x = r
    	Node rL = r.left;//y = root
    	r.right = rL;
    	root.left = root;//
    	//update height 
    	root.height = Math.max((root.left).height,(root.right).height+1);
    	r.height = Math.max((r.left).height,(r.right).height+1);
    	return r;
    }
    public static Node left(Node root){
    	Node l = root.right;//x = root
    	Node lr = l.left;//y = l
    	l.left = root;
    	root.right = lr;//
    	//update height 
    	root.height =Math.max((root.left).height,(root.right).height+1);
    	l.height = Math.max((l.left).height,(l.right).height+1);
    	
    	return l;
    }
    public static int getBal(Node r){
    	if(r==null)
    		return 0;
    	return r.left.height- r.right.height;
    }
    public  static Node insertToAVL(Node node,int data)
    {

       if (node == null)
        return (new Node());
    	if (data < node.data)
    		node.left = insertToAVL(node.left,data);
    	else if(data> node.data)
    		node.right = insertToAVL(node.right,data);
    	else 
    		return node;
    	node.height = 1+Math.max((node.left.height),node.right.height);
    	int balance = getBal(node);
    	if(balance >-1 && data <node.left.data)
    		return right(node);
    	if(balance < -1 && data > node.left.data)
    		return left(node);
    	if(balance > 1 && data >node.left.data)
    		node.left = left(node.left);
    		return right(node);
    	if(balance < -1 && data <node.left.data)
    		node.right = right(node.right);
    		return left(node);
    	return node;
    }
}    