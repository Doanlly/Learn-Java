package Home2;
import java.util.*;
public class Ex11 {
	    Stack<Integer> s1 = new Stack<Integer>(); // stack to store elements of the queue
	    Stack<Integer> s2 = new Stack<Integer>(); // auxiliary stack used to reverse the elements
	    // Function to push an element in queue by using 2 stacks.
	    void Push(int data) {
	        // Transfer all elements from s1 to s2
	        while (!s1.isEmpty()) {
	            s2.push(s1.pop());
	        }
	        // Push the new element to s1
	        s1.push(data);
	        // Transfer all elements back from s2 to s1
	        while (!s2.isEmpty()) {
	            s1.push(s2.pop());
	        }
	    }
	    // Function to pop an element from queue by using 2 stacks.
	    int Pop() {
	        // Return -1 if the queue is empty
	        if (s1.isEmpty()) {
	            return -1;
	        }
	        // Pop the top element from s1
	        return s1.pop();
	    }
}	
