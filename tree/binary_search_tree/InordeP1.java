
package binary_search_tree;
import java.io.*;
import java.util.*;
class InorderP1{
    static int isRepresentingBST(int arr[], int N) {
        for(int i = 0; i < N - 1; i++) {
            if(arr[i] >= arr[i+1]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the size of the array
        int N = sc.nextInt();

        // Create the array
        int[] arr = new int[N];

        // Enter the elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if the array represents a BST or not
        int result = isRepresentingBST(arr, N);

        if(result == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
              for(int i=0; i<N-1; i++){
           if(arr[i]>=arr[i+1]){
               return 0;
           }}
       return 1;
    }
}