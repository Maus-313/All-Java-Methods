// import java.util.ArrayList;
import java.util.*;

// Stack data structure
/*
 * There are 3 way to make stacks 
 *  1. Array(Worst)
 *  2. ArrayList(Best)
 *  3. LinkedList(Best)
 */

class LinkedListStackClass{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Stack{
        static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        void push(int data){
            Node newNode =new Node(data);
            // checking corner case
            if(isEmpty()){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }

        int pop(){ // it remove and return at the same time
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;
            return top;
        }

        int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
class ArrayListStackClass{

    static ArrayList<Integer> list=new ArrayList<>();

    public static boolean isEmpty(){
        return list.size()==0;
    }

    // push 
    public static void push(int data){
        list.add(data);
    }

    // pop
    public static int pop(){

        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    // peek
    public static int peek(){

        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

public class All_Stack_Methods {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // 1. push(element)
        stack.push("Apple");
        stack.push(10);
        stack.push(30.0);
        System.out.println("Stack after push: " + stack);

        // 2. pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 3. peek()
        int topElement = (int) stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peek: " + stack);

        // 4. empty()
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // 5. search(element)
        int position = stack.search(10); // Returns 1-based position, or -1 if not found
        System.out.println("Position of Apple: " + position);
        System.out.println(stack.search("Apple"));
    }
}


class questionPratice{
    // 1 Push element at the end of the stack!
        public static void pushAtBottom(int data,Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtBottom(data, s); // Using recursion concept here!
            s.push(top);
        }
    // 2 Reversing a stack
        public static void reverse(Stack<Integer> s){
            // checking for the base case i.e is the stack is empty 
            if(s.isEmpty()){
                return;
            }

            int top=s.pop();
            reverse(s);
            pushAtBottom(top, s);
        }

        public static void main(String[] args) {
            Stack<Integer> s=new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }

            pushAtBottom(4,s);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }

        }
}