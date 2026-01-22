# Chapter 7

## Functions

Contents

- [What is a Function?](#what-is-a-function)
  - [Why use Functions?](#why-use-functions)
- [Passing Values between Functions](#passing-values-between-functions)
- [Summary](#summary)


## What is a Function?

A function (also called a method in Java) is a named block of code that does one small job. You can call the function when you need that job done. A function can take inputs and can return a result.

Simple idea:
- Give the function a name.
- Put the code for one task inside it.
- Call the function from other parts of the program when you need the task done.

Example (plain text):

```java
// A simple function that adds two numbers
static int add(int a, int b) {
    return a + b;
}

// Using the function
int result = add(2, 3); // result is 5
```


## Why use Functions?

Functions help make programs easier to read and use. Here are the main reasons in simple words:

- Reuse: Write the code once and call it many times.
- Readability: Small named functions are easier to understand than one long block of code.
- Testing: You can test one small function at a time.
- Organization: Functions help split a big problem into small steps.

Short example of benefits:
- Instead of copying the same code in many places, put it in a function and call it. If you need to change the code, change it in one place.


## Passing Values between Functions

Functions usually receive input values (called parameters) and may return an output value.

Basic rules:
- The caller provides values as arguments when calling the function.
- The function receives them as parameters and uses them inside its body.
- If the function returns a value, the caller can use that returned value.

Example (plain text):

```java
// Function with parameters and return value
static int multiply(int x, int y) {
    return x * y;
}

// Main usage
int product = multiply(4, 5); // product is 20
System.out.println(product);
```

Notes about Java specifics (simple):
- Use `static` for helper functions if you call them from `static main` without creating an object.
- Objects can also have methods that use and change object data.
- Primitive types (int, double, boolean) are passed by value (a copy is sent). Objects are passed by reference to the object (the reference is copied).


## Summary

- A function is a named block that does a single task.
- Functions make code reusable, readable, and easier to test.
- You pass values into functions using parameters and get results back with return values.
- Use small, well-named functions to break problems into simple steps.
