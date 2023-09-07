
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Home4 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    Queue<Integer> myQueue = new LinkedList<>();
	    for (int i = 0; i < n; i++)
	      myQueue.add(sc.nextInt());

	    int k = sc.nextInt();
	    for (int i = 1; i <= k; i++)
	      myQueue.add(myQueue.poll());//lấy pt đầu add vào cuối hàng đợi
	    

	    for (Integer i : myQueue) {
	      System.out.printf(i + " ");
	    }
	    sc.close();
	  }
}
