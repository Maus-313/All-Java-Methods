public class All_String_Methods{
    public static void main(String[] args) {
        
        // There are total 38 String Methods are there!
            String str="Apple";

        // 1. charAt() Give me name of all the methods of array in java
            System.out.println(str.charAt(2)); // output: p

        // 2. codePointAt() Returns the Unicode of the character at the specified index
            System.out.println(str.codePointAt(2)); // output: unicode of p is 112

        // 3. codePointBefore() Returns the Unicode of the character before the specified index
            System.out.println(str.codePointBefore(3)); // same as name 

        // 4. codePointCount() Returns the number of Unicode values found in a string.
            System.out.println(str.codePointCount(0,str.length())); // Return the number of unicode found in the String 

        // 5. compareTo() Compares two strings lexicographically : [A<B<C<D<.......<Z<a<b<c......<z] i.e it will convert into decimal first and then subtract it liek a=97 and  A=65 will return 32 on comparision.
            String s1="Apple";
            String s2="apple";
            String email ="example@email.com";
            // regular Expression example:
                String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
            System.out.println("5."+s1.compareTo(s2));  // Substracts the unicode/decimal of that perticular different character!

        // 6. compareToIgnoreCase() 
            System.out.println(s1.compareToIgnoreCase(s2)); // same as name (san)  ये नाम जैसा ही है

        // 7. concat() Appends a string to the end of another string
            System.out.println(s1.concat(s2)); //san

        // 8. contains() Checks whether a string contains a sequence of characters
            System.out.println(s1.contains("c")); //san

        // 9. contentEquals() Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
            System.out.println(s1.contentEquals(s2)); //san

        // 10. copyValueOf() Returns a String that represents the characters of the character array
            char[] a1={'A','p','p','l','e','s'}; // Note1: char is in '' instead of ""!  
            String s3=String.copyValueOf(a1,0,a1.length);
            System.out.println("10. "+s3);

        // 11. endsWith() Checks whether a string ends with the specified character(s)
            System.out.println(s1.endsWith("a")); // san

        // 12. equals() Compares two strings. Returns true if the strings are equal, and false if not
            System.out.println(s1.equals(s2)); //san

        // 13. equalsIgnoreCase() Compares two strings, ignoring case considerations
            System.out.println(s1.equalsIgnoreCase(s2)); // san

        // 14. format
//                                    [IMPORTANT]
            // String formatteds=String.format("This is an %d and this is also an %s",s1,s2); // Showing error read below doc
                // Some Important place holders :
                    // %s: Used for formatting strings.
                    // %d: Used for formatting decimal (integer) values.
                    // %f: Used for formatting floating-point (decimal) values.
                    // %c: Used for formatting characters.
                    // %b: Used for formatting boolean values.
                    // %x: Used for formatting integers as hexadecimal (base-16) values.
                    // %o: Used for formatting integers as octal (base-8) values.
                    // %e or %E: Used for formatting floating-point values in scientific notation.
                    // %n: Used to insert a newline character.
                // additional options to custumise these place holders

                // Refer this link: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Formatter.html#syntax
                    System.out.format("This is an %s and this is also an %s %n",s1,s2);
                        // or
                    String name = "Alice";
                    int age = 30;
                    String formattedString = String.format("Hello, my name is %s and I am %d years old.", name, age);
                    System.out.println(formattedString);

        // 15. getBytes() Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array

            try {
                byte[] b_array=s1.getBytes("unicode");
                for(byte b:b_array){
                    System.out.print(b+" ");
                }
                System.out.println();
            } catch (Exception e) {
            }

        // 16. getChars()
            /*The `getChars()` method in Java is used to extract a range of characters from a string and copy them into a destination character array. This method is a way to efficiently copy characters from a source string to a destination array without creating additional string objects.

            The syntax of the `getChars()` method is as follows:

            ```java
            public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
            ```

            - `srcBegin`: The index of the first character to copy from the source string.
            - `srcEnd`: The index of the character immediately following the last character to copy from the source string.
            - `dst`: The destination character array where the extracted characters will be copied.
            - `dstBegin`: The starting index in the destination array where the copied characters will be placed.

            Here's an example usage of the `getChars()` method:

            ```java */
            String source = "Hello, World!";    
            char[] destination = new char[source.length()];

            source.getChars(0, source.length(), destination, 0);

            System.out.println(destination);
            /*```

            In this example, the characters from index 0 to 4 of the `source` string ("Hello") are copied to the `destination` character array, starting from index 0. The output will be: `Hello`.

            Keep in mind that the `getChars()` method provides a way to efficiently copy a range of characters, but it's important to ensure that the destination character array is large enough to accommodate the copied characters.*/

        // 17. hashCode() Returns the hash code of a string
            System.out.println(s1.hashCode());
        
        // 18. indexOf() Returns the position of the first found occurrence of specified characters in a string
            System.out.println(s1.indexOf("l"));

        // 19. intern() Returns the canonical representation for the string object
            String str1 = new String("Hello");
            // String str1="Hello";
            String str2 = "Hello";
            String str3 = str1.intern(); // Retrieve the canonical representation
            
            System.out.println(str1 == str2); // false, different instances
            System.out.println(str2 == str3); // true, same instance from the pool

        // 20. isEmpty() Checks whether a string is empty or not
            String emptyString="";
            System.out.println(emptyString.isEmpty());


        // 20. lastIndexOf()
            System.out.println(s1.lastIndexOf("p"));


        // 21. length()

        // 22. matches()  
            // uses regular expression (regex)
           System.out.println(email.matches(regex)); 
                
        // 23. offsetByCodePoints()

        // 24. regionMatches()
        
        // 25. replace() it will replace all!

        // 26. replaceFirst() 
            String original = "apple apple orange apple";
            
            // Replace the first occurrence of "apple" with "banana"
            String modified = original.replaceFirst("apple", "banana");
            
            System.out.println("Original String: " + original);
            System.out.println("Modified String: " + modified);

        // 27. replaceAll() (Advanced Version of replace())
            // uses regular expression (regex)  
            String text = "The cat in the hat";
        
            // Replace all occurrences of "the" (case-insensitive) with "a"
            String modified1 = text.replaceAll("(?i)the", "a");
            
            System.out.println("Original Text: " + text);
            System.out.println("Modified Text: " + modified1);


        // 28. split() split a string into an array of substrings based on a specified delimiter
            
            // Basic split
                String text1 = "apple,banana,grape,orange";
                String[] fruits = text1.split(",");
                
                for (String fruit : fruits) {
                    System.out.println(fruit);
                }

            // Limited Split
                String text2 = "apple,banana,grape,orange";
                String[] fruits2 = text2.split(",", 2); // Limit to 2 splits
                
                for (String fruit : fruits2) {
                    System.out.println(fruit);
                }
            
            // Splitting on Multiple Delimiters:
                String text3 = "apple|banana;grape orange";
                String[] fruits3 = text3.split("[|; ]+");  // Note all the delimiters must be inside [] with + at the end!
                
                for (String fruit : fruits3) {
                    System.out.println(fruit);
                }  
        
        // 29. startsWith()
            // Basic use with a specified index
            System.out.println(s1.startsWith("l")); 

            // little advance
            String text4 = "Hello, World!";
        
            boolean startsWithComma = text4.startsWith(",", 5);
            
            System.out.println("Starts with comma at index 5: " + startsWithComma);

        // 30. subSequence() useful when you want to extract a specific portion of a string as a character sequence.

            // Basic Usage:
            String text5 = "Hello, World!";
            CharSequence subsequence = text5.subSequence(7, 12);
            System.out.println("Original String: " + text5);
            System.out.println("30.Subsequence: " + subsequence);

            // Using subSequence() with StringBuilder:

            StringBuilder sb = new StringBuilder("Java Programming");
            CharSequence subsequence1 = sb.subSequence(0, 4);
            System.out.println("Original StringBuilder: " + sb);
            System.out.println("Subsequence: " + subsequence1);

            // Converting subSequence to String:
            String text6 = "Hello, World!";
            CharSequence subsequence2 = text6.subSequence(0, 5);
            String subString = subsequence2.toString();
            System.out.println("Original String: " + text6);
            System.out.println("Subsequence: " + subString);

        // 31. substring() used to extract a portion of a string, returns string
            // same above three methods here as well
        
        // 32. toCharArray()
            String text7 = "Hello, World!";
            
            char[] charArray = text7.toCharArray();
            
            System.out.println("Original String: " + text7);
            System.out.print("Character Array: ");
            for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println(charArray.length);
        
        // 33. toLowerCase()
        // 34. toString()
        // 35. toUpperCase()
        // 36. trim() used to remove leading and trailing whitespace (spaces, tabs, and newlines) from a string
            String text8 = "    Hello, World!    ";
            String trimmed = text8.trim();
            
            System.out.println("Original String: '" + text8 + "'");
            System.out.println("Trimmed String: '" + trimmed + "'");
        // 37. valueOf()
        

        // The End

        // 
    }    
}