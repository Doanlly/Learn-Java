
package OntapCTDL.tree;

import javax.lang.model.util.ElementScanner6;

public class BST {
    class Tree {// đại diện cho mỗi nút trong cây
        public int val;
        public Tree left;
        public Tree right;
        public Tree(int val){ // constructor để khởi tạo mỗi nút
            this.val = val;
        }
    }
    class MyBST{

        private Tree mRoot; // nút gốc
        public MyBST(){
            
        }
        public Tree insert(Tree root, int value){ //root là nút gốc, value là giá trị caanf thêm vào
            //TH1 
            Tree newNode= new Tree(value);
            if(root == null){ // cây rỗng
                root = new Tree(value);

            }else{
               // cây rỗng
                Tree temp  = root; // dich chuyen temp den nut can tim
                while(true){
                    if(value > temp.val){// giá trị mới > giá trị temp thì check
                        if(temp.right ==null){ // nếu null thì gắn luôn cho no 
                            temp.right = newNode;//án nút con phải của temp bằng nút mới
                            break;
                        }else{
                            temp = temp.right; // tiếp tục vòng lặp để di chuyển xuống cây.
                        }

                    }
                    else if(value < temp.val){
                        if(temp.left ==null){
                            temp.left = newNode;
                            break;
                        }else {
                        temp = temp.left;
                        }
                    }
                    // nghĩa là nó sẽ két thúc lặp khi gặp trái hoặc phải null
                }
                return root;
            }
            return root;
            
        }
        //C2: su dụng đệ quy:
        // public Tree insertrecu(Tree rootnode, int value){
        //     if(rootnode ==null){
        //         rootnode = new Tree(value);
        //     }
        //     if(value < rootnode.val){
        //         if(rootnode.left == null){
        //             rootnode.left = new Tree(value);
        //         }
        //         else{
        //              //nho hon thi dich trai
        //         insertrecu(rootnode.left, value);
        //         }
        //     }
        //     else{
        //         //truoc khi nhay sang ben phai thi kiem tra ben phai co cay khong
        //         if(rootnode.right == null){
        //             rootnode.right = new Tree(value);
        //         }
        //         else {
        //         insertrecu(rootnode.right, value);
        //         }
        //     }
        //     return rootnode;
        // }
        public Tree insertrecu(Tree rootnode, int value) {
            if (rootnode == null) {
                rootnode = new Tree(value);
                return rootnode;
            }
        
            if (value < rootnode.val) {
                if (rootnode.left == null) {
                    rootnode.left = new Tree(value);
                } else {
                    // nhỏ hơn thì đi sang bên trái
                    rootnode.left = insertrecu(rootnode.left, value);
                }
            } else {
                // lớn hơn hoặc bằng thì đi sang bên phải
                if (rootnode.right == null) {
                    rootnode.right = new Tree(value);
                } else {
                    rootnode.right = insertrecu(rootnode.right, value);
                }
            }
        
            return rootnode;
        }
        
        // xoa node key trong cay root
        // return cay moi da duoc xoa node
        // public Tree deleteTreeNode(Tree root, int key){
        //     if(root == null){
        //         return null;
        //     }
        //     // tìm node xóa
        //     if(key<root.val){  //  // kết quả thay đổi, nối cha với con của node đã xóa 
        //         root.left =  deleteTreeNode(root.left, key);
        //     }
        //     else if(key >root.val){
        //         // kết quả thay đổi, nối cha với con của node đã xóa 
        //         root.right = deleteTreeNode(root.right, key);
        //     }
        //     else{  // root.val ==key // xác định node xóa
        //         //TH1: root là node
        //         if(root.left ==null & root.right ==null){
        //             return null;
        //         }
        //         //TH2: co 1 con 
        //         if(root.left!= null && root.right != null){
        //             return root.left;
        //         }
        //         if(root.left ==null&& root.right!= null){
        //             return root.right;
        //         }
        //         //TH2: cẩ 2 co
        //         // tim node trai cung cay con  phen phai
        //         Tree leftMostNode = findLefeMostNode(root.right);
        //         root.val = leftMostNode.val;
        //         root.right = deleteTreeNode(root.right, leftMostNode.val);
                
        //         // if(root.left != null && root){

        //         // }
             
        //     }
        //     return root;
        // }
        // // tim node con trai cung
        // public Tree findLefeMostNode(Tree root){
        //     if(root == null) return null;
        //     Tree leftMostNode = root;
            
