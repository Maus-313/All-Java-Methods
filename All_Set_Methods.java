import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class All_Set_Methods {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        s.add(null);
        s.add(null);

        System.out.println(s);

        // Here you can use Iterator for printing but ListIterator is not available here

    }
}