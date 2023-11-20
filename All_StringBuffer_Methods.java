public class All_StringBuffer_Methods{
    public static void main(String[] args) {

        // 1. capacity()
            StringBuffer sb=new StringBuffer();
            System.out.println(sb.capacity()); // By Default it has 16 capacity

            StringBuffer sb1=new StringBuffer("umar");
            System.out.println(sb1.capacity()); // 16+ string length

            StringBuffer sb2=new StringBuffer(1000); // Manually changing capacity
            System.out.println(sb2.capacity());

            sb.append("umar");
            System.out.println(sb.capacity()); // 16

            sb.append("umar");
            System.out.println(sb.capacity()); // 16
            
            sb.append("umar");
            System.out.println(sb.capacity()); // 16

            sb.append("umar");
            System.out.println(sb.capacity()); // 16

            sb.append("umar");
            System.out.println(sb.capacity()); // 34 
            // If the default capacity exceeded then it will 16*2+2 to increase capacity.

            // (old capacity)*2+2

        // 2. length()

            System.out.println(sb.length()); //5*umar length

        // 3. append()

            System.out.println(sb.append("java"));

        // 4. charAt()

        // 5. delete()
            System.out.println(sb.delete(2, 3));

        // 6. equals()
            StringBuffer sb3=new StringBuffer("apple");
            StringBuffer sb4=new StringBuffer("apple");
            StringBuffer sb5=sb4.append("hi");
            System.out.println(sb3.equals(sb4)); // false
            System.out.println(sb4.equals(sb5)); // true
            System.out.println(sb5.equals(sb4)); // true

        // 7. indexOf()

        // 8. lastIndexOf()

        // 9. insert()
            StringBuffer sb6=new StringBuffer("apple");
            System.out.println(sb6.insert(5,"mango"));
        
        // 10. replace()

        System.out.println(sb6.replace(1,3,"bb"));

        // 11. reverse()
        System.out.println(sb6.reverse());

        // 12. subSequence() //provide char sequence
        System.out.println(sb6.subSequence(3, 6));

        // 13. subString()
        System.out.println(sb6.substring(3,6));

        // 14. toString() convert stringBuffer to String 
        
        // 15. ensureCapacity() ensure required capacity 
        System.out.println(sb6.capacity());
        sb6.ensureCapacity(100);
        System.out.println(sb6.capacity());

        // 16. setCharAt()""
        sb6.setCharAt(4, 'A');
        System.out.println(sb6);

        // 17. setLength()
        sb6.setLength(5);
        System.out.println(sb6);

        // 18. trimToSize()
        sb6.ensureCapacity(100);
        sb6.append("Hello");
        sb6.trimToSize();
        System.out.println(sb6.capacity()); // remove 90 unused memory

        // 19..................End
    }
}