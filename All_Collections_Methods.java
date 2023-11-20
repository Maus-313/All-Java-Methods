import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class All_Collections_Methods {
    public static void main(String[] args) {
        // Creating a list of integers
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);
            numbers.add(7);

        // Sorting the list
            Collections.sort(numbers);
            System.out.println("Sorted List: " + numbers);

        // Finding the maximum element
            Integer max = Collections.max(numbers);
            System.out.println("Max Element: " + max);

        // Finding the minimum element
            Integer min = Collections.min(numbers);
            System.out.println("Min Element: " + min);

        // Reversing the list
            Collections.reverse(numbers);
            System.out.println("Reversed List: " + numbers);

        // Shuffling (randomizing) the list
            Collections.shuffle(numbers);
            System.out.println("Shuffled List: " + numbers);

        // Swapping elements (working: 1 and 3 are swapped to 3 and 1)
            Collections.swap(numbers, 1, 3);
            System.out.println("List after swapping: " + numbers);

        // Filling a list with a specific value
            Collections.fill(numbers, 0);
            System.out.println("List after filling: " + numbers);

        // Frequency of an element in the list
            int frequency = Collections.frequency(numbers, 0);
            System.out.println("Frequency of 0: " + frequency);

        // Copying elements from one list to another
            List<Integer> copyList = new ArrayList<>(numbers);
            System.out.println("Copy of List: " + copyList);
    }
}
