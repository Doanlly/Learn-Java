package OntapCTDL.Queue;

import javax.print.attribute.Size2DSyntax;

/**
 * learnQueue
 */
public class learnQueue {
    class Queue{
        private int maxsize;//kích thước tối đa của hàng đợi
        private int[] arrayque;//Mảng lưu trữ các phần tử trong hàng đợi
        private int fron, rear;//vi tri dau, cuoi cua hang doi
        private int currenSize;// so luong phan tu hien tai trong hang doi
        
        public Queue(int size){
            maxsize = size;
            arrayque =  new int [maxsize-1];
            fron = 0;
            rear = -1;
            currenSize = 0;
        }
        public boolean isEmpty(){
            return (currenSize ==0);
        }
        public boolean isfull(){
            return (currenSize == maxsize);
        }
        public void enqueue(int data){
            if(isfull()){
                System.out.println("Hang doi da day");
                return;
            }
            rear = (rear+1)% maxsize; // Phép % được sử dụng để tính toán phần dư khi thực hiện phép chia. Trong trường hợp này, nếu rear có giá trị là 3 và maxSize có giá trị là 8, phép (rear + 1) % maxSize sẽ trả về giá trị 4, không phải là 0.
        // đảm bảo rằng phần tử mới sẽ chèn vào  một cách liên tục mà không bị vượt quá và đảm bảo tính chất của hàng đợi hình tròn.
            arrayque[rear] = data;
            currenSize+=1;
            System.out.println("Them " + data + " vao han doi.");
      }    
      public void dequeue(){
        if(isEmpty()){
            System.out.println("Hang doi rong");
            return;
        }
        int data = arrayque[fron];
        fron  = (fron+1) % maxsize;
        currenSize --;
        System.out.println("Da lay phan tu " + data + " tu hang doi");
      }
      public void peek(){
        if(isEmpty()){
            System.out.println("Hang doi rong");
            return ;
        }
        System.out.println("Phan tu dau tien"+ arrayque[fron]);
      }
      public void print(){
        // System.out.print("Hang doi :  ");
        // for(int i = 0;i<maxsize-1;i++){
        //     System.out.print(arrayque[i]+" ");
        // }
        // System.out.println();
        if (isEmpty()) {
            System.out.println("Hàng đợi trống.");
            return;
        }
        System.out.print("Hàng đợi: ");
        int index = fron;
        for (int i = 0; i < currenSize; i++) {
            System.out.print(arrayque[index] + " ");
            index = (index + 1) % maxsize;
        }
        System.out.println();
      }
      //0(1)
    }
    public static void main(String[] args) {
        learnQueue learn = new learnQueue();
        Queue que = learn.new Queue(6);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.print();
        que.dequeue();
        que.print();
        que.enqueue(4);
        que.peek();
        que.print();
    }
}