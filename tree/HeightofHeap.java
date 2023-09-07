import java.util.*;
import java.lang.*;//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class HeightofHeap {
    public static int heapHeight(int N) {
        int height = (int) Math.ceil(Math.log(N + 1) / Math.log(2)) - 1;
        return height;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, 9, 8};
        int N = arr.length;
        int height = heapHeight(N);
        System.out.println("The height of the heap is " + height);
    }
}
class Solution{
    static int heapHeight(int N, int arr[]){
        
        int height = (int) Math.ceil(Math.log(N + 1) / Math.log(2)) - 1;
        return height;
    }
}
