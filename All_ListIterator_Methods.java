import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class All_ListIterator_Methods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Creating a ListIterator
            ListIterator<Integer> listIterator = list.listIterator();

        // 1. hasNext() - Checks if there is a next element
            System.out.println("1. hasNext(): " + listIterator.hasNext());

        // 2. next() - Returns the next element
            System.out.println("2. next(): " + listIterator.next());

        // 3. nextIndex() - Returns the index of the element that would be returned by a subsequent call to next()
            System.out.println("3. nextIndex(): " + listIterator.nextIndex());

        // 4. hasPrevious() - Checks if there is a previous element
            System.out.println("4. hasPrevious(): " + listIterator.hasPrevious());

        // 5. previous() - Returns the previous element
            System.out.println("5. previous(): " + listIterator.previous());

        // 6. previousIndex() - Returns the index of the element that would be returned by a subsequent call to previous()
            System.out.println("6. previousIndex(): " + listIterator.previousIndex());

        // 7. add() - Inserts the specified element into the list
            listIterator.add(40);
            System.out.println("7. add(40): " + list);

        // 8. remove() - Removes the last element returned by next() or previous()
            listIterator.next();
            listIterator.remove();
            System.out.println("8. remove(): " + list);

        // 9. set() - Replaces the last element returned by next() or previous()
            listIterator.next();
            listIterator.set(50);
            System.out.println("9. set(50): " + list);
    }
}
