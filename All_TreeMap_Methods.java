import java.util.TreeMap;

public class All_TreeMap_Methods {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 1. put(key, value)
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        System.out.println("TreeMap after put: " + treeMap);

        // 2. get(key) // returns null if the element not present
        int value = treeMap.get("B");
        System.out.println("Value for key 'B': " + value);

        // 3. containsKey(key)
        boolean containsKey = treeMap.containsKey("A");
        System.out.println("TreeMap contains key 'A': " + containsKey);

        // 4. containsValue(value)
        boolean containsValue = treeMap.containsValue(3);
        System.out.println("TreeMap contains value 3: " + containsValue);

        // 5. size()
        int size = treeMap.size();
        System.out.println("Size of TreeMap: " + size);

        // 6. remove(key)
        treeMap.remove("C");
        System.out.println("TreeMap after remove: " + treeMap);

        // 7. keySet()
        System.out.println("Keys in the TreeMap: " + treeMap.keySet());  // return only keys

        // 8. values()
        System.out.println("Values in the TreeMap: " + treeMap.values());

        // 9. entrySet()
        System.out.println("Entries in the TreeMap: " + treeMap.entrySet());

        // 10. firstKey()
        String firstKey = treeMap.firstKey();
        System.out.println("First key in TreeMap: " + firstKey);

        // 11. lastKey()
        String lastKey = treeMap.lastKey();
        System.out.println("Last key in TreeMap: " + lastKey);

        // 12. ceilingEntry()
        System.out.println(treeMap.ceilingEntry("B"));; // provide value of key greater than or equal to the given argument while get return null

        // 13. ceilingKey() return only key

        // 14. firstEntry()

        // 15. floorEntry() return value and if value not found then return value less then the given argument just like vice versa of          ceilingEntry()
            System.out.println(treeMap.floorEntry("A"));

        // 16. headMap() return top element of the sorted map
            System.out.println(treeMap.headMap("B")); // return sorted map i.e {A=1} while firstEntry return proper value 

        // 17. higherEntry() // return one higher value than the given argument and null if not present 
            System.out.println(treeMap.higherEntry("B"));

        // 18. pollFirstEntry() // return and remove the first entry
    
        // 19. similarly pollLastEntry()    

        // 20. replace()
            treeMap.replace("B",23);
            System.out.println(treeMap);

        // 21. subMap() return values in a range excluding the second argument
            treeMap.put("C", 3);
            treeMap.put("V", 43);
            treeMap.put("S", 23);
            treeMap.put("D", 12);
            treeMap.put("X", 13);
            System.out.println(treeMap);
            System.out.println(treeMap.subMap("C","V"));
    }   
}
