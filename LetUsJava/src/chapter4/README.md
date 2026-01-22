# Chapter 4

## Decision Control Instruction

Contents:
- [Decisions! Decisions! The if-else Statement](#decisions-decisions-the-if-else-statement)
- [More Complex Decision Making / The else if Clause](#more-complex-decision-making--the-else-if-clause)
- [The & and | Operators](#the--and--operators)
- [The ! Operator](#the--operator)
- [Hierarchy of Operators Revisited](#hierarchy-of-operators-revisited)
- [A Word of Caution](#a-word-of-caution)
- [The Conditional Operator (?:)](#the-conditional-operator-)

### Decisions! Decisions! The if-else Statement

The `if` statement makes a decision. If the condition is true, the program runs one block of code. If it is false, the program can run another block with `else`.

Example:
```text
int x = 10;
if (x > 0) {
    System.out.println("x is positive");
} else {
    System.out.println("x is zero or negative");
}
```

Use `if` when you want to pick between two choices.

### More Complex Decision Making / The else if Clause

When you have more than two choices, use `else if` between `if` and `else`. Java checks each condition in order and runs the first true branch.

Example:
```text
int score = 75;
if (score >= 90) {
    System.out.println("A grade");
} else if (score >= 75) {
    System.out.println("B grade");
} else if (score >= 60) {
    System.out.println("C grade");
} else {
    System.out.println("Failing grade");
}
```

Only the first matching `if`/`else if` block runs.

### The & and | Operators

There are two related sets of operators that look similar but behave differently:
- Single `&` and single `|` have two uses:
  - Bitwise operators when used with integer types (they work on bits).
  - Logical (non-short-circuit) operators when used with boolean values: both sides are evaluated.
- Double `&&` and `||` are logical short-circuit operators (recommended for boolean tests):
  - `&&` stops and returns false as soon as one side is false.
  - `||` stops and returns true as soon as one side is true.

Examples:
```text
int a = 6;   // binary 110
int b = 3;   // binary 011
int r = a & b; // bitwise AND -> 010 (2)

boolean p = false;
boolean q = true;
boolean r1 = p & q;   // both p and q evaluated -> false
boolean r2 = p && q;  // p false, q not evaluated -> false (short-circuit)
```

Use `&&` and `||` for normal boolean conditions because they avoid running unnecessary code and are clearer.

### The ! Operator

`!` is the NOT (negation) operator. It flips a boolean value: `true` becomes `false`, and `false` becomes `true`.

Example:
```text
boolean ok = false;
if (!ok) {
    System.out.println("Not OK");
}
```

Use `!` to test the opposite of a condition.

### Hierarchy of Operators Revisited

When an expression has many operators, Java uses precedence (order) to decide what to do first. Important points:
- Parentheses `()` first.
- Unary operators like `!`, unary `-` next.
- Multiplicative `* / %` then additive `+ -`.
- Comparison `< > <= >=` then equality `== !=`.
- Logical `&&` then `||`.

If unsure, add parentheses to make the order clear.

Example:
```text
boolean result = (a > 0) && (b < 5) || c == 10; // parentheses help readability
```

### A Word of Caution

A few common mistakes to watch for:
- Use `==` to compare primitives (numbers, booleans). Do not use `=` in a condition — `=` assigns a value and is not allowed where a boolean is needed.
- To compare `String` values, use `.equals()` not `==`.
  Example: `if (s.equals("hello"))`.
- Be careful with single `&` and `|` in boolean expressions — they evaluate both sides and can cause side effects if the right side changes state or causes errors.
- Avoid very deep nested `if` blocks; prefer breaking logic into methods for clarity.

### The Conditional Operator (?:)

Java has a compact conditional operator `?:` (sometimes called the ternary operator). It chooses one of two values based on a condition.

Syntax:
```
condition ? valueIfTrue : valueIfFalse
```

Example:
```text
int x = 5;
String sign = (x >= 0) ? "non-negative" : "negative";
System.out.println(sign); // prints "non-negative"
```

Use the ternary operator for short decisions that pick a value. For complex actions, prefer `if`/`else`.

### Summary

- `if`, `else if`, and `else` let programs make decisions.
- Prefer `&&` and `||` for boolean logic (short-circuiting).
- `!` negates a boolean.
- Watch operator precedence; use parentheses to avoid mistakes.
- Use `.equals()` for String comparison and `final` small, clear conditions to avoid bugs.