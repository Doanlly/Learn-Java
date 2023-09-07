 import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class moveeleStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> value = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            value.add(sc.nextInt());
        }
        int valun= sc.nextInt();
        for (int i = 0; i <valun ; i++) {
            value.add(value.poll());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(value.poll()+" ");
        }

        }
    }
