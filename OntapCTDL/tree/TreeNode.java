package OntapCTDL.tree;

public class TreeNode {
    class Tree {
    public int val;
    public Tree left;
    public Tree right;
    public Tree(int val){
        this.val = val;
    }
}
    //BinarySearchTree......do cây trái bé hơn phải
    class MybinarTree{
        private Tree root;// quản lý node bên trong
        public MybinarTree(){

        }
        public void init(){
            Tree n0 = new Tree(0);
            Tree n1 = new Tree(1);
            Tree n2 = new Tree(2);
            Tree n3 = new Tree(3);
            Tree n4 = new Tree(4);
            Tree n5 = new Tree(5);
            n0.left = n1;n0.right = n2;
            n1.left = n3;n1.left = n4;
            n2.right = n5;
            // khởi tạo 1 cây thành công
            root = n0;
        }
    }
   

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
       MybinarTree mytree = tree.new MybinarTree();
       mytree.init();
    }
}
