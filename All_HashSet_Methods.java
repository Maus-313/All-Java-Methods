import java.util.HashSet;
import javax.util.Iterator;

// Time Complexity for it is:
    // Insert/Add is O(1)
    // Search/Contains is O(1)
    // Delete/Remove is O(1)

public class All_HashSet_Methods {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // 1. add(element)
        set.add(10); // actually the are being stored in Map
        set.add(20);
        set.add(30);
        set.add(40);
        // System.out.println("HashSet after add: " + set);

        // 2. remove(element)
        // set.remove(20); // return true if successfully found and remove the value
        // System.out.println(set.remove(20));
        // System.out.println("HashSet after remove: " + set);

        // 3. contains(element)
        // boolean contains = set.contains(10);
        // System.out.println("HashSet contains 10: " + contains);

        // 4. size()
        // int size = set.size();
        // System.out.println("Size of HashSet: " + size);

        // 5. isEmpty()
        // boolean isEmpty = set.isEmpty();
        // System.out.println("Is HashSet empty? " + isEmpty);

        // 6. clear()
        // set.clear();
        // System.out.println("HashSet after clear: " + set);

        // 7. Iterator // used to access array
        // java.util.Iterator it=set.iterator();
        // // System.out.println(it.next());
        // // Initially it points towards null but after it.next() it points to the next element
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }

        // 8. toArray()
        // Integer[] arr=set.toArray(new Integer[set.size()]); // converting Hashset to Integer array
        // System.out.println(arr[1]);

        // 9. advance for loop (for access values in the hashset)
            for(int i:set){
                System.out.print(i+" ");
            }
    }
}


class UnionOf2Array{
    // Adding two array
    static HashSet solution(int[] arr1,int[] arr2){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        return hs;
    }

    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(solution(arr1, arr2));
    }
}