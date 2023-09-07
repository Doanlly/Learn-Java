
//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class adding_array_element {

    public static void main(String[] args)  {
        int N = 8;
        int K = 5;
        int[] arr = {6, 5, 5, 2, 1, 3, 1, 9};
        int operations = minOperations(arr, N, K);
        System.out.println("Number of operations required: " + operations);
}
public static  int minOperations(int[] arr, int N, int K) {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i<N; i++){
        pq.add(arr[i]);
    }
    int cnt=0;
    while(pq.peek()<K && pq.size()>1){
        cnt++;
        int first=pq.poll();
        int second=pq.poll();
        pq.add(first+second);
    }
    if(pq.peek()<K) return -1;
    return cnt;
}
}

      