package OntapCTDL.LinkedList;

import javax.xml.crypto.Data;

public class linkedlisttest {
    class Node{
        int data;
        Node next;
        Node(int dat){
            data = dat;
            next = null;
        }
    }
    Node head;
    public void printList(){
        
        Node n = head;
        System.out.println("cách 2: xác định vị trí: -");
        while(n!= null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
    }
    class SinglelinedList{
        
        int data;
        public  Node head = null;
        // SinglelinedList(){
        //     head = null;
        // }
        void add_node(int dad){
            data = dad;
            Node next_node = new Node(data);
            next_node.next = head ;
            head = next_node;
            //độ phức tạp: 0(1)
        }
        void insert_after(int data, Node prev_node){
            //do phuc tap thời gian0(k)
            if(prev_node == null){
                System.out.println("hinh nhu Node da cho truoc do rong");
                return;
            }
            //2,3 :phân bổ và nhập dữ liệu
            Node new_node=  new Node(data);
            //Tạo nút tiếp theo của nút mới làm nút tiếp theo của prev_node
            new_node.next = prev_node.next;
            //đặt tiếp theo của prev_node thành new_node
            prev_node.next = new_node;
        }
        //cách 2
        void insert_after2(int key, int data){
            Node n =  new Node(data);
            if(key == head.data){
                n.next = head.next;
                head.next= n;
                return;
            }
            Node temp = head;
            while(temp.data!= key){
                temp = temp.next;
                if(temp ==null){
                    return;
                }
            }
            n.next = temp.next;
            temp.next = n;
        }
        public void inser_end(int data){
            //độ phức tạp thời gian0(n)
            Node new_node = new Node(data);
            // nếu trống thì đặt nút mới làm đầu
            if(head ==null ){
                head = new Node(data);
                return;
            }
            // xác định khi thêm cuỗi thì node kế  sẽ  = null
            new_node.next = null;
            // tạo và tạo vòng lặp tìm node cuối
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
            return;
        }
        // tìm độ dài của linkedlist
        int findlength(){
            int count = 0 ; 
            Node curent = head;
            if(head ==null){
                return count = 0;
            }
            while(curent !=null){
                count = count+1;
                int d = curent.data;
                curent=  curent.next;
                
                System.out.print(d+"-");
            
            }
            System.out.println();
            
            return count;
        }
         boolean elementfind(int dat){
            boolean check = false;
            Node current = head;
            while(current !=null){
                if(current.data == dat){
                    check = true;
                   
                
                }
                current = current.next;
                 
                
            }
            return check;
            // Time Complexity: O(N), Where N is the number of nodes in the LinkedList
            // Auxiliary Space: O(1)
        }
        //cách 2 sử dụng đệ quy
        boolean findelement2(Node head, int x){
            if(head ==null){
                return false;
            }
            if(head.data == x){
                return true;
            }
            return findelement2(head.next, x);
        }

        void deletelistbegin(){
            Node temp = head;
            if(head == null){
                return;
            }
            head = head.next;
        }
        void deleteend(){
            if(head ==null){
                return;
            }
            if(head.next==null){
                head = null;
                return ;
            }
            Node current = head;
            
            Node prev = null;
            while(current.next!= null){
                prev = current;// gắn vào nó để tý nó gán đến phàn tử tiếp theo
                current = current.next;
            }
            prev.next = null; // xóa liên kết tới phần tử cuối cùng
        }
        void deleteintK(int k){
            if(head ==null){
                return;
            }
             
            if (k == 0) {
                head = head; // Xóa phần tử đầu tiên
                return;
            }
            if(k==1){
                head = head.next;// xóa phàn tử đàu tiền
                return;
            }
            Node prev = head;
            int count = 0;
            
            while(count<k-1&& prev.next!= null){
                prev = prev.next;
                count++;
                
            }
            if(prev.next ==null && prev.next.next==null){
                return;
            }
            Node current = prev.next;
            prev.next = current.next; //// Xóa phần tử tại vị trí thứ k
            current.next = null; //// Giải phóng bộ nhớ của nút bị xóa
        }
        void delete(Node x){
            // nay la xoa dau
            x = head;
            head = head.next;
            x = null;
        }
        void deleteend2(){
            Node temp = head;
            while (temp.next.next != null) {
            temp = temp.next;
            }
            temp.next = null;
        }
      void deleteList(){head = null;}// xoas toan bo linkedlist
    //Viết một hàm GetNth() lấy một danh sách được liên kết và một chỉ mục số nguyên
    // rồi trả về giá trị dữ liệu được lưu trữ trong nút tại vị trí chỉ mục đó.
        void valdata(int index){
//             Time Complexity: O(n)
// Auxiliary Space: O(1) space created for variables
            int count = 1;
            Node current = head;
            if(current ==null){
                return;
            }
            int data = 0;
            while(current != null ){
                if(count == index){
                    data = current.data;
                }
                count ++;
                current =  current.next;
                
            }
            System.out.println("\n data = " + data);
        }
} //còn cách khác là dùng đệ quy nhưng đệ quy node, nếu head ko null thì trả về 1+ getvcount(head->next)
    //Không gian phụ trợ: O(1)

    public static void main(String[] args) {
        linkedlisttest linkedlisttest = new linkedlisttest();
        SinglelinedList linkedlist = linkedlisttest.new SinglelinedList();
        linkedlist.add_node(10);
        linkedlist.add_node(12);
        linkedlist.add_node(14);
        
        /// cách 2:
        linkedlisttest test2 = new linkedlisttest();
        test2.head = test2.new Node(1);
        Node secon = test2.new Node(2);
        Node third = test2.new Node(3);
        test2.head.next = secon;
        test2.head.next.next= third;
        test2.printList();
        linkedlist.insert_after(15,linkedlist.head.next);
        linkedlist.insert_after2(12,20);
        linkedlist.inser_end(30); 
        
        System.out.println();
         Node printNode = linkedlist.head;
        while(printNode!= null){
            System.out.print(printNode.data+ "->");
            printNode = printNode.next;
        }
        // Độ phức tạp về thời gian: O(N), Trong đó N là kích thước của danh sách liên kết

        // Không gian phụ trợ: O(1), Vì không gian bổ sung không đổi được sử dụng.
        System.out.println("_______");
        System.out.println(linkedlist.findlength());
        int findata = 21;
        //linkedlist.elementfind(findata);
        if(linkedlist.elementfind(findata)== true){
            System.out.println(findata+ " có trong list");
        }else{
            System.out.println(findata+" không có trong list");
        }

        if(linkedlist.findelement2(linkedlist.head,findata)== true){
            System.out.println(findata+ " có trong list");
        }else{
            System.out.println(findata+" không có trong list");
        }
        linkedlist.deletelistbegin();

        System.out.println("Sau khi xóa:");
         Node printNode1 = linkedlist.head;
        while(printNode1!= null){
            System.out.print(printNode1.data+ "->");
            printNode1 = printNode1.next;
        }
        linkedlist.deleteend();
        Node printNode12 = linkedlist.head;
        System.out.println("\n Sau khi xóa cuoi:");
        // Node printNode1 = linkedlist.head;
       while(printNode12!= null){
           System.out.print(printNode12.data+ "->");
           printNode12 = printNode12.next;
       }
       
       int aa =1;
        //linkedlist.deleteintK(aa);
        linkedlist.delete(linkedlist.head);
        linkedlist.deleteintK(aa);
        
        Node printNode13 = linkedlist.head;
        
        System.out.println("\n Sau khi xóa o vi trí thu"+ aa+ ": ");
        while(printNode13!= null){
            System.out.print(printNode13.data+ "->");
            printNode13 = printNode13.next;
        }
         
        linkedlist.deleteend2();
        Node printNode131 = linkedlist.head;
        
        System.out.println("\n Sau khi xóa cuoi cach 2: ");
        while(printNode131!= null){
            System.out.print(printNode131.data+ "->");
            printNode131 = printNode131.next;
        }
        linkedlist.add_node(31);
        linkedlist.add_node(32);
        linkedlist.add_node(34);
        linkedlist.add_node(30);
        linkedlist.add_node(34);
        linkedlist.add_node(35);
        Node printNode22 = linkedlist.head;
        
       
        while(printNode22!= null){
            System.out.print(printNode22.data+ "->");
            printNode22 = printNode22.next;
        }
        linkedlist.valdata(2);
        
       
    }
    
}
