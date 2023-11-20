import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class All_List_Methods {
    public static void main(String[] args) {
        List l =new ArrayList();
        // l.add(1,30); // throws error
            l.add(10);
            l.add(1,20);
            l.add(30);
            l.add(40);
            l.add(null);
            l.add(null);
            l.add(null);
            l.add(null);
            // System.out.println(l);

            
            //  Printing the elements
                // for(Object i:l){
                //     System.out.println(i);
                // }

            //  Printing the elements(2)
                // Iterator itr = l.iterator();
                // while(itr.hasNext()){
                //     System.out.println(itr.next());
                // }

            //  Printing the elements(3)
                    ListIterator li=l.listIterator();

                    // while(li.hasNext()){
                    //     System.out.println(li.next());
                    // }
                    
                    while(li.hasPrevious()){
                        System.out.println(li.previous());
                    }
    }
}
