package binary_search_tree;

import java.util.Scanner;

class Res {
    Node pre;
    Node succ;
}

class Solution {
    static void findPreSuc(Node root, Res p, Res s, int key) {
        if (root == null) return;
        if (root.data == key) {
            if (root.left != null) {
                Node tmp = root.left;
                while (tmp.right != null)
                    tmp = tmp.right;
                p.pre = tmp;
            }
            if (root.right != null) {
                Node tmp = root.right;
                while (tmp.left != null)
                    tmp = tmp.left;
                s.succ = tmp;
            return;
        }
        if (root.data > key) {
            s.succ = root;
            findPreSuc(root.left, p, s, key);
        } else {
            p.pre = root;
            findPreSuc(root.right, p, s, key);
        }
    }
    public static void main(String[] args) {
       
            Node root1 = new Node(78);
            root1.left = new Node(34);
            root1.right = new Node(97);
            root1.left.left = new Node(12);
            root1.left.right = new Node(45);
    
            int key1 = 34;
            Res res1 = new Res();
            findPre(root1, res1, key1);
            findSuccess(root1, res1, key1);
            System.out.println(res1.pre.data + " " + res1.succ.data);
    
            Node root2 = new Node(78);
            root2.left = new Node(24);
            root2.right = new Node(80);
            root2.left.left = new Node(18);
            root2.left.right = new Node(55);
            root2.right.right = new Node(85);
    
            int key2 = 40;
            Res res2 = new Res();
            findPre(root2, res2, key2);
            findSuccess(root2, res2, key2);
            System.out.println(res2.pre.data + " " + res2.succ.data);
        }
    
        static class Node {
            int data;
            Node left, right;
    
            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }
    
        static class Res {
            Node pre = null;
            Node succ = null;
        }
    }

        
        // findSuccess and findPre methods go here
