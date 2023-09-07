
package binary_search_tree;
import java.util.*;

public class Hw_2 {

    public static void main(String[] args) {
        // Tạo cây nhị phân bất kỳ
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        // Kiểm tra xem cây có là cây tìm kiếm nhị phân hay không
        if (isBST(root)) {
            System.out.println("Đây là cây nhị phân");
        } else {
            System.out.println("Không phải cây nhị phân");
        }
    }

    public static boolean isBST(Node root) {
        // Kiểm tra trường hợp cơ sở khi gặp nút rỗng
        if (root == null) {
            return true;
        }

        // Lấy danh sách các phần tử trong cây theo thứ tự in-order
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);

        // Kiểm tra xem danh sách đã lấy có đúng là một dãy tăng dần hay không
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }

        // Nếu không có phần tử nào bị lỗi thì cây là cây tìm kiếm nhị phân
        return true;
    }

    public static void inorderTraversal(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
}
