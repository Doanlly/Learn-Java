package OntapCTDL.Queue;
// Java program to implement Priority Queue using Arrays
import java.util.*;

// Structure for the elements in the priority queue
class item {
    public int value;
    public int priority;
};

class GFG {

    // Store the elements of the priority queue
    static item[] pr = new item[100000];

    // Pointer to the last index
    static int size = -1;

    // Function to insert a new element into the priority queue
    static void enqueue(int value, int priority) {
        // Increase the size
        size++;

        // Insert the element
        pr[size] = new item();
        pr[size].value = value;
        pr[size].priority = priority;
    }

    // Function to check the top element
    static int peek() {
        int highestPriority = Integer.MIN_VALUE;
        int ind = -1;

        // Check for the element with the highest priority
        for (int i = 0; i <= size; i++) {
            // If priorities are the same, choose the element with the highest value
            if (highestPriority == pr[i].priority && ind > -1 && pr[ind].value < pr[i].value) {
                highestPriority = pr[i].priority;
                ind = i;
            }
            // If priority is higher, update the highestPriority and ind
            else if (highestPriority < pr[i].priority) {
                highestPriority = pr[i].priority;
                ind = i;
            }
        }

        // Return position of the element
        return ind;
    }

    // Function to remove the element with the highest priority
    static void dequeue() {
        // Find the position of the element with highest priority
        int ind = peek();

        // Shift the elements one index before from the position of the element with highest priority
        for (int i = ind; i < size; i++) {
            pr[i] = pr[i + 1];
        }

        // Decrease the size of the priority queue by one
        size--;
    }

    // Function to print the elements in the queue
    static void printQueue() {
        if (size == -1) {
            System.out.println("Hàng đợi ưu tiên trống.");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(pr[i].value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Function Calls to insert elements as per the priority
        enqueue(10, 2);
        enqueue(13, 1);
        enqueue(14, 4);
        enqueue(16, 4);
        enqueue(12, 3);

        // Print the queue
        printQueue();

        // Stores the top element at the moment
        int ind = peek();
        System.out.println("Top element: " + pr[ind].value);

        // Dequeue the top element
        dequeue();

        // Print the queue
        printQueue();

        // Check the top element
        ind = peek();
        System.out.println("Top element: " + pr[ind].value);

        // Dequeue the top element
        dequeue();

        // Print the queue
        printQueue();

        // Check the top element
        ind = peek();
        System.out.println("Top element: " + pr[ind].value);
    }
}
