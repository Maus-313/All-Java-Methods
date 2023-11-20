import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class All_Iterator_Methods {
    public static void main(String[] args) {

        // Create a list for demonstration
            List list = new ArrayList();
            list.add(10);
            list.add("twenty");
            list.add(30);
            System.out.println(list);

        // Get an iterator for the list
            Iterator<Integer> iterator = list.iterator();

        // 1. hasNext()
            System.out.println("1. hasNext(): " + iterator.hasNext()); // Output: true

        // 2. next()
            System.out.println("2. next(): " + iterator.next()); // Output: 10

        // 3. remove()
            list.remove(new Integer(30));
            System.out.println(list);

        // The End
    }
}
