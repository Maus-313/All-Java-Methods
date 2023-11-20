import java.lang.reflect.Array;
import java.util.Arrays;

public class All_Array_Methods{
    public static void main(String[] args) {
        // 1. asList() Returns a fixed-size list backed by the specified Arrays
            int intArr[] = { 10, 20, 15, 22, 35,12,23 };

            // ArrayList arr={ 10, 20, 15, 22, 35,12,23 };
    
            // To convert the elements as List
            System.out.println("Integer Array as List: "+ Arrays.asList(intArr));
        
        // 2. binarySearch() 
        
        // 3. compare()

        // 4. copyOf()

        // 5. copyOfRange()

        // 6. deepEquals()

        // 7. deepHashCode()

        // 8. deepToString()
 
        // 9. equals()
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        System.out.println(Arrays.equals(arr1,arr2));

        // 10. fill()

        // 11. hashCode()

        // 12. mismatch()

        // 13. parallelPrefix()

        // 14. parallelSetAll()

        // 15. parallelSort()

        // 16. setAll()

        // 17. sort() // in ascending order

        // 18. spliterator()

        // 19. stream()

        // 20. toString()
    }
}