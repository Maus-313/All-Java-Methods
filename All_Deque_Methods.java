import java.util.ArrayDeque;
import java.util.Deque;

public class All_Deque_Methods {
    public static void main(String[] args) {
        // Creating a Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements at the beginning
        deque.addFirst(1);
        deque.offerFirst(2);
        deque.add(3);
        System.out.println("Deque: " + deque);

        // Adding elements at the end
        deque.addLast(4);
        deque.offerLast(5);
        deque.add(6); // Adds at the end, same as addLast
        System.out.println("Deque after adding at the end: " + deque);

        // Peeking elements (without removing)
        int firstElement = deque.peekFirst();
        int lastElement = deque.peekLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Removing elements from the beginning
        deque.pollFirst(); // Removes the first element if it exists
        System.out.println("Deque after removing the first element: " + deque);

        // Removing elements from the end
        deque.pollLast(); // Removes the last element if it exists
        System.out.println("Deque after removing the last element: " + deque);

        // Checking if the Deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is the Deque empty? " + isEmpty);

        // Size of the Deque
        int size = deque.size();
        System.out.println("Size of the Deque: " + size);

        // Clear the Deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}
