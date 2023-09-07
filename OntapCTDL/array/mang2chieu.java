package OntapCTDL.array;

import java.util.Arrays;

public class mang2chieu {
    static void sum2arraymatric(int [][]a){
        int sum = 0;
        System.out.println(a.length);
        System.out.println(a[1].length);
        for(int i = 0;i<a.length;i++){
            for(int j = 0 ; j<a[i].length;j++){
                sum+=a[i][j];

            }
        }
        System.out.println("Tong matrix = "+ sum);
    }
    static void maxelement(int a[][]){
        int elementmax = Integer.MIN_VALUE;
        for(int i= 0 ; i<a.length;i++){
            for (int j = 0 ; j<a[i].length;j++){
                if(a[i][j]>elementmax){
                    elementmax = a[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang la:"+ elementmax);
    }
    public static class Student {
        public int roll_no;
        public String name;
        Student(int roll_no, String name)
        {
            this.roll_no = roll_no;
            this.name = name;
        }
    }


     public static void main(String[] args) {
        //khai bao 1 mang 2 chieu
        int[][] arrayName;
        int [][]arrayName1 = new int[4][3];
        //them arrayname1[0][1] = 10;
        int [][]matrixxx = {{1,2,3},{4,5,6},{7,8,9}};
        int element1 = matrixxx[1][2];// hang 2 cot 3
        for (int i = 0; i < matrixxx.length; i++) {
            for (int j = 0; j < matrixxx[i].length; j++) {
                System.out.print(matrixxx[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ma tran: "+ Arrays.deepToString(matrixxx)+ " \n hang2 cot3" +element1);
        sum2arraymatric(matrixxx);
        maxelement(matrixxx);
        mang2chieu outer = new mang2chieu();
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
 
        // so on...
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                               + arr[i].roll_no + " "
                               + arr[i].name);
    }
    
}
