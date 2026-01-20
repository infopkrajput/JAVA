# _01_Data_Types

Short definition

This chapter covers Java primitive and basic reference types, how to operate on them, and common pitfalls (casting, overflow, string handling).

Key concepts

- Primitive types: byte, short, int, long, float, double, char, boolean
- Widening vs narrowing conversions and casting
- Integer overflow and safe arithmetic
- Strings and common String API methods (length, substring, equals, format)
- Autoboxing/unboxing and differences between primitive and wrapper types

Runnable example (save as DataTypesExample.java and run from project root with javac/java)

```java
package com.pk.completejava._01_Data_Types;

public class DataTypesExample {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        double res = a / b; // integer promoted to double
        System.out.println("10 / 3.0 = " + res);

        int large = Integer.MAX_VALUE;
        System.out.println("overflow example: " + (large + 1));

        String s = "Hello" + " World";
        System.out.println(s.toUpperCase());
    }
}
```

Files in this chapter (open to view code)

- src/com/pk/completejava/_01_Data_Types/Arithmetic.java
- src/com/pk/completejava/_01_Data_Types/Bitwise.java
- src/com/pk/completejava/_01_Data_Types/DataTypes.java
- src/com/pk/completejava/_01_Data_Types/Logical.java
- src/com/pk/completejava/_01_Data_Types/Relational.java
- src/com/pk/completejava/_01_Data_Types/string.java

Suggested exercises

1. Write a method to safely add two ints returning a long to avoid overflow.
2. Compare String equality using `==` and `equals()` and explain the difference.
3. Implement a small parser that converts a numeric string to int without using Integer.parseInt.

Notes

- Keep examples small and focused; each Java file should demonstrate one distinct concept.
- If you add new example files, add a short header comment describing the learning objective.