        //     while(leftMostNode.left != null){
        //         leftMostNode = leftMostNode.left;
        //     }
        //     return leftMostNode;
        // }
        public Tree deleteTreeNode(Tree root, int key) {
            if (root == null) {
                return null;
            }

            if (key < root.val) {
                root.left = deleteTreeNode(root.left, key);
            } else if (key > root.val) {
                root.right = deleteTreeNode(root.right, key);
            } else {
                if (root.left == null && root.right == null) {
                    return null;// ta đơn giản trả về null, tức là xóa nút này khỏi cây.
                } else if (root.left == null) {
                    //Nếu nút cần xóa chỉ có con phải
                    // ta trả về con phải của nút cần xóa, xóa nút này khỏi cây và kết nối con phải với nút cha.
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
//// Nút cần xóa có cả con trái và con phải: Trường hợp này, ta tìm nút có 
//giá trị nhỏ nhất trong cây con phải của nút cần xóa, gọi là leftMostNode.
//tìm nút có giá trị nhỏ nhất trong cây con phải.                    
             Tree leftMostNode = findLeftMostNode(root.right);
        //Gán giá trị của leftMostNode cho giá trị của nút cần xóa. 
                    root.val = leftMostNode.val;
                    //xóa nút có giá trị leftMostNode khỏi cây con phải.
                    root.right = deleteTreeNode(root.right, leftMostNode.val);
                
                }
            }
            //Phương thức này trả về cây sau khi đã xóa nút có giá trị key.
            return root;
        }

        public Tree findLeftMostNode(Tree root) {
            if (root == null) {
                return null;
            }
            //trả về nút có giá trị nhỏ nhất trong cây.

            Tree leftMostNode = root;

            while (leftMostNode.left != null) {
                leftMostNode = leftMostNode.left;
            }

            return leftMostNode;
        }
        public int searchBST(Tree root, int key){
            if(root ==null){
                return -1;
            }
            if(key< root.val){
                return searchBST(root.left, key);
            }
            else if(key> root.val){
                return searchBST(root.right, key);
            } else{
                return root.val;
            }
        }
        // in ra cây BST theo thứ tự tăng dần. 
        //Nó sử dụng kỹ thuật duyệt cây trung thứ tự (in-order traversal).
        void printinoder(Tree node) {
            if (node != null) {
                printinoder(node.left);
                System.out.print(node.val + " ");
                printinoder(node.right);
            }
        }
        void preOrder(Tree root)
        {
            if (root != null) {
                System.out.print(root.val + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }
            // Function to do postorder traversal of BST
     void postOrder(Tree root)
    {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.val);
        }
    }
    //Truyền tải thứ tự cấp độ : Truyền tải thứ tự cấp độ của BST là truyền tải thứ tự theo chiều rộng đầu tiên của cây. Nó truy cập tất cả các nút ở một cấp độ cụ thể trước khi chuyển sang cấp độ tiếp theo.
       
