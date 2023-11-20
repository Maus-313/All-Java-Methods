import java.util.PriorityQueue;

public class All_Heap_Methods {
    public static void main(String[] args) {
        // Creating a Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Inserting elements into the heap
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);

        // Peek: Get the top element without removing
        System.out.println("Top Element (Peek): " + minHeap.peek());

        // Poll: Remove and return the top element
        System.out.println("Removed Element (Poll): " + minHeap.poll());

        // Adding more elements
        minHeap.add(3);
        minHeap.add(15);

        // Printing elements in ascending order (heap sort)
        System.out.println("Heap-Sorted Elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        // Creating a Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Inserting elements into the max heap
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(2);

        // Peek and Poll for max heap work similarly

        // Custom Objects in Heap
        // Assuming you have a class called CustomObject with a field 'value'
        PriorityQueue<CustomObject> customHeap = new PriorityQueue<>((obj1, obj2) -> obj1.value - obj2.value);
        customHeap.add(new CustomObject(30));
        customHeap.add(new CustomObject(10));
        customHeap.add(new CustomObject(20));

        // You can implement Comparable interface in CustomObject or provide a Comparator

        // Heapifying an array
        int[] arr = {5, 10, 15, 2, 7};
        PriorityQueue<Integer> heapFromArray = new PriorityQueue<>(arr.length);
        for (int num : arr) {
            heapFromArray.add(num);
        }

        // Priority Queues are versatile and can be adapted for various scenarios
        // like Dijkstra's algorithm, Huffman coding, etc.
    }

    static class CustomObject {
        int value;

        CustomObject(int value) {
            this.value = value;
        }
    }
}