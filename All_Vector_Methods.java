import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class All_Vector_Methods {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>(); // By default its capacity is 10 and increment will be 2x 
        // System.out.println(vector.capacity());

        // Adding elements to the Vector
        vector.add("Alice"); // Method of Collection
        vector.add(1,"Bob"); // Method of List
        vector.addElement("Charlie"); // Method of vector 

        System.out.println("Vector: " + vector);

        // 1. add(E e)
        vector.add("David");
        System.out.println("After add(David): " + vector);

        // 2. addElement(E obj)
        vector.addElement("Emily");
        System.out.println("After addElement(Emily): " + vector);

        // 3. remove(int index)
        vector.remove(2);
        System.out.println("After remove(2): " + vector);

        // 4. removeElement(Object obj)
        vector.removeElement("Alice");
        System.out.println("After removeElement(Alice): " + vector);

        // 5. get(int index)
        System.out.println("Element at index 1: " + vector.get(1));

        // 6. elementAt(int index)
        System.out.println("Element at index 2: " + vector.elementAt(2));

        // 7. size()
        System.out.println("Size of Vector: " + vector.size());

        // 8. clear()
        vector.clear();
        System.out.println("After clear(): " + vector);

        // 9. isEmpty()
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // 10. contains(Object obj)
        System.out.println("Does Vector contain 'David'? " + vector.contains("David"));

        // 11. iterator()
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element: " + iterator.next());
        }

        // 12. listIterator()
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Next element: " + listIterator.next());
        }

        // 13. elements()
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("Next element: " + enumeration.nextElement());

        // 14. capacity(
            System.out.println(vector.capacity());
        }
    }
}
