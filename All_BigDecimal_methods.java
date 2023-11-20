public class All_BigDecimal_methods {
    public static void main(String[] args) {
        /* The `BigDecimal` class in Java provides various methods for performing arithmetic operations, rounding, comparisons, conversions, and other operations on arbitrary-precision decimal numbers. Here's a list of some important methods available in the `BigDecimal` class:

            1. **Arithmetic Operations:**
            - `add(BigDecimal augend)`: Adds another `BigDecimal` to the current one.
            - `subtract(BigDecimal subtrahend)`: Subtracts another `BigDecimal` from the current one.
            - `multiply(BigDecimal multiplicand)`: Multiplies the current `BigDecimal` by another.
            - `divide(BigDecimal divisor)`: Divides the current `BigDecimal` by another.
            - `remainder(BigDecimal divisor)`: Computes the remainder after division by another.

            2. **Rounding and Scaling:**
            - `setScale(int newScale, RoundingMode roundingMode)`: Sets the scale and rounding mode.
            - `setScale(int newScale)`: Sets the scale without specifying the rounding mode.
            - `round(MathContext mc)`: Rounds the `BigDecimal` using the specified context.
            - `stripTrailingZeros()`: Removes trailing zeros.

            3. **Comparison Methods:**
            - `compareTo(BigDecimal val)`: Compares two `BigDecimal` objects.
            - `equals(Object x)`: Compares for equality with another object.
            - `signum()`: Returns -1, 0, or 1 representing the sign of the `BigDecimal`.

            4. **Conversion Methods:**
            - `toBigInteger()`, `toBigIntegerExact()`: Converts to a `BigInteger`.
            - `toPlainString()`: Converts to a plain string representation.
            - `doubleValue()`, `floatValue()`, `intValue()`, `longValue()`: Converts to primitive types.

            5. **Mathematical Functions:**
            - `abs()`: Returns the absolute value.
            - `pow(int exponent)`: Raises to the power of the given exponent.
            - `sqrt(MathContext mc)`: Computes the square root.

            6. **Formatting:**
            - `toString()`: Converts to a string representation using scientific notation.
            - `toEngineeringString()`: Converts to a string representation using engineering notation.

            7. **Other Operations:**
            - `min(BigDecimal val)`: Returns the smaller of two `BigDecimal` values.
            - `max(BigDecimal val)`: Returns the larger of two `BigDecimal` values.

            These are just some of the many methods available in the `BigDecimal` class. The `BigDecimal` class is especially useful when you need to perform precise arithmetic with decimal numbers, avoiding the limitations of floating-point representation.*/
    }
}