         int height(Tree node)
        {
            if (node == null)
                return 0;
            else {
    
                // Compute the depth of each subtree
                int lDepth = height(node.left);
                int rDepth = height(node.right);
    
                // Use the larger one
                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }
    
        // Print nodes at a given level
         void printGivenLevel(Tree root, int level)
        {
            if (root == null)
                return;
            if (level == 1)
                System.out.print(" " + root.val);
            else if (level > 1) {
    
                // Recursive Call
                printGivenLevel(root.left, level - 1);
                printGivenLevel(root.right, level - 1);
            }
        }
    
        // Function to line by line print
        // level order traversal a tree
         void printLevelOrder(Tree root)
        {
            int h = height(root);
            int i;
            for (i = 1; i <= h; i++) {
                printGivenLevel(root, i);
                System.out.println();
            }
        }
    void printLeafNodes(Tree root)
    {
        // If node is null, return
        if (root == null)
            return;
  
        // If node is leaf node,
        // print its data
        if (root.left == null && root.right == null) {
            System.out.print(" " + root.val);
            return;
        }
  
        // If left child exists,
        // check for leaf recursively
        if (root.left != null)
            printLeafNodes(root.left);
  
        // If right child exists,
        // check for leaf recursively
        if (root.right != null)
            printLeafNodes(root.right);
    }
     void printNonLeafNode(Tree root)
    {
        // Base Cases
        if (root == null
            || (root.left == null && root.right == null))
            return;
  
        // If current node is non-leaf,
        if (root.left != null || root.right != null) {
            System.out.print(" " + root.val);
        }
  
        // If root is Not NULL and its one
        // of its child is also not NULL
        printNonLeafNode(root.left);
        printNonLeafNode(root.right);
    }
    void rightViewUtil(Tree root, int level,
                              int max_level)
    {
        // Base Case
        if (root == null)
            return;
  
        // If this is the last Node of its level
        if (max_level < level) {
            System.out.print(" " + root.val);
            max_level = level;
        }
  
        // Recur for right subtree
  
        rightViewUtil(root.right, level + 1, max_level);
    }
  
    // Wrapper over rightViewUtil()
     void rightView(Tree root)
    {
        int max_level = 0;
        rightViewUtil(root, 1, max_level);
    }
  
  
        // Driver Code
    // sử dụng chiều cao của các cây con bên trái và bên phải của nút và gán chiều cao cho nút bằng chiều cao tối đa của hai nút con cộng với 1.   
      Tree minValueNode(Tree node)
    {
        Tree current = node;
  
        // Loop down to find the leftmost leaf
        while (current != null && current.left != null)
            current = current.left;
  
        return current;
    }
  
    // Function that deletes the key and
    // returns the new root
    Tree deleteNode(Tree root, int key)
    {
        // base Case
        if (root == null)
            return root;
  
        // If the key to be deleted is
        // smaller than the root's key,
        // then it lies in left subtree
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
  
        // If the key to be deleted is
        // greater than the root's key,
        // then it lies in right subtree
        else if (key > root.val) {
  
            root.right = deleteNode(root.right, key);
        }
  
        // If key is same as root's key,
        // then this is the node
        // to be deleted
        else {
  
            // Node with only one child
            // or no child
            if (root.left == null) {
                Tree temp = root.right;
                return temp;
            }
            else if (root.right == null) {
                Tree temp = root.left;
                return temp;
            }
  
            // Node with two children:
            // Get the inorder successor(smallest
            // in the right subtree)
           Tree temp = minValueNode(root.right);
  
            // Copy the inorder successor's
            // content to this node
            root.val = temp.val;
  
            // Delete the inorder successor
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }
    //tổng số nút trong BST.
   int nodeCount(Tree node)
    {
        if (node == null)
            return 0;
  
        else
            return nodeCount(node.left)
                + nodeCount(node.right) + 1;
    }
    boolean isLeaft(Tree node){
        return node.left ==null &&node.right ==null;
    }
    boolean duyet(Tree currentNode, int curSum, int targetSum){
        if(currentNode ==null)return false;
        curSum+= currentNode.val;
        if(isLeaft(currentNode)==true){
            return curSum== targetSum;
        }
        boolean kqLeft =  duyet(currentNode.left, curSum, targetSum);
        boolean kqRight = duyet(currentNode.right, curSum, targetSum);
        return kqLeft || kqRight;
    }
    public boolean hasPathSum(Tree root, int targetSum){
        return duyet(root, 0, targetSum);
    }
    void printRoot() {
            if (mRoot != null) {
                System.out.println("Gia tri :: " + mRoot.val);
            } else {
                System.out.println("Cây rỗng, không có gốc.");
            }
        }
    }
    //Độ phức tạp về thời gian: O(N), trong đó N là số nút của 
    //Không gian phụ BST: O(1) 
    public static void main(String[] args) {
        BST newTree = new BST();
        MyBST myBST = newTree.new MyBST();
        // myBST.mRoot = myBST.insert(myBST.mRoot,5);
        // myBST.mRoot = myBST.insert(myBST.mRoot,1);
        // myBST.mRoot = myBST.insert(myBST.mRoot,6);
        // myBST.mRoot = myBST.insert(myBST.mRoot,0);
        // myBST.mRoot = myBST.insert(myBST.mRoot,3);
        // myBST.mRoot = myBST.insert(myBST.mRoot,7);
        // myBST.mRoot = myBST.insert(myBST.mRoot,2);

        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 5);
        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 1);
        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 6);
        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 0);
        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 3);
        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 7);
        myBST.mRoot = myBST.insertrecu(myBST.mRoot, 2);

        myBST.printinoder(myBST.mRoot);
        System.out.println();
        myBST.printRoot();
        System.out.println();

        myBST.mRoot = myBST.deleteTreeNode(myBST.mRoot, 2);
        System.out.println("Sau khi khoa node 2");
        myBST.printinoder(myBST.mRoot);
        myBST.printRoot();
        System.out.println("\n Search: = "+myBST.searchBST(myBST.mRoot, 7));
        myBST.preOrder(myBST.mRoot);
        System.out.println();
        myBST.printGivenLevel(myBST.mRoot, 0);
        System.out.println();
        myBST.printLevelOrder(myBST.mRoot);
         System.out.println();
        myBST.printLeafNodes(myBST.mRoot);
         System.out.println();
        myBST.printNonLeafNode(myBST.mRoot);
        System.out.println("-----");
        myBST.rightView(myBST.mRoot);
        System.out.println("\n height: "+myBST.height(myBST.mRoot));
        Tree root = myBST.deleteNode(myBST.mRoot, 2);
        myBST.printinoder(myBST.mRoot);
         System.out.println("\n Gia tri nho nhat là: ");
         System.out.println(myBST.minValueNode(myBST.mRoot));
        System.out.println("\n Tong so nut:"+ myBST.nodeCount(myBST.mRoot));
        myBST.printinoder(myBST.mRoot);
        System.out.println();
        System.out.println("duyet: "+ myBST.duyet(myBST.mRoot,1, 19));
        
    }
}

