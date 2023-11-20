import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int[] arr1=new int[arr.length+arr.length];
        // arr1.

    }
}

public class All_ArrayList_Methods {
    public static void main(String[] args) {
        // Creating an ArrayList
            ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
            // arrayList.add(1,10); // Not allowed 

            arrayList.add(10);
            arrayList.add(20);
            arrayList.add(30);

            System.out.println("ArrayList: " + arrayList);

        // There are 3 constructors in ArrayList: you can pass int for index , another arraylist for adding perpose

        // 1. add(int index, E element)
            arrayList.add(1, 25);
            System.out.println("After add(1, 25): " + arrayList);

        // 2. get(int index)
            System.out.println("Element at index 2: " + arrayList.get(2));

        // 3. set(int index, E element)
            arrayList.set(1, 15);
            System.out.println("After set(1, 15): " + arrayList);

        // 4. remove(int index)
            arrayList.remove(0);
            System.out.println("After remove(0): " + arrayList);
            // You can remove a previously added ArrayList as well remove(al2);

        // 5. size()
            System.out.println("Size of ArrayList: " + arrayList.size());

        // 6. contains(Object o)
            System.out.println("Contains 30: " + arrayList.contains(30));

        // 7. indexOf(Object o)
            System.out.println("Index of 15: " + arrayList.indexOf(15));

        // 8. isEmpty()
            System.out.println("Is ArrayList empty? " + arrayList.isEmpty());

        // 9. clear()
            arrayList.clear();
            System.out.println("After clear(): " + arrayList);

        // 10. Collections.addAll(Collection<? super T> c, T... elements)
            Collections.addAll(arrayList, 40, 50, 60);
            System.out.println("After Collections.addAll(): " + arrayList);
    }
}
