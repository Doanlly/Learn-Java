// import java.util.Iterator;

// public class LinkedListStack<T> implements StackInterface<T> {

// 	class Node {
// 		T element;
// 		Node next;
// 	}

// 	Node stack = null;

//     @Override
//     public void push(T element) {
//         Node newNode = new Node();
//         newNode.element = element;
//         newNode.next = stack;
//         stack = newNode;
//     }


//     @Override
//     public T pop() {

//         T element = stack.element;
//         stack = stack.next;
//         return element;
//     }


// 	@Override
// 	public boolean isEmpty() {
// 		// TODO Auto-generated method stub
// 		return stack==null;
// 	}

// 	@Override
// 	public Iterator<T> iterator() {
// 		// TODO Auto-generated method stub
// 		return new StackIterator();
// 	}

// 	class StackIterator implements Iterator<T> {

// 		private Node currentNode = stack;

// 		@Override
// 		public boolean hasNext() {
// 			// TODO Auto-generated method stub
// 			return currentNode != null;
// 		}

// 		@Override
// 		public T next() {
// 			// TODO Auto-generated method stub
// 			T data = currentNode.element;
// 			currentNode = currentNode.next;
// 			return data;
// 		}
// 	}

// }