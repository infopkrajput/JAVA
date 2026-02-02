# Chapter 12

## Strings and Enums

Contents:

- [What are Strings](#what-are-strings)
- [More about Strings](#more-about-strings)
- [Splitting Strings](#splitting-strings)
- [StringBuilder Class](#stringbuilder-class)
- [Array of Strings](#array-of-strings)
- [Sorting Strings](#sorting-strings)
- [Enumerations](#enumerations)
- [Use of Enumerated Data Type](#use-of-enumerated-data-type)
- [Summary](#summary)


### What are Strings

A String is a sequence of characters used to store text. In Java, `String` is a built-in class. Strings are used everywhere: names, messages, file paths, etc.

Simple example (plain text):

```java
String s = "Hello";
String name = "Alice";
System.out.println(s + ", " + name + "!"); // prints Hello, Alice!
```

Notes:
- Strings are objects in Java but they can be used like plain text values.
- Java Strings are immutable: once created, their content cannot change. Methods that look like they change a String actually create a new String object.


### More about Strings

Common useful operations (plain text):

```java
s.length();        // number of characters
s.charAt(0);       // first character
s.substring(1,4);  // part of the string from index 1 to 3
s.indexOf('a');    // index of first 'a' or -1 if not found
s.equals("abc"); // compare content
s.equalsIgnoreCase("AbC"); // compare ignoring case
s.toUpperCase();   // returns a new upper-case string
s.trim();          // remove leading/trailing spaces
```

Equality: use `equals()` to compare strings for content. `==` checks reference identity (same object), not text equality.


### Splitting Strings

Use `split()` to break a string into parts using a delimiter.

```java
String line = "apple,banana,orange";
String[] parts = line.split(",");
// parts = ["apple", "banana", "orange"]
```

Be careful: `split` accepts a regular expression (so escape special chars like `.` or `|`).


### StringBuilder Class

`StringBuilder` is a mutable sequence of characters. Use it when you need to build or modify strings frequently (faster and avoids many temporary String objects).

Plain example (text):

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(' ');
sb.append("World");
String result = sb.toString(); // "Hello World"
sb.insert(5, ",");
sb.reverse();
```

Use `StringBuilder` for loops that concatenate many pieces of text.


### Array of Strings

You can store many strings in an array.

```java
String[] names = {"Alice", "Bob", "Charlie"};
System.out.println(names[1]); // Bob
```

Pass arrays of strings to functions, return them, or use them with collections like `ArrayList<String>`.


### Sorting Strings

Use `Arrays.sort()` to sort an array of strings alphabetically (lexicographically).

```java
String[] arr = {"banana", "apple", "pear"};
Arrays.sort(arr);
// arr becomes ["apple", "banana", "pear"]
```

`compareTo()` compares two strings lexicographically; it returns negative, zero, or positive.


### Enumerations

An `enum` defines a set of named constants. Enums give readable names to fixed sets of values.

Plain example (text):

```java
enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

Day d = Day.MON;
if (d == Day.SAT) { ... }
```

Enums can have fields, constructors, and methods — they are full Java types.


### Use of Enumerated Data Type

Common uses:
- Replace integer constants with meaningful names (safer and clearer).
- Use in `switch` statements:

```java
switch (d) {
  case MON: ...; break;
  case TUE: ...; break;
}
```

- `values()` returns all enum constants, `ordinal()` gives the position.


### Summary

- Strings store text; use `length`, `charAt`, `substring`, `equals` for common actions.
- `split()` divides a string into parts; remember it uses regular expressions.
- Use `StringBuilder` for efficient mutable string building.
- Arrays of strings are simple to use and can be sorted with `Arrays.sort()`.
- Enums provide named constant sets and are safer than raw integers.
