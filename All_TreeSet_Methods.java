import java.util.TreeSet;

public class All_TreeSet_Methods {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // 1. add(element)
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("TreeSet after add: " + set);

        // 2. remove(element)
        set.remove(20);
        System.out.println("TreeSet after remove: " + set);

        // 3. contains(element)
        boolean contains = set.contains(10);
        System.out.println("TreeSet contains 10: " + contains);

        // 4. size()
        int size = set.size();
        System.out.println("Size of TreeSet: " + size);

        // 5. isEmpty()
        boolean isEmpty = set.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);

        // 6. first()
        int first = set.first();
        System.out.println("First element in TreeSet: " + first);

        // 7. last()
        int last = set.last();
        System.out.println("Last element in TreeSet: " + last);

        // 8. clear()
        set.clear();
        System.out.println("TreeSet after clear: " + set);
    }
}
