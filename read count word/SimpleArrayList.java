import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings({"unchecked", "deprecation"})
public class SimpleArrayList<T> implements ListInterface<T> {

    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        // Hàm dựng với kích thước mảng là capacity
        array = (T[]) new Object[capacity];
    }

    public void add(T data) {
        if (n < defaultSize ) 
        array[n] = data;
        n++;
		//System.out.println("n: "+ n);

    }

    public T get(int i) {
        if (i >= 0 && i < n) {
			//System.out.println(array[i]);
            return array[i];
        }
        return null;
    }

    public void set(int i, T data) {
        if (i >= 0 && i < n) {
            array[i] = data;

        }
		System.out.println(array[i]);

    }

    public void remove(int i) {
        if (i >= 0 && i < n) {
            for (int j = i; j < n - 2; j++) {
                array[j] = array[j + 1];
            }
            n--;
			
        }
		System.out.println("n = " + n);

    }

    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
        
    }

    public int indexOf(T data) {
        // for (int i = 0; i < n; i++) {
        //     if (array[i].equals(data)) {
        //         return i;
        //     }
        // }
        return -1;
    }

    public int size() {
		//System.out.println("n = " + n);
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    class ArrayListIterator implements Iterator<T> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub

            return current < n;
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            T data = array[current];
            current++;
			//System.out.println("data = " + data);
            return data;
        }

    }

}