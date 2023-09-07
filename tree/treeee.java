import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
@SuppressWarnings("unchecked")
public class SimpleBST<Key extends Comparable<Key>> implements SimpleBTreeInterface<Key> {
	
	class Node{
		Key data;
		Node left, right;
		public Node(Key key)
		{
			this.data =  key;
		}
	}
	
	private Node root = null;
	int n = 0;
	@Override
	public void insert(Key k) {

    if (root == null) {
            root = new Node(k);
            n++;
            return ;
        }
        
        Node current = root;
        while (true) {
            int c = k.compareTo(current.data);
            if ( c < 0) {
                if (current.left == null) {
                    current.left = new Node(k);
                    n++;
                    return;
                }
                current = current.left;
            } else if (c >= 0) {
                if (current.right == null) {
                    current.right = new Node(k);
                    n++;
                    return;
                }
               current = current.right;
            }
        }
	}

	@Override
	public Key search(Key k) {
		// TODO Auto-generated method stub
        Node x = root;
        while (x != null) {
            int cmp = k.compareTo(x.data);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else {
                return x.data;
            }
        }
        return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}
	private int size(Node node) {
    if (node == null) {
        return 0;
    }
    return size(node.left) + size(node.right) + 1;
}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return root == null;
	}
	
	@Override

    public Iterator<Key> iterator() {
        List<Key> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list.iterator();
    }
    
    private void inorderTraversal(Node node, List<Key> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node.data);
        inorderTraversal(node.right, list);
    }
	
	//duyệt cây theo thứ tự trước (tiền thứ tự)
	public void preTraverse()
	{
	    preHelper(root);

	}
    private void preHelper(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        preHelper(node.left);
        preHelper(node.right);
    }

	
    // duyệt cây theo thứ tự sau (hậu thứ tự)
    public void postTraverse() {
        postTraverse(root);
        
    }
    
    private void postTraverse(Node node) {
        if (node != null) {
            postTraverse(node.left);
            postTraverse(node.right);
            System.out.println(node.data);
        }
    }
    	
    public void inTraverse() {
        inTraverse(root);
    }

private void inTraverse(Node x) {
    if (x == null) {
        return;
    }
    inTraverse(x.left);
    System.out.println(x.data);
    inTraverse(x.right);
}
	

	public static void main(String[] args) {
		SimpleBST<Integer> bst =  new SimpleBST<>();
		
		int[] data = {5,6,7,1,2,3,8,6,9,0};
		for(int i = 0 ; i < data.length ; i++)
			bst.insert(data[i]);
		
		System.out.println("All element in tree:");
		System.out.println("All element in tree:");
		int[] t = new int[data.length];
		int id = 0;
		for(int d:bst)
		{
			t[id] = d;
			id++;
		}
		
		Arrays.sort(t);
		for(int d:t)
		{
			System.out.print(d+" ");
		}
		
		System.out.println("");
		System.out.println("Size of tree = "+bst.size());
		
		System.out.println("Search key = 4> "+ bst.search(4));
		System.out.println("Search key = 6> "+bst.search(6));
		
		System.out.println("Pre-order tree traversal");
		bst.preTraverse();
		System.out.println("Post-order tree traversal");
		bst.postTraverse();
		System.out.println("In-order tree traversal");
		bst.inTraverse();
		
	}
	
	
	
}