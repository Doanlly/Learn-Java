package OntapCTDL.Stack;

public class learnAStack {
    // khai bao lop Node laf  lop con long nhau(nested class) de dai dien cho mot node trong Stack. 
    private class Node{
        int data ;
        Node next; // luu tru tham chieu den Node tiep theo trong Stack
        // để khởi tạo node 
        public  Node(int daa){ // constructer
            data = daa;
            next = null;
            
        }
    } 
    Node top; // Node dau tien trong danh sach
    private int size ;// tang kick co Stack
    class Stack{
        private Node top;
        public Stack(){
            // constructor de khoi tao voi top ban dau la null, zize = 0;
            top = null;
            size = 0;
        }
        // them 1 pt vao Stack
        void push(int data){
            Node newNode = new Node(data); // node moi dc the data
            if(top ==null){ // check xem co rong ko, neu rong thi gan luon newNode
                top = newNode;
            }
            else{
                newNode.next = top;// next cua Node moi duoc tro den top, 
                top = newNode;// top gan lai gai tri cua newNode de cap nhat Top moi , 
            }
            size++;
        }
        void pop(){
            if(top ==null){// check xem top co null khong
                return;
            }
            int popelement = top.data; // luu gia tri o dinh stack
            top = top.next;// gan top dc cap nhat den node tiep theo
            //top.data = pop.data;
            size --; 
        }
        //Độ phức tạp về thời gian: O(1), cho tất cả các thao tác đẩy(), pop() và peek(), vì chúng không thực hiện bất kỳ loại duyệt nào trên danh sách. Chúng tôi
        // thực hiện tất cả các hoạt động chỉ thông qua con trỏ hiện tại.
        //Không gian phụ trợ: O(N), trong đó N là kích thước của ngăn xếp
        void top(){
            System.out.println(top.data);
        }
        public boolean isEmpty(){
            return(size!= 0); // check for empty stack
        }
        public void printStack(){
            if(size == 0){
                System.out.println("Stack rong");
            }
            System.out.print("Stack: ");
            Node current = top;
            while(current!= null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("Ôn tập Stack");
        learnAStack learSt = new learnAStack();
        Stack st = learSt.new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.printStack();
        st.pop();
        st.printStack();
        st.top();
    }

}
