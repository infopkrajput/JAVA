# Chapter 5

## Loop Control Instruction

Loops let a program repeat the same action many times. Use loops when you want to do the same work again and again without writing the same code many times.

Contents:
- [The while Loop](#the-while-loop)
  - [Tips about while](#tips-about-while)
- [The for Loop](#the-for-loop)
  - [Partial for Loops](#partial-for-loops)
  - [Nesting of Loops](#nesting-of-loops)
  - [Multiple Initializations in the for Loop](#multiple-initializations-in-the-for-loop)
- [The do-while Loop](#the-do-while-loop)
- [The break Statement](#the-break-statement)
- [The continue Statement](#the-continue-statement)
- [Common Usage](#common-usage)
- [Summary](#summary)

---

### The while Loop

The `while` loop repeats a block of code as long as a condition is true. Check the condition first, then run the body.

Simple example:

```text
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++; // update so loop ends eventually
}
```

This prints 0 1 2 3 4 on separate lines.


#### Tips about while

- Always update the variable used in the condition, or the loop may never stop (infinite loop).
- If you must loop until input changes, use a `break` to exit when ready.
- Use `while(true)` carefully — it creates an infinite loop unless you `break` out.

Example of guarding against infinite loop:
```text
int i = 0;
while (i < 5) {
    // do work
    i++; // important: without this the loop never ends
}
```


### The for Loop

`for` is a compact loop for counting or when you know how many times to repeat. It has three parts: initialization, condition, and update.

Example:
```text
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
This prints the same as the `while` example above.


#### Partial for Loops

You can leave parts of the for header empty. This allows more flexible control.

Example (update inside body):
```text
int i = 0;
for (; i < 5; ) { // initialization and update moved outside
    System.out.println(i);
    i++;
}
```

Infinite loop example (use with care):
```text
for (;;) {
    // runs forever unless a break occurs
    break; // normally you would stop based on some condition
}
```


#### Nesting of Loops

Put one loop inside another. This is useful for tables or grids.

Example (print a 3x3 grid):
```text
for (int r = 1; r <= 3; r++) {
    for (int c = 1; c <= 3; c++) {
        System.out.print("(" + r + "," + c + ") ");
    }
    System.out.println();
}
```


#### Multiple Initializations in the for Loop

You can initialize more than one variable in the `for` header and update multiple values.

Example:
```text
for (int i = 0, j = 5; i < j; i++, j--) {
    System.out.println(i + ", " + j);
}
```


### The do-while Loop

`do-while` runs the loop body first, then checks the condition. This guarantees the body runs at least once.

Example:
```text
double answer;
do {
    // ask user for input (example only)
    answer = Math.random();
    System.out.println("Got: " + answer);
} while (answer < 0.9);
```

Use `do-while` when you need the loop body to run at least once (for example, show a menu and then repeat while the user asks).


### The break Statement

`break` immediately exits the innermost loop. Use it to stop early when you find what you need.

Example:
```text
for (int i = 0; i < 10; i++) {
    if (i == 3) break; // stop loop now
    System.out.println(i);
}
// prints 0 1 2
```


### The continue Statement

`continue` skips the rest of the loop body and starts the next iteration.

Example:
```text
for (int i = 0; i < 5; i++) {
    if (i == 2) continue; // skip printing 2
    System.out.println(i);
}
// prints 0 1 3 4
```


### Common Usage

Loops are used for:
- Repeating a fixed number of steps (counting loops).
- Iterating over arrays and lists.
- Reading input until end-of-file or until a stop value is entered.
- Searching (stop when you find the item with `break`).
- Building aggregated values (sums, averages).

Example: sum of array
```text
int[] a = {1,2,3,4};
int sum = 0;
for (int i = 0; i < a.length; i++) sum += a[i];
System.out.println("Sum = " + sum);
```


### Summary

- `while` checks first, then runs body.
- `for` is compact and great for counting.
- `do-while` runs body at least once.
- `break` stops a loop early; `continue` skips to next iteration.
- Always ensure loops will end (unless you really want an infinite loop).

Practice ideas:
- Write a program that reads numbers until 0 is entered and prints their sum.
- Print a multiplication table using nested loops.
- Find the first prime number greater than 100 using a loop and `break`.

---
