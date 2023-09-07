
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Stack_Prime_anlpha {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    Queue<Integer> myQueue = new LinkedList<>();
	    myQueue.add(0);
	    while (!myQueue.isEmpty()) {
	      int temp = myQueue.poll();
	      if (isPrime(temp))
	        System.out.printf(temp + " ");
	      for (int i = 1; i < 10 && temp * 10 + i < n; i++) {
	        if (isPrime(temp * 10 + i))
	          myQueue.add(temp * 10 + i);
	      }
	    }

	  }

	  public static boolean isPrime(int x) {
	    if (x <= 3)
	      return x > 1;
	    else if (x % 2 == 0 || x % 3 == 0)
	      return false;
	    else {
	      int step = 5;
	      while (step <= Math.sqrt(x)) {
	        if (x % step == 0 || x % (step + 2) == 0)
	          return false;
	        step += 6;
	      }
	    }
	    return true;
	  }
}
