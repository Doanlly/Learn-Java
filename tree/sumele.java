// import java.util.*;
// import java.lang.*;
// import java.io.*;
// public class sumele {
//     public static void main(String[] args) {
//         long[] arr = {20, 8, 22, 4, 12, 10, 14};
//         long N = 7, K1 = 3, K2 = 6;
//         long sum = sumBetweenTwoKth(arr, N, K1, K2);
//         System.out.println(N); // expected output: 26
//     }
// }

//     public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)

//     { // Your code goes here
//     Arrays.sort(A);

//         long sum =(long)0;

//         for(int i=0;i<N; i++){

//             if(i>=K1 && i<K2-1){

//             sum+=A[i];

//             }

//         }

//         return sum;
//     }
import java.util.*;
import java.lang.*;
import java.io.*;

public class sumele {
    
    public static void main(String[] args) {
        long[] arr = {20, 8, 22, 4, 12, 10, 14};
        long N = 7, K1 = 3, K2 = 6;
        long sum = sumBetweenTwoKth(arr, N, K1, K2);
        System.out.println(sum); // expected output: 26
    }

    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        Arrays.sort(A);
        long sum = 0;

        for(int i = (int) K1; i < K2 - 1; i++) {
            sum += A[i];
        }

        return sum;
    }
}