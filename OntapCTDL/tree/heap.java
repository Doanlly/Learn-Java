package OntapCTDL.tree;


public class heap {
    private int MAX_SIZE = 100;
    private int[]arr = new int[MAX_SIZE+1];
    private int size;
    heap(){
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int peek(){
        if(isEmpty()){
           System.out.println("Heap is EMPLTY");
           return -1;
        }
        return arr[1];
    }
    void swap(int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    void add(int data){
        // them vao tree o vi tri cuoi cung dam bao cay hoan chinh
        // dam bao la cay head chua,
        // so sanhs cha, neeus cha lon hon thi doi cho, tiep tuc nhu vay
        size++;
        
        arr[size] = data;
        //heapify up: duoiws leen
        int currenIndex  = size;
        int parrentIndex = size /2;
        while(parrentIndex!= 0&& arr[currenIndex]<arr[parrentIndex]){
            //doi cho
            swap(currenIndex, parrentIndex);
            currenIndex = parrentIndex;
            parrentIndex = currenIndex/2;
        }
        System.out.println("ar[0]+ "+ arr[0]);
    }
    int poll(){ // xoa node
        //heapifydownn
        // if(isEmpty()){
        //     return -1;
        // }
        int min = arr[1];
        //heapify down
        arr[1] = arr[size];

        size --;
        
        heapiyDown(1);

        return min;
    }
    private void heapiyDown(int currentIndex) {
              
       
        while(2*currentIndex<= size){
            int leftChildIndex = 2*currentIndex;
            int smallChildIndex = leftChildIndex;
            int rightChidIndex = leftChildIndex+1;
            if(rightChidIndex<= size && arr[rightChidIndex] < arr[leftChildIndex]){
                smallChildIndex = rightChidIndex;
            }
            if (arr[currentIndex]> arr[smallChildIndex]){
                swap(currentIndex, smallChildIndex);
                currentIndex = smallChildIndex;

            }
            else{
                //ok
                break;
            }
        } 
    }
    void remove(int v){
        int currIndex = -1;
        for(int i = 1;i<= size ; i++){
            if(arr[i] ==v){
                currIndex = i;
                break;
            }
        }
        if(currIndex ==-1){
            System.out.println("error");
            return;
        }
        arr[currIndex] = arr[size];
        size--;
        heapiyDown(currIndex);
    }
    public static void main(String[] args) {
        heap  myheap = new heap();
        myheap.add(10);
        myheap.add(5);
        myheap.add(1);
        myheap.add(6);
        
        while(myheap.isEmpty()== false){
            System.out.println(myheap.poll());
        }
        System.out.println("peek= "+ myheap.peek());//1
        myheap.remove(1);
        System.out.println("peek= "+ myheap.peek());//5
        myheap.remove(6);
       
        while(myheap.isEmpty()== false){
            System.out.println(myheap.poll());
        }
    }
}
