package OntapCTDL.Queue;
// Một nút trong danh sách liên kết
class Node {
    int data; // Dữ liệu của nút
    int priority; // Mức độ ưu tiên của nút
    Node next; // Liên kết tới nút tiếp theo

    // Constructor
    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
// Hàng đợi ưu tiên
class PriorityQueue {
    Node front; // Nút đầu hàng đợi
    // Constructor
    public PriorityQueue() {
        this.front = null;
    }
    // Phương thức để thêm một phần tử vào hàng đợi ưu tiên
    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

        // Nếu hàng đợi rỗng hoặc mức độ ưu tiên của phần tử mới lớn hơn phần tử đầu hàng đợi
        if (front == null || priority < front.priority || (priority == front.priority && data > front.data)) {
            newNode.next = front;
            front = newNode;
        } else {
            Node temp = front;
            // Tìm vị trí phù hợp trong danh sách và chèn nút mới vào đó
            while (temp.next != null && (temp.next.priority < priority || (temp.next.priority == priority && temp.next.data <= data))) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        // cách trên thì xếp đc vị trí đầu
        // cách dưới thì xếp theo giá trị
        // if (front == null || priority < front.priority || (priority == front.priority && data > front.data)) {
        //     newNode.next = front;
        //     front = newNode;
        // } else {
        //     Node temp = front;
        //     // Tìm vị trí phù hợp trong danh sách và chèn nút mới vào đó
        //     while (temp.next != null && (temp.next.priority > priority || (temp.next.priority == priority && temp.next.data >= data))) {
        //         temp = temp.next;
        //     }
        //     newNode.next = temp.next;
        //     temp.next = newNode;
        // }
        
        System.out.println("Da them " + data + "");
    }

    public void enqueue1(int data, int priority) {
        Node newNode = new Node(data, priority);
    
        // Nếu hàng đợi rỗng hoặc mức độ ưu tiên của phần tử mới nhỏ hơn mức độ ưu tiên của phần tử đầu hàng đợi
        // hoặc (mức độ ưu tiên và giá trị của phần tử mới lớn hơn phần tử đầu hàng đợi),
        // thì chèn phần tử mới vào đầu hàng đợi
        if (front == null || priority < front.priority || (priority == front.priority && data > front.data)) {
            newNode.next = front;
            front = newNode;
        } else {
            Node temp = front;
            // Tìm vị trí phù hợp trong danh sách và chèn nút mới vào đó.
            // Điều kiện so sánh thêm giá trị của phần tử mới để ưu tiên phần tử có giá trị lớn hơn
            while (temp.next != null && (temp.next.priority > priority || (temp.next.priority == priority && temp.next.data >= data))) {
                temp = temp.next;
            }
            // chèn newNode vào vị trí phù hợp trong danh sách hàng đợi ưu tiên.
            newNode.next = temp.next;
            temp.next = newNode;
        }
    
        System.out.println("Đã thêm " + data + " vào hàng đợi ưu tiên.");
    }
    
    
    // Phương thức để lấy phần tử có mức độ ưu tiên cao nhất khỏi hàng đợi ưu tiên
    public void dequeue() {
        if (front == null) {
            System.out.println("Hang doi trong");
            return;
        }

        int data = front.data;
        front = front.next;
        System.out.println("Da lay: " + data + " ");
    }
    void printQueue() {
        if (this.front == null) {
            System.out.println("Hang doi rong.");
            return;
        }

        Node temp = this.front;
        System.out.print("Hang doi: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Đoạn mã thử nghiệm
public class hangdoiuutien {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.enqueue1(35, 1);
        pq.enqueue1(20, 2);
        pq.enqueue1(30, 2);
        pq.enqueue1(30, 3);
        pq.enqueue1(20, 3);
        pq.enqueue1(40, 1);
        pq.printQueue();
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();
        pq.printQueue();
                // pq.enqueue(10, 2);
        // pq.enqueue(20, 1);
        // pq.enqueue(35, 1);
        // pq.enqueue(20, 2);
        // pq.enqueue(30, 2);
        // pq.enqueue(30, 3);
        // pq.enqueue(40, 1);
    }
}
