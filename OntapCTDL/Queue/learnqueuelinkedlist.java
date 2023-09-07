package OntapCTDL.Queue;

public class learnqueuelinkedlist {
    // Java program for linked-list implementation of queue
    class QNode {
        int key;
        QNode next;
    
        // Constructor để tạo một nút mới trong danh sách liên kết
        public QNode(int key) {
            this.key = key;
            this.next = null;
        }
    }
    
    // Lớp đại diện cho một hàng đợi
    // Biến front lưu trữ nút đầu của danh sách liên kết và biến rear
    // lưu trữ nút cuối của danh sách liên kết
    class Queue {
        QNode front, rear;
    
        public Queue() {
            this.front = this.rear = null;
        }
    
        // Phương thức để thêm một phần tử vào hàng đợi.
        void enqueue(int key) {
            // Tạo một nút mới trong danh sách liên kết
            QNode temp = new QNode(key);
    
            // Nếu hàng đợi rỗng, thì nút mới là đầu và cuối của hàng đợi
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }
    
            // Thêm nút mới vào cuối của hàng đợi và thay đổi rear
            this.rear.next = temp;
            this.rear = temp;
        }
    
        // Phương thức để lấy một phần tử từ hàng đợi.
        void dequeue() {
            // Nếu hàng đợi rỗng, trả về NULL.
            if (this.front == null)
                return;
    
            // Lưu trữ nút đầu hiện tại và di chuyển front sang nút tiếp theo
            QNode temp = this.front;
            this.front = this.front.next;
    
            // Nếu front trở thành NULL, thì cũng thay đổi rear thành NULL
            if (this.front == null)
                this.rear = null;
        }
    
        // Phương thức để in ra hàng đợi
        void printQueue() {
            if (this.front == null) {
                System.out.println("Hàng đợi rỗng.");
                return;
            }
    
            QNode temp = this.front;
            System.out.print("Hàng đợi: ");
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
	{
		learnqueuelinkedlist a = new learnqueuelinkedlist();
        Queue q = a.new Queue();
        q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.printQueue();
		q.dequeue();
		q.dequeue();
		q.printQueue();
	}

}
