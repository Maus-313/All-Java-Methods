import java.util.Hashtable;


// Difference between Hashtable and HashMap:
    // HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized.
    // HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value.
    // HashMap is faster than HashTable.
    // HashMap iterator is fail-safe where HashTable iterator is not fail-safe.
    // HashMap extends AbstractMap class where HashTable extends Dictionary class.
public class All_HashTable_Methods {
    public static void main(String[] args) {
        // Create a Hashtable
            Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements
            hashtable.put("Alice", 30);
            hashtable.put("Bob", 25);
            hashtable.put("Charlie", 35);

        // Displaying the Hashtable
            System.out.println("Hashtable: " + hashtable);

        // Accessing a value
            int ageOfAlice = hashtable.get("Alice");
            System.out.println("Age of Alice: " + ageOfAlice);

        // Checking if a key exists
            boolean containsCharlie = hashtable.containsKey("Charlie");
            System.out.println("Contains key 'Charlie': " + containsCharlie);

        // Removing an element
            hashtable.remove("Bob");
            System.out.println("Hashtable after removing 'Bob': " + hashtable);
    }
}
