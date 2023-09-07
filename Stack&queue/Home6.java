
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Home6 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];

	    for (int i = 0; i < n; i++) {
	      a[i] = sc.nextInt();
	    }

	    int k = sc.nextInt();
	    Queue<Integer> myQueue = new LinkedList<>();

	    for (int i = 0; i < n; i++) {
	      if (myQueue.size() < k) {
	        if (!myQueue.contains(a[i]))
	          myQueue.add(a[i]);
	      } else {
	        myQueue.poll();
	        myQueue.add(a[i]);
	      }
	    }
	    while (!myQueue.isEmpty())
	      System.out.printf(myQueue.remove() + " ");

	  }
}
