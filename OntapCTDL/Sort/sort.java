package OntapCTDL.Sort;

public class sort {
    class SortterBubble{
        public void sort(int []arr){
            int length = arr.length;
            int i,j,temp;
            boolean swap;
            for( i  = 0 ; i< length-1; i++){
                swap = false;
                for(j = 0 ; j< length-i-1;j++){
                    if(arr[j]> arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swap =true;
                    }
                }
                //// Nếu không có 2 phần tử
                 // hoán đổi bởi vòng lặp bên trong, sau đó ngắt
                if(swap == false)
                    break; // dung lai khi sort xong
            }
            //Độ phức tạp thời gian: O(N 2 )
            //Không gian phụ: O(1)
        }
        void insertionSort(int arr[]){
            int n = arr.length;
            for(int i = 1; i<n;i++){
                // chen a[i] vao day a->i-1
                int ai = arr[i];
                int j = i-1;
                while(j>=0 && arr[j]>ai){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = ai;
            }
        }
            void sortselect(int arr[])
            {
                int n = arr.length;
        
                // One by one move boundary of unsorted subarray
                for (int i = 0; i < n-1; i++)
                {
                    // Find the minimum element in unsorted array
                    int min_idx = i;
                    for (int j = i+1; j < n; j++)
                        if (arr[j] < arr[min_idx])
                            min_idx = j;
        
                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        void printArr(int arr[]){
            int size = arr.length;
            for(int i =0 ; i<  size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();;
        }
    }
    public static void main(String[] args) {
        sort bbs = new sort();
        SortterBubble stt = bbs.new SortterBubble();
        int []arr = {10,3,4,6,2,5,9,8};
        //stt.sort(arr);
        stt.sortselect(arr);
        stt.printArr(arr);
        stt.insertionSort(arr);
         stt.printArr(arr);
        stt.sortselect(arr);
        stt.printArr(arr);
    }
}
