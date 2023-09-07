package OntapCTDL.array;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrayz {
    static void doanzdz(int a[]){
        int min = a[0];
        for(int i = 0;i<a.length;i++){
            if(min<a[1]){
                min = a[i];
            }
        }
        System.out.println("mim: "+ min);
    }
    //Hàm đảo ngược
    static void Hamdaonguoc(int a[]){
        int b[];// không ad được
        List<Integer> number = new ArrayList<>();
        for(int i = a.length-1 ; i>=0;i--){
            number.add(a[i]);
        }
        System.out.println("Hàm đảo ngược: "+ number);
    }
    static void Hamdaonguodungarray(int a[]){
        int b[] = new int[a.length];
        for(int j = 0, i = a.length-1; j<a.length; j++,i--){
            b[j] = a[i];
        }
        System.out.print("Ham dao nguoc dung Array: ");
        for(int i = 0 ; i<b.length;i++){
            System.out.print(b[i]+ ",");
        }
        
    }
    static void TinhtongphantutrongArray(int a[]){
        int sum = 0;
        for (int i = 0 ; i< a.length;i++){
            sum = sum +a[i];
        }
        System.out.println("");
        System.out.println("Gia tri cua tat ca cac phan tu trongmang: "+  sum);
    }
    static void Giatrilonnhattrong1Array(int a[]){
        int maxelement = 0 ;
        for(int i = 0 ; i<a.length;i++){
            if(maxelement <a[i]){
                maxelement = a[i];
            }

        }
        System.out.println("gia tri lon nhat trong mang la:" + maxelement);
    }
    static String checkArraytanggiam(int a[]){
        boolean tang =true;
        boolean giam = true; 
        for(int i = 0 ; i<a.length-1;i++){
            if(a[i] > a[i+1]){
                tang =  false;
            }else if(a[i]<a[i+1]){
                giam = false;
            }
            
            
        }
        if (tang){
            return "Day tang";
        }
        else if(giam){
            return "Day giam";
        }
        else{
            return "Khong tang.Khong giam";}       
       
        
    }
    static void position(int[]a , int taget){
        int posi = a.length;
        int positionn = -1;
        for(int i = 0 ; i<posi ; i++){
            if(a[i] == taget){
                positionn = i;
                break;
            }
        }
        System.out.println("Vi tri cua phan tu" + taget + "trog mang là: "+ positionn);
    }
    public static void main(String[] args) {
        System.out.println("Xin chào Đoàn \u0111\u1EB9p trai");

        double[] doandz = new double[10];
        System.out.println(doandz);
        //khai báo và khởi tạo mảng
        int a[] = new int[5]; //5 là size mảng
        a[0] = 5;
        a[2] = 3;
        a[1] = 4;
        a[3] = 2;
        a[4] = 1;
        System.out.println(a[1]);
        int a1[] = {5,4,3,2,1};
        for(int i = 0; i<a1.length;i++){
            System.out.print(a1[i]+ " ");
        }
        doanzdz(a1);
        //foeach
        double[] BK49 = {1.9, 2.9, 3.4, 3.5};
        for(double element: BK49){
            System.out.print(element);
        }
        Hamdaonguoc(a1);
        Hamdaonguodungarray(a1);
        TinhtongphantutrongArray(a1);
        Giatrilonnhattrong1Array(a1);
    
        
            System.out.println(checkArraytanggiam(a1));
        position(a1, 5);
        }
    }
    