// package OntapCTDL.tree;

// public class BST {
//     class Tree {
//         public int val;// đại diện cho mỗi nút trong cây
//         public Tree left;
//         public Tree right;

//         public Tree(int val) {// constructor để khởi tạo mỗi nút
//             this.val = val;
//         }
//     }

//     class MyBST {
//         private Tree mRoot;// nút gốc

//         public MyBST() {

//         }

//         public Tree insertrecu(Tree rootnode, int value) {//root là nút gốc, value là giá trị caanf thêm vào
//             if (rootnode == null) {// cây rỗng
//                 rootnode = new Tree(value);
//             } else {
//                 if (value < rootnode.val) {
//                     rootnode.left = insertrecu(rootnode.left, value);
//                 } else {
//                     rootnode.right = insertrecu(rootnode.right, value);
//                 }
//             }
//             return rootnode;
//         }

//         void print(Tree node) {
//             if (node != null) {
//                 print(node.left);
//                 System.out.print(node.val + " ");
//                 print(node.right);
//             }
//         }

//         void printRoot() {
//             if (mRoot != null) {
//                 System.out.println("Gia tri : " + mRoot.val);
//             } else {
//                 System.out.println("Cây rỗng, không có gốc.");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         BST newTree = new BST();
//         MyBST myBST = newTree.new MyBST();

//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 5);
//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 1);
//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 6);
//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 0);
//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 3);
//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 7);
//         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 2);

//         myBST.print(myBST.mRoot);
//         System.out.println();
//         myBST.printRoot();
//     }
// }

// // package OntapCTDL.tree;
// // import java.io.PrintStream;
// // import java.io.UnsupportedEncodingException;
// // public class BST {
// //     class Tree {// đại diện cho mỗi nút trong cây
// //         public int val;
// //         public Tree left;
// //         public Tree right;
// //         public Tree(int val){ // constructor để khởi tạo mỗi nút
// //             this.val = val;
// //         }
// //     }
// //     class MyBST{

// //         private Tree mRoot; // nút gốc
// //         public MyBST(){
            
// //         }
// //         public Tree insert(Tree root, int value){ //root là nút gốc, value là giá trị caanf thêm vào
// //             //TH1 
// //             Tree newNode= new Tree(value);
// //             if(root == null){ // cây rỗng
// //                 root = new Tree(value);

// //             }else{
// //                 //xet xem nen di trai hay phai
// //                 Tree temp  = root; // dich chuyen temp den nut can tim
// //                 while(true){
// //                     if(value > temp.val){// giá trị mới > giá trị temp thì check
// //                         if(temp.right ==null){ // nếu null thì gắn luôn cho no 
// //                             temp.right = newNode;//án nút con phải của temp bằng nút mới
// //                             break;
// //                         }else{
// //                             temp = temp.right; // tiếp tục vòng lặp để di chuyển xuống cây.
// //                         }

// //                     }
// //                     else if(value < temp.val){
// //                         if(temp.left ==null){
// //                             temp.left = newNode;
// //                             break;
// //                         }else {
// //                         temp = temp.left;
// //                         }
// //                     }
// //                     // nghĩa là nó sẽ két thúc lặp khi gặp trái hoặc phải null
// //                 }
// //                 return root;
// //             }
// //             return root;
            
