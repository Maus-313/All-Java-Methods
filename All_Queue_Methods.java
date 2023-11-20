import java.util.LinkedList;
import java.util.Queue;

import java.util.Stack;

// class Queue{ // Queue using Array
//     static int arr[];
//     static int size;
//     static int rear = -1;
//     static int front = -1; // add for circular queue

//     Queue(int n){
//         arr=new int[n];
//         this.size=n;
//     }

//     static boolean isEmpty(){
//         return rear==-1 && front==-1; // add && front=-1 for circular queue
//     }

//     static boolean isFull(){
//         return (rear+1)%size==front;
//     }

//     // add/enqueue function 
//         static void add(int data){
//             // if(rear==size-1){
//             //     System.out.println("Full Queue!");
//             //     return;
//             // }

//             if(isFull()){
//                 System.out.println("Full Queue!");
//                 return;
//             }

            
//             if(front==-1){ // 1st element added
//                 front=0;
//             }

//             // rear++;
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }
//     // delete/dequeue function 
//         // this remove the first added element FIFO
//         static int remove(){ // we want to remove and return 
//             if(isEmpty()){
//                 System.out.println("Empty Queue!");
//                 return -1;
//             }

//             // int front =arr[0];
//             int result =arr[front];

//             // for(int i=0;i<rear;i++){
//             //     arr[i]=arr[i+1];
//             // }

//             if(rear==front){
//                 rear=front=-1;
//             }else{
//                 front=(front+1)%size;
//             }

//             rear--;
//             return result;  
//         }

//     // peek function   
//         static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue!");
//                 return -1;
//             }

//             // int front =arr[0];
//             return arr[front];
//         }
    
//     // Queue using array have 
//         /*
//             * O(1) time complexity for add function
//             * O(n) time complexity for peek and remove function 
//             * so circular array is better than this as all have O(1) complexity and other advantages as well
//             */

// }


class C_Queue{ // Circular Queue
    
    public static void main(String[] args) {
        // Queue q=new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }


        // Create a queue using LinkedList
            Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
            queue.offer(10);
            queue.offer(20);
            queue.offer(30);

        // Printing the queue
            System.out.println("Queue: " + queue);

        // Access the front element without removing it
            System.out.println("Front element: " + queue.peek());

        // Remove and print elements from the queue
            System.out.println("Removed element: " + queue.poll());
            System.out.println("Queue after removal: " + queue);

        // Check if the queue is empty
            System.out.println("Is the queue empty? " + queue.isEmpty());

        // Check the size of the queue
            System.out.println("Queue size: " + queue.size());
    }
}

// Linked List Queue
class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
    next=null;
    }
}
class L_Queue{
    static Node head;
    static Node tail;

    static boolean isEmpty(){
        return head==null & tail==null;
    }

    static void add(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    static int remove(){

        if(head==tail){ //single element in the queue
            tail=null;
        }
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }

        int front=head.data;
        head=head.next;
        return front;
    }

    static int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return head.data;
    }
}

// Quesiton Queue using Stacks
        //  Using Stack Import
class TwoStacked_Queue{
    Stack <Integer> s1=new Stack<>();
    Stack <Integer> s2=new Stack<>();

    boolean isEmpty(){
        return s1.isEmpty();
    }

    void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.pop();
    }

    int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.peek();
    }
}


class All_Queue_Methods{
    public static void main(String[] args) {
        L_Queue q=new L_Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}