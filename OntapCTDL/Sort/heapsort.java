// Chương trình Java thực hiện thuật toán Heap Sort

public class heapsort {
    public void sort(int arr[])
    {
        int N = arr.length;
        //thực hiện heapify cho N/2 phần tử trong mảng, mỗi lần heapify đều có độ phức tạp O(log N).
        // Xây dựng heap (sắp xếp lại mảng)
        //duyệt qua các nút trong mảng từ vị trí cuối cùng có nút con đến vị trí đầu tiên của mảng
        // gọi phương thức heapify để xây dựng cây Heap.
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
        // Lấy từng phần tử một từ heap
        for (int i = N - 1; i > 0; i--) {
            // Di chuyển nút gốc hiện tại đến cuối mảng
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Gọi heapify lại trên heap đã giảm kích thước
            heapify(arr, i, 0);
        }
    }

    // Heapify một cây con với nút gốc là i trong mảng arr[]
    void heapify(int arr[], int N, int i)
    {
        int largest = i; // Khởi tạo largest là nút gốc
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // Nếu con trái lớn hơn nút gốc
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // Nếu con phải lớn hơn largest cho đến nay
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // Nếu largest không phải là nút gốc
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Heapify đệ quy cây con bị ảnh hưởng
            heapify(arr, N, largest);
        }
    }

    /* Hàm tiện ích để in mảng có kích thước n */
    static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Hàm main
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int N = arr.length;

        // Gọi hàm sort để sắp xếp mảng
        heapsort ob = new heapsort();
        ob.sort(arr);

        System.out.println("Sort Array:");
        printArray(arr);
    }
}
