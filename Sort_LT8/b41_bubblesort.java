import java.util.Scanner;

public class b41_bubblesort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        bubbleSort(arr);
        
       
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
