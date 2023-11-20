import java.util.HashMap;
import java.util.Map;

public class All_Map_Methods {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // 1. put(key, value)
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("Map after put: " + map);

        // 2. get(key)
        int value = map.get("B");
        System.out.println("Value for key 'B': " + value);

        // 3. containsKey(key)
        boolean containsKey = map.containsKey("A");
        System.out.println("Map contains key 'A': " + containsKey);

        // 4. containsValue(value)
        boolean containsValue = map.containsValue(3);
        System.out.println("Map contains value 3: " + containsValue);

        // 5. size()
        int size = map.size();
        System.out.println("Size of Map: " + size);

        // 6. remove(key)
        map.remove("C");
        System.out.println("Map after remove: " + map);

        // 7. keySet()
        System.out.println("Keys in the map: " + map.keySet());

        // 8. values()
        System.out.println("Values in the map: " + map.values());

        // 9. entrySet()
        System.out.println("Entries in the map: " + map.entrySet());

        // 10. clear()
        map.clear();
        System.out.println("Map after clear: " + map);

        // 11. replace()
    }
}
