import java.util.Enumeration;
import java.util.Vector;

public class All_Enumeration_Methods {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        // Creating an Enumeration
            Enumeration<String> enumeration = vector.elements();

        // 1. hasMoreElements() - Checks if there are more elements
            System.out.println("1. hasMoreElements(): " + enumeration.hasMoreElements());

        // 2. nextElement() - Returns the next element
            System.out.println("2. nextElement(): " + enumeration.nextElement());

        // 3. asIterator() - Convert Enumeration to Iterator (Java 8+)
        // This is a utility method to convert Enumeration to Iterator using Iterable.forEach
            enumeration = vector.elements();
            enumeration.asIterator().forEachRemaining(System.out::println);

        // Note: There are only two methods in the Enumeration interface
    }
}
