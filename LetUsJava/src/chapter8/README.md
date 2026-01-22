# Chapter 8 — Advanced Features of Functions

Contents

- [Function Overloading](#function-overloading)
- [Functions with Variable Number of Arguments](#functions-with-variable-number-of-arguments)
- [Recursion](#recursion)
- [Summary](#summary)
- [Exercises](#exercises)


## Function Overloading

Function overloading means having more than one function with the same name but different parameters (different number or types of parameters). The program chooses the right function based on the arguments you pass.

Why use it:
- Makes code easier to read: same name for similar actions.
- Lets you write several small functions for different input types.

Plain example (text):

```java
// Two methods with same name but different parameters
static int add(int a, int b) { return a + b; }
static double add(double a, double b) { return a + b; }

// Calls
int s1 = add(2, 3);       // calls the first
double s2 = add(2.5, 3.0); // calls the second
```

Tips:
- Return type alone is NOT enough to overload a method; parameters must differ.
- Keep overloaded methods doing similar tasks to avoid confusion.


## Functions with Variable Number of Arguments (Varargs)

Sometimes you want a function that accepts any number of arguments. In Java you can use varargs (e.g., `int... nums`). Inside the method, the vararg acts like an array.

Plain example (text):

```java
// Sum any number of integers
static int sum(int... nums) {
    int s = 0;
    for (int n : nums) s += n;
    return s;
}

// Calls
int a = sum(1, 2, 3); // 6
int b = sum(4, 5);    // 9
int c = sum();        // 0
```

Notes:
- Varargs must be the last parameter if you have other parameters.
- Inside the function, treat the vararg as an array (e.g., `nums.length`).


## Recursion

Recursion is when a function calls itself. Use recursion to break a problem into smaller subproblems. Every recursive function should have a base case to stop calling itself.

Plain example (text):

```java
// Factorial using recursion
static int fact(int n) {
    if (n <= 1) return 1; // base case
    return n * fact(n - 1); // recursive call
}

// Call
int f = fact(5); // 120
```

When to use recursion:
- Natural fit for problems that divide into similar subproblems (trees, some mathematical formulas, backtracking).

Caution:
- Recursion uses call stack memory. Deep recursion can cause stack overflow.
- For very deep or simple numeric tasks, an iterative solution may be better.


## Summary

- Function overloading: same name, different parameter lists.
- Varargs: let a function accept any number of arguments (treated as an array inside).
- Recursion: a function calls itself; must have a base case to stop.

