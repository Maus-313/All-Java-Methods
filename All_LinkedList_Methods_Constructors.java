import java.util.LinkedList;
import java.util.ListIterator;

// Linked List class dsa
class LL{
    Node head; // Head and tale as you know and also it is by default null

    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){ // corner case
            head =newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){ // corner case
            head =newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    // printing List
    public void printList(){
        if(head == null){ // corner case
            System.out.println("lists is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    // deleting is little tough
    public void deleteFirst(){
        if(head == null){
            System.out.println("This is empty!");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void deleteLast(){
        if(head==null){ // corner case
            System.out.println("This is empty!");
            return;
        }

        size--;
        if(head.next == null){ // corner case
            head=null;
            return;
        }


        Node secondLast=head;
        Node lastNode=head.next; // if head.next=null than lastNode = null hence 
        while(lastNode.next!=null){ // null.next will show error
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;
        
    }

    public int getSize(){
        return size;
    }
}

// Tesing our LL class here
class Main{
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();


        System.out.println(list.getSize());
    }
}


public class All_LinkedList_Methods_Constructors {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Alice");
        linkedList.add(1,"Bob"); // Allowed 
        linkedList.add("Charlie");
        linkedList.add(null);

        System.out.println("LinkedList: " + linkedList);

        // 1. add(E e)
        linkedList.add("David");
        System.out.println("After add(David): " + linkedList);

        // 2. addFirst(E e)
        linkedList.addFirst("Amy");
        System.out.println("After addFirst(Amy): " + linkedList);

        // 3. addLast(E e)
        linkedList.addLast("Zach");
        System.out.println("After addLast(Zach): " + linkedList);

        // 4. remove()
        linkedList.remove();
        System.out.println("After remove(): " + linkedList);

        // 5. removeFirst()
        linkedList.removeFirst();
        System.out.println("After removeFirst(): " + linkedList);

        // 6. removeLast()
        linkedList.removeLast();
        System.out.println("After removeLast(): " + linkedList);

        // 7. getFirst()
        System.out.println("First element: " + linkedList.getFirst());

        // 8. getLast()
        System.out.println("Last element: " + linkedList.getLast());

        // 9. size()
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 10. clear()
        linkedList.clear();
        System.out.println("After clear(): " + linkedList);

        // 11. listIterator()
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Next element: " + iterator.next());
        }
    }
}
