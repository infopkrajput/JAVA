# Chapter 6

## Case Control Instruction

Contents:

- [Decisions using switch](#decisions-using-switch)
    - [Tips and Traps](#tips-and-traps)
- [switch Versus if-else Ladder](#switch-versus-if-else-ladder)
- [Simple Example](#simple-example)


### Decisions using switch

The `switch` statement lets a program choose one of many actions based on the value of a single expression. It is useful when you have several possible values for the same variable.

Simple idea in very plain English:
- Evaluate a value once (for example, a number or a character).
- Compare it to a list of cases (each case is one possible value).
- If a matching case is found, run the code under that case.
- Optionally use `break` to stop after running a case.
- There can be a `default` case that runs when no other case matches.

When to use `switch`:
- You check the same variable for many different exact values.
- The choices are simple constants (numbers, chars, or strings in Java 7+).


#### Tips and Traps

Tips (good practices):
- Always use `break` after a case unless you intentionally want to "fall through" to the next case.
- Put `default` at the end to handle unexpected values.
- Keep case code short and readable. If it is long, call a method from the case.

Traps (common mistakes):
- Missing `break` causes fall-through: program continues into the next case and runs its code too. This can cause bugs if you did not want it.
- Using ranges or conditions (like `x > 10`) is not allowed directly in `case`. Use `if-else` for ranges.
- `switch` works with specific types: in Java these are `int`, `char`, `String` (since Java 7), and enums. Floating point types (float, double) are not allowed.


### switch Versus if-else Ladder

When to choose which:
- Use `switch` when you compare one variable to many fixed values. It is usually clearer and easier to read.
- Use `if-else` when you need ranges, complex conditions, or different variables.

Example comparison in words:
- `switch` reads like a menu: value 1 → do A; value 2 → do B; default → do C.
- `if-else` is better when you need tests like `x > 10`, `x == 5 && y < 10`, or other boolean logic.


### Simple Example

A short Java example (very small) showing `switch` use:

```text
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}
```

Note: If `break` lines are removed, the code will "fall through" and continue running the next cases.
