public class All_int_methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Basic arithmetic operations
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = b / a; // Integer Division
        int remainder = b % a; // Modulus (Remainder)

        // Increment and Decrement
        a++; // Increment a by 1
        b--; // Decrement b by 1

        // Comparison operators
        boolean isEqual = (a == b); // Equal to
        boolean isNotEqual = (a != b); // Not Equal to
        boolean isGreater = (a > b); // Greater than
        boolean isLess = (a < b); // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or Equal to
        boolean isLessOrEqual = (a <= b); // Less than or Equal to

        // Bitwise operations
        int bitwiseAnd = a & b; // Bitwise AND
        int bitwiseOr = a | b; // Bitwise OR
        int bitwiseXor = a ^ b; // Bitwise XOR
        int bitwiseNotA = ~a; // Bitwise NOT (Complement)
        int leftShift = a << 2; // Left Shift (a << 2)
        int rightShift = b >> 2; // Right Shift (b >> 2)

        // Math functions
        int absoluteValue = Math.abs(-10); // Absolute Value
        double squareRoot = Math.sqrt(16); // Square Root
        int power = (int) Math.pow(2, 3); // Exponentiation (2^3)

        // Type casting
        double doubleValue = 3.14;
        int intValue = (int) doubleValue; // Casting from double to int

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a less than b? " + isLess);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT of a: " + bitwiseNotA);
        System.out.println("Left Shift of a: " + leftShift);
        System.out.println("Right Shift of b: " + rightShift);
        System.out.println("Absolute Value: " + absoluteValue);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("2^3: " + power);
        System.out.println("Casting double to int: " + intValue);
    }
}