// //         }
// //         //C2: su dụng đệ quy:
// //         public Tree insertrecu(Tree rootnode, int value){
// //             if(rootnode ==null){
// //                 rootnode = new Tree(value);
// //             }
// //             if(value < rootnode.val){
// //                 if(rootnode.left == null){
// //                     rootnode.left = new Tree(value);
// //                 }
// //                 else{
// //                      //nho hon thi dich trai
// //                 insertrecu(rootnode.left, value);
// //                 }
// //             }
// //             else{
// //                 //truoc khi nhay sang ben phai thi kiem tra ben phai co cay khong
// //                 if(rootnode.right == null){
// //                     rootnode.right = new Tree(value);
// //                 }
// //                 else {
// //                 insertrecu(rootnode.right, value);
// //                 }
// //             }
// //             return rootnode;
// //         }
// //         // xoa node key trong cay root
// //         // return cay moi da duoc xoa node
// //         // public Tree deleteTreeNode(Tree root, int key){
// //         //     if(root == null){
// //         //         return null;
// //         //     }
// //         //     // tìm node xóa
// //         //     if(key<root.val){  //  // kết quả thay đổi, nối cha với con của node đã xóa 
// //         //         root.left =  deleteTreeNode(root.left, key);
// //         //     }
// //         //     else if(key >root.val){
// //         //         // kết quả thay đổi, nối cha với con của node đã xóa 
// //         //         root.right = deleteTreeNode(root.right, key);
// //         //     }
// //         //     else{  // root.val ==key // xác định node xóa
// //         //         //TH1: root là node
// //         //         if(root.left ==null & root.right ==null){
// //         //             return null;
// //         //         }
// //         //         //TH2: co 1 con 
// //         //         if(root.left!= null && root.right != null){
// //         //             return root.left;
// //         //         }
// //         //         if(root.left ==null&& root.right!= null){
// //         //             return root.right;
// //         //         }
// //         //         //TH2: cẩ 2 co
// //         //         // tim node trai cung cay con  phen phai
// //         //         Tree leftMostNode = findLefeMostNode(root.right);
// //         //         root.val = leftMostNode.val;
// //         //         root.right = deleteTreeNode(root.right, leftMostNode.val);
                
// //         //         // if(root.left != null && root){

// //         //         // }
             
// //         //     }
// //         //     return root;
// //         // }
// //         // // tim node con trai cung
// //         // public Tree findLefeMostNode(Tree root){
// //         //     if(root == null) return null;
// //         //     Tree leftMostNode = root;
            
// //         //     while(leftMostNode.left != null){
// //         //         leftMostNode = leftMostNode.left;
// //         //     }
// //         //     return leftMostNode;
// //         // }
// //         public Tree deleteTreeNode(Tree root, int key) {
// //             if (root == null) {
// //                 return null;
// //             }

// //             if (key < root.val) {
// //                 root.left = deleteTreeNode(root.left, key);
// //             } else if (key > root.val) {
// //                 root.right = deleteTreeNode(root.right, key);
// //             } else {
// //                 if (root.left == null && root.right == null) {
// //                     return null;
// //                 } else if (root.left == null) {
// //                     return root.right;
// //                 } else if (root.right == null) {
// //                     return root.left;
// //                 } else {
// //                     Tree leftMostNode = findLeftMostNode(root.right);
// //                     root.val = leftMostNode.val;
// //                     root.right = deleteTreeNode(root.right, leftMostNode.val);
// //                 }
// //             }

// //             return root;
// //         }

// //         public Tree findLeftMostNode(Tree root) {
// //             if (root == null) {
// //                 return null;
// //             }

// //             Tree leftMostNode = root;

// //             while (leftMostNode.left != null) {
// //                 leftMostNode = leftMostNode.left;
// //             }

// //             return leftMostNode;
// //         }
        
// //         // in ra cây BST theo thứ tự tăng dần. 
// //         //Nó sử dụng kỹ thuật duyệt cây trung thứ tự (in-order traversal).
// //         void print(Tree node) {
// //             if (node != null) {
// //                 print(node.left);
// //                 System.out.print(node.val + " ");
// //                 print(node.right);
// //             }
// //         }
        
// //         void printRoot() {
// //             if (mRoot != null) {
// //                 System.out.println("Gia tri : " + mRoot.val);
// //             } else {
// //                 System.out.println("Cây rỗng, không có gốc.");
// //             }
// //         }
// //     }
// //     public static void main(String[] args) {
// //         BST newTree = new BST();
// //         MyBST myBST = newTree.new MyBST();
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,5);
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,1);
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,6);
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,0);
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,3);
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,7);
// //         // myBST.mRoot = myBST.insert(myBST.mRoot,2);

// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 5);
// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 1);
// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 6);
// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 0);
// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 3);
// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 7);
// //         myBST.mRoot = myBST.insertrecu(myBST.mRoot, 2);

// //         myBST.print(myBST.mRoot);
// //         System.out.println();
// //         myBST.printRoot();
// //         System.out.println();

// //         // myBST.mRoot = myBST.deleteTreeNode(myBST.mRoot, 3);

// //         // myBST.print(myBST.mRoot);
// //         // myBST.printRoot();
// //     }
// // }
