package OntapCTDL.LinkedList;

import org.w3c.dom.Node;

public class linkedlistexam {
    
    Node head;
    class Node{ // dai dien cho 1 nut trong lien ket, gom data va dia chi cua node.
        int data;
        Node next; /// nut tiep theo
        Node(int dat){
            data = dat;
            next = null;
        }
    }
    class SinglyLinkedList{
        Node head;// trỏ đến đầu danh sách liên kết ddonwd, ban đàu = null cho danh sách rỗng
        SinglyLinkedList(){
            head = null;
        }
        void add_node(int data){ // them 1 node moi vao danh sach
            //Đầu tiên, nút mới được tạo với giá trị data và con trỏ next được thiết lập thành null.
            Node new_node = new Node(data);
            //Tiếp theo, con trỏ next của nút mới được thiết lập để trỏ đến nút đầu tiên của danh sách hiện tại.
            new_node.next = head;
            //Cuối cùng, con trỏ head được cập nhật để trỏ đến nút mới, đặt nút mới làm đầu danh sách mới.
            head = new_node;
        }
        //reverser: dảo ngược
        void reverser( ){
            //Độ phức tạp thời gian: O(n)
            //Trong thuật toán, ta duyệt qua từng nút trong danh sách liên kết một lần.
            // Vì vậy, thời gian thực thi của thuật toán phụ thuộc trực tiếp vào số lượng nút trong danh sách liên kết, được ký hiệu là n.
            // Vì vậy, độ phức tạp thời gian của thuật toán là O(n), trong đó n là số lượng nút trong danh sách.
            //             Trong thuật toán, ta chỉ sử dụng một số hằng số biến, bao gồm ba con trỏ prev, current, và next.
            // Việc sử dụng bộ nhớ không tăng theo số lượng nút trong danh sách.
            //khởi tạo 3 con trỏ
            Node prev = null;
            Node current = head;
            Node next  = null;
            while(current!= null){
                //gắn next = current.next để lưu giữ con trỏ tới nút tiếp theo trong danh sách
                next  = current.next;
                //Đảo ngược con trỏ, nút hiện tại trỏ đén nút trước đó
                current.next = prev;
                // cập nhất prev và current để di chuyển sang nút tiếp theo trong danh sách
                prev = current;
                current = next;
            
            } //Sau khi kết thúc vòng lặp, prev trỏ tới nút cuối cùng trong danh sách liên kết đã đảo ngược.
            head = prev;//Cuối cùng, cập nhật con trỏ head để trỏ đến prev, tức là nút đầu danh sách mới sau khi đảo ngược
        }
    }
    public static void main(String[] args) {
        linkedlistexam list = new linkedlistexam();
        SinglyLinkedList singlyLinkedList = list.new SinglyLinkedList();

        singlyLinkedList.add_node(1);
        singlyLinkedList.add_node(3);
        singlyLinkedList.add_node(5);

        System.out.println("Original LinkedList:");
        Node currentNode = singlyLinkedList.head;
        while (currentNode != null) {
            System.out.println("LinkedList: " + currentNode.data);
            currentNode = currentNode.next;
        }

        singlyLinkedList.reverser();

        System.out.println("Reversed LinkedList:");
        Node currentNode1 = singlyLinkedList.head;
        System.out.println(currentNode1.next.data);
        while (currentNode1 != null) {
            System.out.println("LinkedList: " + currentNode1.data);
            currentNode1 = currentNode1.next;
        }
    }
}