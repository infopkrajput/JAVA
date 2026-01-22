# Chapter 3

## Java Data Types and Instructions

Contents:
- [Data Types Revisited](#data-types-revisited)
  - [Integer Types](#integer-types)
  - [Real Types](#real-types)
  - [char Data Type](#char-data-type)
  - [boolean Data Type](#boolean-data-type)
- [Receiving Input](#receiving-input)
  - [Command-line Arguments](#command-line-arguments)
- [Java Instructions](#java-instructions)
  - [Type Declaration Instruction](#type-declaration-instruction)
  - [Arithmetic Instruction](#arithmetic-instruction)
  - [Type Conversion in Arithmetic Instruction](#type-conversion-in-arithmetic-instruction)
  - [Explicit Conversion](#explicit-conversion)
  - [Hierarchy of Operations](#hierarchy-of-operations)
  - [Associativity of Operators](#associativity-of-operators)
- [Constant Variables](#constant-variables)
- [Console Output in Java](#console-output-in-java)
  - [println() and print()](#println-and-print)
  - [format() and printf() Functions](#format-and-printf-functions)
- [Control Instructions in Java](#control-instructions-in-java)
- [Summary](#summary)

### Data Types Revisited

Java has two broad kinds of types:
- Primitive types: hold simple values directly (int, double, char, boolean, etc.).
- Reference types: hold references to objects or arrays (for example String, arrays).

We focus on the common primitive types below.

#### Integer Types

Integer types store whole numbers (no decimal part):
- byte: very small range, rarely used.
- short: small range, rarely used.
- int: the normal choice for whole numbers.
- long: for very large whole numbers (use `L` suffix for literals, e.g., 100L).

Example:
```java
int age = 25;
long population = 7800000000L;
```

Use `int` unless you know you need `long`.

#### Real Types

Real (floating-point) types store decimal numbers:
- float: single precision (use suffix `f`, e.g., 3.14f).
- double: double precision, the common choice for decimals.

Example:
```java
double price = 9.99;
float weight = 2.5f;
```

Prefer `double` for most calculations.

#### char Data Type

`char` stores a single character and uses single quotes.
Example:
```java
char letter = 'A';
char digit = '7';
```
`char` is backed by a Unicode number, so it can be used in small numeric operations.

#### boolean Data Type

`boolean` stores `true` or `false`.
Example:
```java
boolean isOpen = true;
```
Use booleans for conditions and tests.

### Receiving Input

You can get input from the user in different ways. The two common methods are console input (Scanner) and command-line arguments.

#### Command-line Arguments

When you run a program with extra words after the class name, those words become `String[] args` inside `main`.

Example:
```java
public static void main(String[] args) {
    if (args.length > 0) {
        System.out.println("First argument: " + args[0]);
    } else {
        System.out.println("No arguments provided.");
    }
}
```
Run with: `java MyProgram hello world` — `args[0]` is "hello".

(Scanner console input examples appear later in Chapter 4 and example files.)

### Java Instructions

An instruction or statement tells the computer to do something. Most statements end with a semicolon `;`.

#### Type Declaration Instruction

To declare a variable: write the type then the name. You can also initialize it.

Example:
```java
int count;        // declaration
int total = 0;    // declaration + initialization
```

#### Arithmetic Instruction

Use operators to do math: `+ - * / %`.

Example:
```java
int a = 10, b = 3;
int sum = a + b;     // 13
int diff = a - b;    // 7
int prod = a * b;    // 30
int quot = a / b;    // 3 (integer division)
int rem = a % b;     // 1 (remainder)
```

#### Type Conversion in Arithmetic Instruction

When you mix types, Java converts the smaller type to the larger one automatically.
- byte/short/char promote to int in arithmetic.
- int mixed with double -> int is converted to double.

Example:
```java
int a = 5;
double b = 2.5;
double result = a + b; // a becomes 5.0, result is 7.5
```

#### Explicit Conversion

You can force a conversion using a cast. This can lose data.

Example:
```java
double d = 9.7;
int i = (int) d; // i = 9, fractional part lost
```
Be careful when casting: you might lose precision or overflow.

#### Hierarchy of Operations

Operators have priority (precedence). Common order (high to low):
1. Parentheses `()` — do these first
2. Unary `+` and `-` (like `-x`)
3. `*`, `/`, `%`
4. `+`, `-`
5. Comparison `<`, `>`, `<=`, `>=`
6. Equality `==`, `!=`
7. Logical `&&` then `||`

Use parentheses to make your intentions clear.

#### Associativity of Operators

If operators have the same precedence, associativity decides the order:
- Most binary operators: left-to-right (e.g., `a - b - c` means `(a - b) - c`).
- Assignment: right-to-left (`a = b = 5` sets `b` to 5 then `a` to `b`).

### Constant Variables

Use `final` to make a constant (value cannot change).

Example:
```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```
By convention constants use uppercase letters and underscores.

### Console Output in Java

Printing text and values is done with `System.out`.

#### println() and print()

- `System.out.println(x)` prints `x` and moves to a new line.
- `System.out.print(x)` prints `x` without a newline.

Example:
```java
System.out.print("Name: ");
System.out.println("Bob");
```

#### format() and printf() Functions

`format` or `printf` prints formatted text. Use format specifiers like `%.2f` for two decimal places.

Example:
```java
double price = 12.5;
System.out.printf("Price: %.2f\n", price); // prints: Price: 12.50
```

### Control Instructions in Java

Control statements let a program choose or repeat actions.

- if / else: choose between two paths.
```java
if (x > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Zero or negative");
}
```

- switch: choose among many constant cases.

- for loop: repeat a set number of times.
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

- while loop: repeat while a condition is true.
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

- do-while loop: run body once, then repeat while condition true.

- break and continue: change normal loop flow (`break` exits loop, `continue` skips to next iteration).

### Summary

This chapter covered the important Java types and basic instructions you need to write small programs. You learned:
- Integer, real, char, and boolean types.
- How Java converts types during arithmetic and how to cast.
- Operator precedence and associativity.
- Constants and how to print using `println` and `printf`.
- How to get simple input via command-line arguments and how to control program flow with `if`, loops, and `switch`.

Practice ideas:
- Write a program that reads two numbers and prints their sum and average.
- Try mixing `int` and `double` to see how results change.
- Write a loop that prints the first 10 squares.
