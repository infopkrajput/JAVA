# Chapter 2
## Getting Started

Contents:
- [Java Data Types](#java-data-types)
  - [Rules for constructing Constants](#rules-for-constructing-constants)
  - [Rules for constructing variable names](#rules-for-constructing-variable-names)
- [Java Keywords](#java-keywords)
- [The First Java Program](#the-first-java-program)
- [Compiling and Running a Java Program](#compiling-and-running-a-java-program)
- [Summary](#summary)

### Java Data Types

Java uses data types to tell the computer what kind of value a variable can hold. There are two main groups:

1. Primitive types (built-in small types):
   - byte: small integer number (-128 to 127)
   - short: small integer number
   - int: whole numbers (most common)
   - long: large whole numbers
   - float: decimal numbers with less precision
   - double: decimal numbers with more precision (common for decimals)
   - char: a single character like 'A' or '7'
   - boolean: true or false

2. Reference types:
   - Objects and arrays (like String, Integer, or Student). These store a reference (address) to the actual data.

Rules to remember:
- Choose the smallest type that fits your data (saves memory).
- Use `int` for most whole numbers and `double` for most decimals.

#### Rules for constructing Constants

Constants are values that do not change. In Java we use `final` to make a constant.

- Use `final` before the type: final int MAX = 100;
- By convention, constant names use all uppercase letters and underscores: MAX_VALUE, PI_VALUE
- Put constants at the top of a class so they are easy to find.

#### Rules for constructing variable names

Variable names must follow simple rules:
- Start with a letter, dollar sign `$`, or underscore `_` (but use letters for clarity).
- After the first character, you can use letters, digits, `$`, or `_`.
- Names are case-sensitive: `age` and `Age` are different.
- Do not use Java keywords as names (like `class`, `int`).
- Use meaningful names: `count`, `totalAmount`, `userName`.
- By convention, use lowerCamelCase for variable names and methods: `firstName`, `calculateTotal()`.

### Java Keywords

Keywords are words that have special meaning in Java. You cannot use them as names. Examples include:
- class, public, static, void, if, else, for, while, switch, case, break
- int, long, double, boolean, char
- new, return, this, super, extends, implements

There are about 50 keywords in Java. Learn the common ones first; they form the language's basic rules.

### The First Java Program

A simple first Java program prints text on the screen. The usual example is Hello World.

Example explained in simple steps:
- Every Java program has a class. The file name must match the public class name.
- The program starts at the `main` method: public static void main(String[] args)
- `System.out.println()` prints a line of text.

A simple program:

```java
public class HelloWorld {
    // 'public' for main is common, but in newer Java versions it may be optional.
    static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Save this in a file named `HelloWorld.java`. Then compile and run it as shown below.

### Compiling and Running a Java Program

Steps to compile and run from the command line:
1. Open a terminal in the folder with your .java file.
2. Compile with `javac FileName.java`. This creates `FileName.class` (bytecode).
3. Run with `java FileName` (do not add .class). The JVM runs the bytecode.

For example:

```bash
javac HelloWorld.java
java HelloWorld
```

Notes:
- If your class is inside a package, run it from the project root and include the package name.
- IDEs (IntelliJ, Eclipse, VS Code) do compile and run steps for you with a button.

### Summary

This chapter introduced the basics you need to start writing Java:
- Data types describe what kind of data you store.
- Use `final` for constants and follow naming rules for clarity.
- Keywords are reserved words you cannot use as names.
- A Java program needs a class and a `main` method to run.
- Use `javac` to compile and `java` to run the program.

With these basics you can write and run simple Java programs. Practice by changing the example and printing different messages.
