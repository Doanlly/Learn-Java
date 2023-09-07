
public class LinkedLisstSimple {
    public class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;

    public LinkedLisstSimple() {
        this.head = null;
    }

    // Hàm thêm một phần tử vào đầu danh sách liên kết
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Hàm thêm một phần tử vào cuối danh sách liên kết
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Hàm xóa một phần tử từ danh sách liên kết
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data != data) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // Hàm in ra các phần tử trong danh sách liên kết
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedLisstSimple list = new LinkedLisstSimple();

        // Thêm các phần tử vào danh sách liên kết
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);

        // In ra danh sách liên kết
        list.printList();

        // Xóa phần tử có giá trị bằng 2
        list.delete(2);

        // In ra danh sách liên kết sau khi xóa phần tử có giá trị bằng 2
        list.printList();
    }
}
