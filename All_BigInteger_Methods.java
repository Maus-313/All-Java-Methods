import java.math.BigInteger;

public class All_BigInteger_Methods{
    public static void main(String[] args) {
        /*The `BigInteger` class in Java provides a wide range of methods for performing arithmetic operations, comparisons, conversions, and other operations on large integers. Here's a list of some important methods available in the `BigInteger` class:

                1. **Arithmetic Operations:**
                    - `add(BigInteger val)`: Adds another `BigInteger` to the current one.
                    - `subtract(BigInteger val)`: Subtracts another `BigInteger` from the current one.
                    - `multiply(BigInteger val)`: Multiplies the current `BigInteger` by another.*/
                        BigInteger num1 = new BigInteger("123456789012345678901234567890");
                        BigInteger num2 = new BigInteger("98765432109876543210987654321");
                        BigInteger product = num1.multiply(num2);/*
                        
                    - `divide(BigInteger val)`: Divides the current `BigInteger` by another.
                    - `remainder(BigInteger val)`: Computes the remainder after division by another.

                2. **Bitwise Operations:**
                - `and(BigInteger val)`: Performs a bitwise AND operation.
                - `or(BigInteger val)`: Performs a bitwise OR operation.
                - `xor(BigInteger val)`: Performs a bitwise XOR operation.
                - `not()`: Performs a bitwise complement operation.

                3. **Comparison Methods:**
                - `compareTo(BigInteger val)`: Compares two `BigInteger` objects.
                - `equals(Object obj)`: Compares for equality with another object.
                - `isProbablePrime(int certainty)`: Tests probable primality.

                4. **Conversion Methods:**
                - `intValue()`, `longValue()`, `floatValue()`, `doubleValue()`: Converts to primitive types.
                - `toString()`: Converts to a string representation.
                - `toByteArray()`: Converts to a byte array.
                - `valueOf(long val)`: Converts a long to a `BigInteger`.

                5. **Other Operations:**
                - `abs()`: Returns the absolute value.
                - `negate()`: Negates the value.
                - `pow(int exponent)`: Raises to the power of the given exponent.
                - `gcd(BigInteger val)`: Computes the greatest common divisor.
                - `modPow(BigInteger exponent, BigInteger m)`: Computes modular exponentiation.

                These are just some of the many methods available in the `BigInteger` class. Keep in mind that `BigInteger` objects are immutable, so operations on them return new `BigInteger` objects rather than modifying the original object. */
    }
}