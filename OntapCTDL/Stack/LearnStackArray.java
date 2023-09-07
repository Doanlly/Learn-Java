package OntapCTDL.Stack;
import java.util.Arrays;
public class LearnStackArray {
   
        private int maxSize;
        private int[] stackArray;
        private int top;
    public void ArrayStack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top  = -1;
    }
    void push(int data){
        if(top >= maxSize-1){// check xem top da tran chua
            return;
        }
        top++;//tang gia tri cua bien top len 1 va gan gia tri them vao tuong ung cho no
        stackArray[top] = data;
        
    }
    void pop(){
        if(top ==-1){ // neu top khong ton tai
            return;
        }
        int savedatatop = top; //luu gia tri top
        top --; // giam top


    }
    void top(){
        if(top ==-1){
            return;
        }
        System.out.println("top: "+ stackArray[top]);
    }
    void getcount(){
        int a = top+1;
        System.out.println("Stack hien co "+ a +" phan tu");
    }
    void clear(){
        top =-1;
        System.out.println("Stack đa xóa");
    }
    int[] toArray(){
        return Arrays.copyOfRange(stackArray, 0, top+1);
    }
    void search(int element){
        if(top == -1){
        return;
        }
        int count = 0;
        if(element<=top){
            System.out.println("phan tu can tim"+ stackArray[element]);
        }
        // for(int i = 0 ; i< top;i++){
        //     // if(stackArray[i]== stackArray[element]){
        //     //     System.out.println(stackArray[]);
        //     // }
        //     if(element<top){
        //         sy
        //     }
        // }

    }
    void print(){
        if (top == -1) {
            System.out.println("Stack trong");
            return;
        }
        for(int i = 0; i<= top;i++){
            System.out.print(stackArray[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        LearnStackArray learnarrayst = new LearnStackArray();
        learnarrayst.ArrayStack(5);
        learnarrayst.push(2);
        learnarrayst.push(3);
        learnarrayst.push(4);
        learnarrayst.push(6);
        learnarrayst.top();
        learnarrayst.print();
        learnarrayst.pop();
        learnarrayst.top();
        learnarrayst.print();
        learnarrayst.getcount();
        System.out.println("chuyen dang array: "+ learnarrayst.toArray());
        learnarrayst.search(2);
        learnarrayst.print();
        learnarrayst.clear();

    }
}
