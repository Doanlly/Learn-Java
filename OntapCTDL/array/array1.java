package OntapCTDL.array;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
public class array1 {
    static void sortarray(int a[]){
        Arrays.sort(a);
     
        System.out.println("Mang sau khi da sort"+ Arrays.toString(a));
        for(int i = 0 ; i< a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        System.out.println("mang sau khi da sap xep giam dan la:"+ Arrays.toString(a));

    }
    //TIm phan tu duy nhat trogn 1 mang
    static void tim_phantu_duynhatmacacptxuathiendung2lan(int a[]){
        int i = 0 ; 
        ArrayList<Integer> aa  = new ArrayList<>();
        while(i<a.length){
            int current = a[i];
            int count = 0;
            while (i < a.length && a[i] == current) {
                count++;
                i++;
            }
            if (count == 1) {
                aa.add(current);
                //System.out.println(current);
            }
        }     
        System.out.println("Cac phan tu duy nhat trong  mnag:"+ aa);
    }
    //Tim cac cap phan tu co tong bang 1 gia tri x
    static void sumArray(int arr[],int x,ArrayList<Pair> pairs){
        ArrayList<Integer> arrr = new ArrayList<>();

        for(int i = 0 ; i < arr.length;i++){
            int complement = x - arr[i];
            if(arrr.contains(complement)){
                //System.out.println("Cặp phần tử có tổng " + x + ": (" + arr[i] + ", " + complement + ")");
                Pair pair = new Pair(complement, arr[i]);
                pairs.add(pair);
            }
            arrr.add(arr[i]);
            // arrlist.add(arrelement)
        }
       // System.out.println(arrelement);
    }
    static class Pair {
        int first;
        int second;
        
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }


    static void Xoaphantutrunglaptrong1array(int a[]){
        Set<Integer> xoatrunglapelement = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i <a.length;i++){
            // if()
            xoatrunglapelement.add(a[i]);
        }
        System.out.println(xoatrunglapelement);
    }
    static void timArraylientiep_sumax(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        
        int[] subArray = Arrays.copyOfRange(arr, start, end + 1);
        System.out.println("Mảng con có tổng lớn nhất: " + Arrays.toString(subArray));
    }


    public static void main(String[] args) {
        int a[] = {1,2,4,5,5,2,6,3};
        sortarray(a);
        tim_phantu_duynhatmacacptxuathiendung2lan(a);
        // sumArray(a,6);
        ArrayList<Pair> pairs = new ArrayList<>();
        int z = 6;
        sumArray(a, z, pairs);
        for(Pair pair:pairs){
            System.out.println("Cap phan tu co tong "+ z + " la: " + pair.first + ", " + pair.second );
        }
        System.out.println(pairs.toString());
        System.out.println("a = "+ Arrays.toString(a));
        Xoaphantutrunglaptrong1array(a);
        int aa[] = {1, -2, 3, 4, -1, 2, -3, 5};
        timArraylientiep_sumax(aa);
    }
}

